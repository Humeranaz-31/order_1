package com.example.user.dto;

import com.example.user.entity.Seller;

public class SellerDTO {
	
String sellerid;
	
	String name;
	
	String email;
	
	Long phoneno;
	
	String password;

	String isactive;

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
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

	@Override
	public String toString() {
		return "SellerDTO [sellerid=" + sellerid + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno
				+ ", password=" + password + ", isactive=" + isactive + "]";
	}
	
	

	public Seller createSeller() {
		Seller seller = new Seller();
        seller.setSellerid(this.getSellerid());
        seller.setName(this.getName());
        seller.setPhoneno(this.getPhoneno());
        seller.setEmail(this.getEmail());
        seller.setPassword(this.getPassword());
        seller.setIsactive(this.getIsactive());
        return seller;
	}

	public static SellerDTO valueOf(Seller seller) {
		SellerDTO sellerDTO = new SellerDTO();
		sellerDTO.setSellerid(seller.getSellerid());
		sellerDTO.setName(seller.getName());
		sellerDTO.setEmail(seller.getEmail());
		sellerDTO.setPhoneno(seller.getPhoneno());
		sellerDTO.setPassword(seller.getPassword());
		sellerDTO.setIsactive(seller.getIsactive());
return sellerDTO;
	}

}
