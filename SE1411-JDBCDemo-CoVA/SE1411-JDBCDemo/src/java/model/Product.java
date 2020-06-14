
package model;

import java.sql.Date;


public class Product {
    /*
    [ID]
      ,[name]
      ,[cat_ID]
      ,[image]
      ,[price]
      ,[quantity]
      ,[describe]
      ,[status]
      ,[adddate]
    */    
    private  String id,name,cat_id,image,describe,status;
    private double price;
    private int quantity;
    private Date adddate;

    public Product() {
    }

    public Product(String id, String name, String cat_id, 
            String image, double price,int quantity,String describe, 
            String status,   Date adddate) {
        this.id = id;
        this.name = name;
        this.cat_id = cat_id;
        this.image = image;
        this.describe = describe;
        this.status = status;
        this.price = price;
        this.quantity = quantity;
        this.adddate = adddate;
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

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
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

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
    
    
}
