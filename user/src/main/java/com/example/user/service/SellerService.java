package com.example.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.user.dto.SellerDTO;
import com.example.user.entity.Seller;
import com.example.user.repository.SellerRepository;
import com.example.user.dto.LoginDTO;

@Service
@Transactional
public class SellerService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SellerRepository sellerrepo;
	
	public void saveSeller(SellerDTO sellerDTO) {
		
		logger.info("Creation request for customer {} with data {}",sellerDTO);
        Seller seller = sellerDTO.createSeller();
        sellerrepo.save(seller);
		// TODO Auto-generated method stub
		
	}

	public List<SellerDTO> getAllSeller() {
		List<Seller> sellers = sellerrepo.findAll();
		List<SellerDTO> sellerDTOs = new ArrayList<>();

		for (Seller seller : sellers) {
			SellerDTO sellerDTO = SellerDTO.valueOf(seller);
			sellerDTOs.add(sellerDTO);
		}

		logger.info("Product Details : {}", sellerDTOs);
		return sellerDTOs;
	}

	public boolean login(LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		Seller sell = sellerrepo.findByEmail(loginDTO.getEmail());
		if (sell != null && sell.getPassword().equals(loginDTO.getPassword())) {
			return true;
		}
		return false;
	}

	public void deleteSeller(String sellerid) throws Exception {
		Optional<Seller> seller = sellerrepo.findById(sellerid);
		seller.orElseThrow(() -> new Exception("Service.Seller_NOT_FOUND"));
		sellerrepo.deleteById(sellerid);
		
	}

	
}
