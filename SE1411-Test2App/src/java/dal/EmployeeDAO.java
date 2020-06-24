/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import model.Skill;

/**
 *
 * @author TASS
 */
public class EmployeeDAO extends DBContext {

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "select id, name from Employee";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                employees.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SkillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }

    public void insertEmployee(Employee e) {

        try {
            connection.setAutoCommit(false);
            //insert into Employee
            String sql1 = "INSERT INTO [dbo].[Employee]\n"
                    + "           ([id]\n"
                    + "           ,[name])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?);";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            st1.setInt(1, e.getId());
            st1.setString(2, e.getName());
            st1.executeUpdate();

            //insert vao bang Employee_Skill - multi - rows
            String sql2 = "insert into Employee_Skill values(?,?)";
            PreparedStatement st2 = connection.prepareStatement(sql2);
            for (Skill i : e.getSkills()) {
                st2.setInt(1, i.getId());
                st2.setInt(2, e.getId());
                st2.executeUpdate();
            }

            //thuc thi transaction
            connection.commit();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
