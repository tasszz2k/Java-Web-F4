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

/**
 *
 * @author TASS
 */
public class EmployeeJobDAO extends DBContext {

    public boolean checkEmployeeJob(String employeeId, int jobId) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        StringBuilder sql = new StringBuilder("SELECT * FROM JobEmployee\n"
                + "WHERE Empid=? AND Jobid=?");
        try {
            statement = connection.prepareStatement(sql.toString());
            //set Parameter ()
            statement.setString(1, employeeId);
            statement.setInt(2, jobId);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public void insert(String employeeId, int jobId) {
        StringBuilder sql = new StringBuilder("insert into JobEmployee(Empid,Jobid) values(?,?)");
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql.toString());
//            setParameter(statement, parameters);
            statement.setString(1, employeeId);
            statement.setInt(2, jobId);

            statement.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            try {
                Logger.getLogger(EmployeeJobDAO.class.getName()).log(Level.SEVERE, null, ex);
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(EmployeeJobDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                //close all connection
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(EmployeeJobDAO.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    public static void main(String[] args) {
        EmployeeJobDAO db = new EmployeeJobDAO();
        System.out.println(db.checkEmployeeJob("EMP02", 2));
        db.insert("EMP03", 1);
    }
}
