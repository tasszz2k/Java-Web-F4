/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TASS
 */
public class Dog {

    private double price;
    private String code;

    public Dog() {
    }

    public Dog(double price, String code) {
        this.price = price;
        this.code = code;
    }

    public double getPrice() {
        if (code.startsWith("j") || code.startsWith("J")) {
            price *= 1.1;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code + " " + price;
    }

}
