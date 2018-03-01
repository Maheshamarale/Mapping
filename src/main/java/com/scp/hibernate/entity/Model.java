	package com.scp.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Model")
public class Model {
	
		@Id
		@GeneratedValue(strategy=GenerationType.TABLE)
		@Column(name="MODEL_ID")
	 	private long id;
		
		
		@Column(name="TOTAL_CAR")
	    private long model_total;
		
		@Column(name="QUANTITY")
	    private long quantity;
		
		@ManyToOne(optional=false)
		@JoinColumn(name="CAR_ID")
	    private Car car;
		
	    public Model() {
		
		}
	    
	    public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public long getItem_total() {
			return model_total;
		}
		public void setModel_total(long item_total) {
			this.model_total = model_total;
		}
		public long getQuantity() {
			return quantity;
		}
		public void setQuantity(long quantity) {
			this.quantity = quantity;
		}
		public Car getCar() {
			return car;
		}
		public void setCar(Car car) {
			this.car = car;
		}

		@Override
		public String toString() {
			return "Model [id=" + id + ", model_total=" + model_total + ", quantity=" + quantity + ", car=" + car + "]";
		}

		
	    
		
	    
}
