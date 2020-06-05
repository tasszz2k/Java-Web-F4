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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author TASS
 */
public class ProductDAO extends DBContext {

    public ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        String sql = "SELECT ID,name,cat_ID,image,price,quantity,describe,status,adddate\n"
                + "FROM dbo.products;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString(1));
                p.setName(rs.getString(2));
                p.setCatId(rs.getString(3));
                p.setImage(rs.getString(4));
                p.setPrice(rs.getDouble(5));
                p.setQuantity(rs.getInt(6));
                p.setDescribe(rs.getString(7));
                p.setStatus(rs.getString(8));
                p.setAddDate(rs.getDate(9));
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public ArrayList<Product> getProductsByPage(ArrayList<Product> products, int start, int end) {
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(products.get(i));
        }
        return arr;

    }

//    public static void main(String[] args) {
//        ArrayList<Product> lp = new ProductDAO().getProducts();
//        for (int i = 0; i < lp.size(); i++) {
//            System.out.println(lp.get(i).toString());
//
//        }
//    }
}
