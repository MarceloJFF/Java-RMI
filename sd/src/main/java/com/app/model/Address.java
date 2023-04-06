package com.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javassist.SerialVersionUID;
import lombok.Data;

@Data
@Entity
public class Address implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;
    private String street;
    private String numberOfHouse;
    private String neighborhood;    
    @OneToMany(mappedBy = "address",fetch = FetchType.EAGER)
    private List<Contact> contacts = new ArrayList<>();
}
