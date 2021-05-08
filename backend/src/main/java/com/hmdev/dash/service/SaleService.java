package com.hmdev.dash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmdev.dash.dto.SaleDTO;
import com.hmdev.dash.dto.SaleSuccessDTO;
import com.hmdev.dash.dto.SaleSumDTO;
import com.hmdev.dash.entities.Sale;
import com.hmdev.dash.repositories.SaleRepository;
import com.hmdev.dash.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		
		return  repository.amountGroupedBySeller();
    }
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		
		return  repository.successGroupedBySeller();
    }
}
