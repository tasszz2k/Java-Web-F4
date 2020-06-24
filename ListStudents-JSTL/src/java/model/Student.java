/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author TASS
 */
public class Student {

    private String code;
    private String name;
    private int age;
    private boolean gender;
    private String address;
    private int score;

    public Student() {
    }

    public Student(String code, String name, int age, boolean gender, String address, int score) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.score = score;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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

    int randomIntegerInRange(int min, int max) {

        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public void generateStudent() {
        Random rand = new Random();
        int rollNumber = randomIntegerInRange(14000, 14999);
        if (new Random().nextBoolean()) {
            code = "HE" + rollNumber;
        } else {
            code = "SE" + rollNumber;
        }

        age = randomIntegerInRange(1, 99);

        gender = rand.nextBoolean();
        if (gender) {
            name = "Mr.";
        } else {
            name = "Mrs.";
        }
        //random Name
        name += getRandomsString(randomIntegerInRange(5, 10)) + " " + getRandomsString(randomIntegerInRange(5, 10));

        int indexAddress = randomIntegerInRange(0, 2);
        switch (indexAddress) {
            case 0:
                address = "HN";
                break;
            case 1:
                address = "HP";
                break;
            case 2:
                address = "TB";
                break;
        }
        
        score= randomIntegerInRange(0, 10);

    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", score=" + score + '}';
    }

    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Student s = new Student();
            s.generateStudent();
            ls.add(s);
        }
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i).toString());
//            if (ls.get(i).equals("113"));
        }
    }

}
