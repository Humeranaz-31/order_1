package com.example.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.user.dto.BuyerDTO;
import com.example.user.dto.LoginDTO;
import com.example.user.entity.Buyer;
import com.example.user.repository.BuyerRepository;

@Service
@Transactional
public class BuyerService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BuyerRepository buyerrepo;
	 
	
	

	public void saveBuyer(String buyerid, BuyerDTO buyerDTO) {
		logger.info("Creation request for customer {} with data {}",buyerDTO);
        Buyer buyer = buyerDTO.createBuyer();
        buyerrepo.save(buyer);
		
		
	}
	public List<BuyerDTO> getAllBuyer() {

		List<Buyer> buyers = buyerrepo.findAll();
		List<BuyerDTO> buyerDTOs = new ArrayList<>();

		for (Buyer buyer : buyers) {
			BuyerDTO buyerDTO = BuyerDTO.valueOf(buyer);
			buyerDTOs.add(buyerDTO);
		}

		logger.info("Product Details : {}", buyerDTOs);
		return buyerDTOs;
		
		
	}	
		
	public boolean login(LoginDTO loginDTO) {
			logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
			Buyer buy = buyerrepo.findByEmail(loginDTO.getEmail());
			if (buy != null && buy.getPassword().equals(loginDTO.getPassword())) {
				return true;
			}
		
			return false;
		}
	

	public void deleteBuyer(String buyerid) throws Exception{
		Optional<Buyer> buyer = buyerrepo.findById(buyerid);
		buyer.orElseThrow(() -> new Exception("Service.Buyer_NOT_FOUND"));
		buyerrepo.deleteById(buyerid);
	}
		// TODO Auto-generated method stub
		
	

	

}

	
		
	


