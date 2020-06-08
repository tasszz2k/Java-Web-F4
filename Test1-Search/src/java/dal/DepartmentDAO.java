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
import model.Department;

/**
 *
 * @author TASS
 */
public class DepartmentDAO extends DBContext {

    public List<Department> getDepartments() {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT id, name FROM dbo.Department";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Department d = new Department();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                departments.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departments;
    }

    public String getNameById(List<Department> ld, int id) {
        for (Department department : ld) {
            if (department.getId() == id) {
                return department.getName();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DepartmentDAO ddb = new DepartmentDAO();
        List<Department> ld = ddb.getDepartments();
        for (Department department : ld) {
            System.out.println(department.toString());
        }
    }
}
