/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import java.util.ArrayList;
import model.Category;

/**
 *
 * @author TASS
 */
public class Main {
    public static void main(String[] args) {
        CategoryDAO db = new CategoryDAO();
        ArrayList<Category> lc = db.getCategories();
        
        for (int i = 0; i < lc.size(); i++) {
            System.out.println(lc.get(i).toString());
            
        }
    }
}
