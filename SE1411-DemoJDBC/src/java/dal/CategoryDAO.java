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

    public boolean isExsitedCategory(String id) {
        String sql = "SELECT * FROM dbo.Categories WHERE id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public void insert(Category c) {
        String sql = "INSERT INTO Categories\n"
                + "VALUES\n"
                + "(?, ?, ?);";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, c.getId());
            statement.setString(2, c.getName());
            statement.setString(3, c.getDescribe());
            statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(String id) {
        String sql = "DELETE FROM dbo.Categories WHERE id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Category getCategoryById(String id) {
        String sql = "SELECT * FROM dbo.Categories WHERE id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return new Category(rs.getString("id"), rs.getString("name"), rs.getString("describe"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void update(Category c) {
        String sql = "UPDATE dbo.Categories SET name = ?, describe =?\n"
                    + "WHERE ID=?";
        try {      
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, c.getName());
            statement.setString(2, c.getDescribe());
            statement.setString(3, c.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
