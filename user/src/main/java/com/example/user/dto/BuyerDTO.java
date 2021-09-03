package com.example.user.dto;



import com.example.user.entity.Buyer;


public class BuyerDTO {
    
	
	String buyerid;
	String name;
	String email;
	Long phoneno;
	String password;
	String isactive;
	String isprivileged;
	Integer rewardpoints;


	

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
	

		@Override
	public String toString() {
		return "BuyerDTO [buyerid=" + buyerid + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno
				+ ", password=" + password + ", isactive=" + isactive + ", isprivileged=" + isprivileged
				+ ", rewardpoints=" + rewardpoints + "]";
	}

		// Converts Entity into DTO
		public static BuyerDTO valueOf(Buyer buyer) {
			BuyerDTO buyerDTO = new BuyerDTO();
			buyerDTO.setBuyerid(buyer.getBuyerid());
			buyerDTO.setName(buyer.getName());
			buyerDTO.setEmail(buyer.getEmail());
			buyerDTO.setPhoneno(buyer.getPhoneno());
			buyerDTO.setPassword(buyer.getPassword());
			buyerDTO.setIsactive(buyer.getIsactive());
			buyerDTO.setIsprivileged(buyer.getIsprivileged());
			buyerDTO.setRewardpoints(buyer.getRewardpoints());
			
			
			
			return buyerDTO;
		}
		public Buyer createBuyer() {
			Buyer buyer = new Buyer();
			buyer.setBuyerid(this.getBuyerid());
			buyer.setName(this.getName());
			buyer.setPhoneno(this.getPhoneno());
			buyer.setEmail(this.getEmail());
			buyer.setPassword(this.getPassword());
			return buyer;
		}

//		
		//{
//			Buyer cust = new Buyer();
//			cust.setAge(this.getAge());
//			cust.setGender(this.getGender());
//			cust.setName(this.getName());
//			cust.setPhoneNo(this.getPhoneNo());
//			cust.setAddress(this.getAddress());
//			cust.setPassword(this.getPassword());
//			cust.setPlanId(this.getCurrentPlan().planId);
//			return cust;
//		//}


}
