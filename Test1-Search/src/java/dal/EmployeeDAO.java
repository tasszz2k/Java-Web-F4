/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Department;
import model.Employee;

/**
 *
 * @author TASS
 */
public class EmployeeDAO extends DBContext {

    public List<Employee> getEmployees(int id, String name, int gender, String department, Date dobFrom, Date dobTo) {

        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT Employee.id,\n"
                + "	   Employee.name,\n"
                + "	   gender,\n"
                + "	   dob,\n"
                + "	   Department.name,\n"
                + "	   did\n"
                + "FROM dbo.Employee\n"
                + "	INNER JOIN dbo.Department ON Department.id = Employee.did\n"
                + "WHERE Employee.name LIKE ?\n";

        try {
            int iID = 1, iGender = 1, iDepartment = 1, iDOBFrom = 1, iDOBTo = 1;
            if (id >= 0) {
                System.out.println("1111");
                sql += "AND Employee.id = ? \n";
                iID += 1;
            }
            if (gender == 0 || gender == 1) {
                System.out.println("2222");
                sql += "AND gender = ?\n";
                iGender = iID + 1;

            }
            if (!department.isEmpty()) {
                System.out.println("333");
                sql += "AND Department.name = ?\n";
                iDepartment = iGender + 1;
            }
            if (dobFrom != null) {
                sql += "AND dob >= ?\n";
                iDOBFrom = iDepartment + 1;

            }
            if (dobTo != null) {
                sql += "AND dob <= ?\n";
                iDOBTo = iDOBFrom + 1;
            }
            //======//
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + name + "%");
            if (id >= 0) {
                statement.setInt(iID, id);
            }
            if (gender == 0 || gender == 1) {
                System.out.println("iGender: " + iGender);
                if (gender == 0) {
                    statement.setBoolean(iGender, false);
                } else {
                    statement.setBoolean(iGender, true);
                }
            }
            if (!department.isEmpty()) {
                statement.setString(iDepartment, department);
            }
            if (dobFrom != null) {
                statement.setDate(iDOBFrom, dobFrom);
            }
            if (dobTo != null) {
                statement.setDate(iDOBTo, dobTo);
            }

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getBoolean("gender"));
                e.setDob(rs.getDate("dob"));
                e.setDid(rs.getInt("did"));

                employees.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }

    public Employee getEmployeeById(int id) {

        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT Employee.id,\n"
                + "	   Employee.name,\n"
                + "	   gender,\n"
                + "	   dob,\n"
                + "	   Department.name,\n"
                + "	   did\n"
                + "FROM dbo.Employee\n"
                + "	INNER JOIN dbo.Department ON Department.id = Employee.did\n";

        try {
            if (id >= 0) {
                sql += " WHERE Employee.id = ? \n";
            }

            //======//
            PreparedStatement statement = connection.prepareStatement(sql);
            if (id >= 0) {
                statement.setInt(1, id);
            }

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getBoolean("gender"));
                e.setDob(rs.getDate("dob"));
                e.setDid(rs.getInt("did"));
                return e;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean insertNewEmployee(Employee e) {

        String sql = "INSERT INTO [dbo].[Employee]\n"
                + "           ([id]\n"
                + "           ,[name]\n"
                + "           ,[dob]\n"
                + "           ,[gender]\n"
                + "           ,[did])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?);";

        try {
            //======//
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, e.getId());
            statement.setString(2, e.getName());
            statement.setDate(3, e.getDob());
            statement.setBoolean(4, e.isGender());
            statement.setInt(5, e.getDid());

            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateEmployee(Employee e) {

        String sql = "UPDATE [dbo].[Employee]\n"
                + "   SET [name] = ?\n"
                + "      ,[dob] = ?\n"
                + "      ,[gender] = ?\n"
                + "      ,[did] = ?\n"
                + " WHERE id = ?";

        try {
            //======//
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, e.getName());
            statement.setDate(2, e.getDob());
            statement.setBoolean(3, e.isGender());
            statement.setInt(4, e.getDid());
            statement.setInt(5, e.getId());

            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteEmployeeById(int id) {
        String sql = "DELETE FROM [dbo].[Employee]\n"
                + "      WHERE id = ?";

        try {
            //======//
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeDAO edb = new EmployeeDAO();
        DepartmentDAO ddb = new DepartmentDAO();
//        List<Employee> le = edb.getEmployees(-1, "", -1, "", null, new Date(1999, 01, 01));
//        List<Department> ld = ddb.getDepartments();
//        for (Employee employee : le) {
//            System.out.println(ddb.getNameById(ld, employee.getDid()));
//            System.out.println(employee.toString() + ", ");
//        }

        Employee e = edb.getEmployeeById(-1);
        System.out.println(e.toString());
//        System.out.println(edb.insertNewEmployee(new Employee(101, e.getName(), e.getDob(), false, 1)));
        edb.updateEmployee(new Employee(101, e.getName(), e.getDob(), true, 1));
    }
}
