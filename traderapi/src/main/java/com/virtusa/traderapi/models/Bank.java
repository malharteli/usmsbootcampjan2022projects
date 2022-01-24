package com.virtusa.traderapi.models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;
@Data
@Entity
@Table(name = "Bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Bank_Id")
	private long bankId;
    @Column(name="Bank_Name",length = 50,nullable = false)
	private String bankName;
    @Column(name="Addresss",length = 150,nullable = false)
	private String address;
    @DateTimeFormat(iso=ISO.DATE)
    @Column(name="DOB")
    private LocalDate dob;
    @ManyToOne(cascade=CascadeType.All,fetch=FetchType.Lazy)
    @JoinColumn(foreignKey=@ForeignKey(name="Bank_Id"), name="Bank_Id")
    private Bank bank;
    
    
}
