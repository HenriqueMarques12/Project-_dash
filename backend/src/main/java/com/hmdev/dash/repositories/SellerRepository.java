package com.hmdev.dash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmdev.dash.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
