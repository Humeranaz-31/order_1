package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.Buyer;
@Repository
public interface BuyerRepository extends JpaRepository<Buyer, String> {

	Buyer findByEmail(String Email);
}


