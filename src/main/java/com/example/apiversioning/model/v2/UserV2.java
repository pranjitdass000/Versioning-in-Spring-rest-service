package com.example.apiversioning.model.v2;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserV2 {
    @Id

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    private UserDepartment userDepartment;

    public UserV2() {
    }

    public UserV2(int id, String firstName, String lastName, int age, UserDepartment userDepartment) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userDepartment = userDepartment;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDepartment getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(UserDepartment userDepartment) {
        this.userDepartment = userDepartment;
    }
}
