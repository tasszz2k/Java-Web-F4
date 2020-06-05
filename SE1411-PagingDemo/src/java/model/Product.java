/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author TASS
 */
public class Product {

    private String id, name, catId, image, describe, status;
    private double price;
    private int quantity;
    private Date addDate;

    public Product() {
    }

    public Product(String id, String name, String catId, String image,
            double price, int quantity, String describe, String status, Date addDate) {
        this.id = id;
        this.name = name;
        this.catId = catId;
        this.image = image;
        this.describe = describe;
        this.status = status;
        this.price = price;
        this.quantity = quantity;
        this.addDate = addDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", catId=" + catId + ", image=" + image + ", describe=" + describe + ", status=" + status + ", price=" + price + ", quantity=" + quantity + ", addDate=" + addDate + '}';
    }

}
