package com.example.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.PropertyResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.example.user.dto.BuyerDTO;
import com.example.user.dto.SellerDTO;
import com.example.user.dto.LoginDTO;
import com.example.user.service.BuyerService;
import com.example.user.service.SellerService;

@RestController
@CrossOrigin



public class BuyerController {




Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired
BuyerService buyerservice ;

@Autowired
SellerService sellerservice;
@PostMapping(value = "/api/buyer/register", consumes = MediaType.APPLICATION_JSON_VALUE)
public void createBuyer(@RequestBody BuyerDTO buyerDTO) {
    logger.info("Creation request for customer {} with data {}", buyerDTO);
    buyerservice.saveBuyer(null, buyerDTO);
}
private void saveBuyer(String buyerid, BuyerDTO buyerDTO) {
	// TODO Auto-generated method stub
	
}
@GetMapping(value = "/api/buyers", produces = MediaType.APPLICATION_JSON_VALUE)
public List<BuyerDTO> getAllBuyer() {
	logger.info("Fetching all products");
	return buyerservice.getAllBuyer();
}

@PostMapping(value = "/buyer/login", consumes = MediaType.APPLICATION_JSON_VALUE)
public boolean login(@RequestBody LoginDTO loginDTO) {
	logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
	return buyerservice.login(loginDTO);
}
 @PostMapping(value = "/api/seller/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createSeller(@RequestBody SellerDTO sellerDTO) {
        logger.info("Creation request for customer {} with data {}", sellerDTO);
        sellerservice.saveSeller(sellerDTO);
    }
	@GetMapping(value = "/api/sellers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SellerDTO> getAllSeller() {
		logger.info("Fetching all products");
		return sellerservice.getAllSeller();
	}

	@PostMapping(value = "/seller/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean Login(@RequestBody LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
		return sellerservice.login(loginDTO);
	}
	@DeleteMapping(value = "/buyer/{buyerid}")
	public ResponseEntity<String> deleteBuyer(@PathVariable String buyerid) throws Exception {
		buyerservice.deleteBuyer(buyerid);
		PropertyResolver environment = null;
		String successMessage = environment.getProperty("API.DELETE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
	@DeleteMapping(value = "/seller/{sellerid}")
	public ResponseEntity<String> deleteSeller(@PathVariable String sellerid) throws Exception {
		sellerservice.deleteSeller(sellerid);
		PropertyResolver environment = null;
		String successMessage = environment.getProperty("API.DELETE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
}


