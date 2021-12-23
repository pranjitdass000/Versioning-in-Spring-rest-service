package com.example.apiversioning.model.v2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    private String departName;

    public UserDepartment() {
    }

    public UserDepartment(int departmentId, String departName) {
        this.departmentId = departmentId;
        this.departName = departName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}
