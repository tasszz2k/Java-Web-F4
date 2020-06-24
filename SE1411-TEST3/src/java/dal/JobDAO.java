/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Job;

/**
 *
 * @author TASS
 */
public class JobDAO extends DBContext {

    public int save(Job job) {
        StringBuilder sql = new StringBuilder("INSERT [dbo].[Jobs] ([name],[salary],[datecreated],[activated]) "
                + "VALUES (?,?,?,?)");
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        int id = -1;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql.toString(), statement.RETURN_GENERATED_KEYS);
//            setParameter(statement, parameters);
            statement.setString(1, job.getName());
            statement.setDouble(2, job.getSalary());
            statement.setDate(3, job.getDateCreated());
            statement.setBoolean(4, job.isActivated());

            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            connection.commit();
            return id;
        } catch (SQLException ex) {
            try {
                Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
                connection.rollback();
                return -1;
            } catch (SQLException ex1) {
                Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex1);
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
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
        }
        return -1;
    }

    public List<Job> getAll() {
        List<Job> results = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        StringBuilder sql = new StringBuilder("SELECT * FROM Jobs");
        try {
            statement = connection.prepareStatement(sql.toString());
            //set Parameter ()
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Job job = new Job();
                job.setId(resultSet.getInt("ID"));
                job.setName(resultSet.getString("Name"));
                job.setSalary(resultSet.getDouble("Salary"));
                job.setDateCreated(resultSet.getDate("Datecreated"));
                job.setActivated(resultSet.getBoolean("activated"));
                results.add(job);
            }
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

    }
    
    public Job getJobById(int id){
        List<Job> results = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        StringBuilder sql = new StringBuilder("SELECT * FROM Jobs WHERE id=?");
        try {
            statement = connection.prepareStatement(sql.toString());
            //set Parameter ()
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Job job = new Job();
                job.setId(resultSet.getInt("ID"));
                job.setName(resultSet.getString("Name"));
                job.setSalary(resultSet.getDouble("Salary"));
                job.setDateCreated(resultSet.getDate("Datecreated"));
                job.setActivated(resultSet.getBoolean("activated"));
                results.add(job);
            }
            return results.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(JobDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

    }
    
}
