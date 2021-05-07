package com.hmdev.dash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmdev.dash.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
