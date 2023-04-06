package com.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import lombok.Data;

@Data
@Entity
public class PhoneBookContact implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PhoneBookContact_Contact",
        joinColumns = @JoinColumn(name="PhoneContact_ID"),
        inverseJoinColumns=@JoinColumn(name="Contact_ID"))
    private List<Contact> contacts = new ArrayList<>() ;
}
