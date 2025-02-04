package com.tnsif.admin.model;

import jakarta.persistence.*;

@Entity
public class Shop {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String name;
	 private String owner;
	 private String category;
	 private double rent;
	 private String mobileNo;
	 private int floorNo;
	 private int shopNo;
	 private int workers;

	 // Getters and Setters
	 public Long getId() { 
	    return id; 
	 }
	 public void setId(Long id) { 
	 	this.id = id; 
	 }
	 public String getName() { 
	 	return name; 
	 }
	 public void setName(String name) { 
	 	this.name = name; 
	 }
	 public String getOwner() {
	 	return owner; 
	 }
	 public void setOwner(String owner) { 
	 	this.owner = owner; 
	 }
	 public String getCategory() { 
	 	return category; 
	 }
	 public void setCategory(String category) {
	 	this.category = category; 
	 }
	 public double getRent() { 
	 	return rent; 
	 }
	 public void setRent(double rent) {
	 	this.rent = rent;
	 }
	 public String getMobileNo() { return mobileNo; }
	    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }
	    public int getFloorNo() { return floorNo; }
	    public void setFloorNo(int floorNo) { this.floorNo = floorNo; }
	    public int getShopNo() { return shopNo; }
	    public void setShopNo(int shopNo) { this.shopNo = shopNo; }
	    public int getWorkers() { return workers; }
	    public void setWorkers(int workers) { this.workers = workers;}
	 
}
