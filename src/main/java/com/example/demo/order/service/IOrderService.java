package com.example.demo.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.model.Document;
import com.example.demo.model.TestScenario;


public interface IOrderService {
	

	
	//public List<Object[]> findorders();
	List<Object[]> listAll(String keyword);

	
}
