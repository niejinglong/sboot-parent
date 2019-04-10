package com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "d_name")
    private String dName;
    @Column(name = "d_number")
    private int dNumber;
    @Column(name = "d_part_Id")
    private String dPartId;
    @Column(name = "d_remarks")
    private String dRemarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdNumber() {
        return dNumber;
    }

    public void setdNumber(int dNumber) {
        this.dNumber = dNumber;
    }

    public String getdPartId() {
        return dPartId;
    }

    public void setdPartId(String dPartId) {
        this.dPartId = dPartId;
    }

    public String getdRemarks() {
        return dRemarks;
    }

    public void setdRemarks(String dRemarks) {
        this.dRemarks = dRemarks;
    }
}
