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
import model.Job;

/**
 *
 * @author TASS
 */
public class EmployeeDAO extends DBContext {

    public List<Employee> getAll() {
        List<Employee> results = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        StringBuilder sql = new StringBuilder("SELECT * FROM Employee");
        try {
            statement = connection.prepareStatement(sql.toString());
            //set Parameter ()
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getString("ID"));
                employee.setFullName(resultSet.getString("FullName"));
                //date
                //city
                results.add(employee);
            }
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                //close all connection
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

    }
}
