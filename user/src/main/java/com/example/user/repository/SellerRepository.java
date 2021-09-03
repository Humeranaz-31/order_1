package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, String> {

	Seller findByEmail(String Email);

}
