/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TASS
 */
public class User {

    private String account, password;
    private Connection cnn;
    private Statement stm;
    private ResultSet rs;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
        try {
            cnn = new DBContext().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkValidLogin() {

        try {
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String strSelect = "select Username, Password from Admin\n"
                    + "where Username = '" + account + "' and Password = '" + password + "'";
            rs = stm.executeQuery(strSelect);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkExistAccount() {
        try {
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String strSelect = "select Username from Admin\n"
                    + "where Username = '" + account + "'";
            rs = stm.executeQuery(strSelect);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        User u = new User("b", "a");
        System.out.println(u.checkValidLogin());
        System.out.println(u.checkExistAccount());
    }
}
