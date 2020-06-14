/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TASS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 1;
        String color = "red";

        Dog meo = new Dog(age, color);
        System.out.println(meo.toString());
        meo.setAge(3);
        System.out.println(meo.toString());
        meo.setColor("blue");
        System.out.println(meo.toString());
    }
}
