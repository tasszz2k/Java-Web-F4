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
import model.Category;

/**
 *
 * @author TASS
 */
public class CategoryDAO extends DBContext {

    public ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<>();
        String sql = "SELECT ID, name, describe\n"
                + "FROM dbo.Categories";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setId(rs.getString("ID"));
                c.setName(rs.getString("name"));
                c.setDescrible(rs.getString("describe"));
                categories.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
}
