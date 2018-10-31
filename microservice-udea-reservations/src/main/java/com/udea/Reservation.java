package com.udea;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Reservation {
	@Id
	@GeneratedValue
	private Long id;
	private String reservationName;
	
	@Override
	public String toString() {
		return "A reservation{"
				+ "id:" + getId()
				+ ", reservationName='" + getReservationName() + '\''
				+ '}';
	}
	
	public Reservation() {}
	public Reservation(String reservationName) {this.reservationName = reservationName;}
	public Long getId() {return id;}
	public String getReservationName() {return reservationName;}
	public void setId(Long id) {this.id = id;}
	public void setReservationName(String reservationName) {this.reservationName = reservationName;}
}
