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
import model.Admin;

/**
 *
 * @author TASS
 */
public class AdminDAO extends DBContext {

//    public Admin getAccount(String username, String password) {
//        String sql = "SELECT * from Admin \n"
//                + "WHERE Username = ? and Password = ?";
//        try {
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, username);
//            statement.setString(2, password);
//            ResultSet rs = statement.executeQuery();
//            if (rs.next()) {
//                return new Admin(username, password, rs.getString(3));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        return null;
//    }
//
//    public ArrayList<Admin> getListAccount() {
//        String sql = "SELECT * from Admin \n";
//        ArrayList<Admin> la = new ArrayList<>();
//        try {
//            PreparedStatement statement = connection.prepareStatement(sql);
//            ResultSet rs = statement.executeQuery();
//            while (rs.next()) {
//                Admin a = new Admin(rs.getString(1), rs.getString(2), "");
//                la.add(a);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        return la;
//    }
//
//    public static void main(String[] args) {
//        AdminDAO adb = new AdminDAO();
//        Admin admin = adb.getAccount("sa", "12345");
//        System.out.println(admin.toString());
//       ArrayList<Admin> la =adb.getListAccount();
//        for (int i = 0; i < la.size(); i++) {
//            System.out.println(la.get(i).toString());
//            
//        }
//    }

}
