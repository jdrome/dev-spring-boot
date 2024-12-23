package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lasName;

    @Column(name="email")
    private String email;

    // define constructors

    public Student() {}

    public Student(String firstName, String lasName, String email) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.email = email;
    }

    // define getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // define toString() method


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
