/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;

/**
 *
 * @author TASS
 */
public class Student {

    private String code;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /////
    static String getRandomsString(int n) {

        // chose a Character random from this String 
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb 
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public void generateStudent() {
        int rollNumber = 140000 + (int) (Math.random() * ((149999 - 140000) + 1));
        code = "HE" + rollNumber;
        age = 1 + (int) (Math.random() * ((99 - 1) + 1));

        //random Name
     
        name = getRandomsString(12);
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", age=" + age + '}';
    }

}
