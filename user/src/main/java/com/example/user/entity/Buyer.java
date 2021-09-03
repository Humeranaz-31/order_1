package com.example.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buyer {

	@Id
	@Column(nullable = false)
	String buyerid;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	Long phoneno;
	@Column(nullable = false)
	String password;
	@Column(nullable = false)
	String isactive;
	@Column(nullable = false)
	String isprivileged;
	@Column(nullable = false)
	Integer rewardpoints;
	
	public Buyer() {
		super();
	}

	public String getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsprivileged() {
		return isprivileged;
	}

	public void setIsprivileged(String isprivileged) {
		this.isprivileged = isprivileged;
	}

	public Integer getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(Integer rewardpoints) {
		this.rewardpoints = rewardpoints;
	}

	public Buyer(String buyerid, String name, String email, Long phoneno, String password, String isactive,
			String isprivileged, Integer rewardpoints) {
		super();
		this.buyerid = buyerid;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
		this.isactive = isactive;
		this.isprivileged = isprivileged;
		this.rewardpoints = rewardpoints;
	}

	@Override
	public String toString() {
		return "Buyer [buyerid=" + buyerid + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno
				+ ", password=" + password + ", isactive=" + isactive + ", isprivileged=" + isprivileged
				+ ", rewardpoints=" + rewardpoints + "]";
	}
	
}
