package org.wanjiku.letsPlay.persistence;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserAccount {
	@Embedded
	private UserAddress userAddress;
	@Embedded
	private UserDetails userDetails;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date dateJoined;
	public UserAddress getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateJoined() {
		return dateJoined;
	}
	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}
	
	

}
