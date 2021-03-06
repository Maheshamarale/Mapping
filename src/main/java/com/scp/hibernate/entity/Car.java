package com.scp.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")
public class Car {
		
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="Car_ID")
	private long id;

	@Column(name="TOTAL")
	private long total;
	
	@Column(name="BRAND")
	private String name;
	
	public Car() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", total=" + total + ", name=" + name + "]";
	}
	
	
	
}
