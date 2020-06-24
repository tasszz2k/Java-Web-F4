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
public class Job {
//    ([name],[salary],[datecreated],[activated]) 

    private int id;
    private String name;
    private double salary;
    private Date dateCreated;
    private boolean activated;

    public Job() {
    }

    public Job(int id, String name, double salary, Date dateCreated, boolean activated) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateCreated = dateCreated;
        this.activated = activated;
    }

    public Job(String name, double salary, Date dateCreated, boolean activated) {
        this.name = name;
        this.salary = salary;
        this.dateCreated = dateCreated;
        this.activated = activated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

}
