package com.example.demo.restweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="viewrest")
public class RestuarantList {

public long getRestid() {
		return restid;
	}
	public void setRestid(long restid) {
		this.restid = restid;
	}
	public String getRestname() {
		return restname;
	}
	public void setRestname(String restname) {
		this.restname = restname;
	}
	public long getOpeninghours() {
		return openinghours;
	}
	public void setOpeninghours(long openinghours) {
		this.openinghours = openinghours;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
public RestuarantList(long restid, String restname, long openinghours, String address, String image) {
		super();
		this.restid = restid;
		this.restname = restname;
		this.openinghours = openinghours;
		this.address = address;
		this.image = image;
	}
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long restid;
private String restname;
private long openinghours;
private String address;
private String image;
public RestuarantList() {
	
	// TODO Auto-generated constructor stub
}

}
