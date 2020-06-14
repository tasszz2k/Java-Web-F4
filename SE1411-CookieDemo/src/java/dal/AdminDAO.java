/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;

/**
 *
 * @author TASS
 */
public class AdminDAO extends DBContext {

    public Admin getAccount(String username, String password) {
        String sql = "SELECT * from Admin \n"
                + "WHERE Username = ? and Password = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return new Admin(username, password, rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void main(String[] args) {
        AdminDAO adb = new AdminDAO();
        Admin admin = adb.getAccount("sa", "12345");
        System.out.println(admin.toString());
    }

}
