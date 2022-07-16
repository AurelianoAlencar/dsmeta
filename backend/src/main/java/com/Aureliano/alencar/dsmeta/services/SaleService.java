package com.aureliano.alencar.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aureliano.alencar.dsmeta.entities.Sale;
import com.aureliano.alencar.dsmeta.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales() {
		return  repository.findAll();

	}

}
