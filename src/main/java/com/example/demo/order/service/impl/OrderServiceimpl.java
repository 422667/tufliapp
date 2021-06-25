package com.example.demo.order.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.document.repo.DocumentRepository;
import com.example.demo.model.Document;
import com.example.demo.model.TestScenario;
import com.example.demo.order.repo.OrderRepository;
import com.example.demo.order.service.IOrderService;
import com.example.demo.service.ITestScenarioService;
import com.example.demo.testscenario.repo.TestScenarioRepository;



@Service
public class OrderServiceimpl implements IOrderService
{

	@Autowired
	private OrderRepository repo;
	


	
	
//	 @Override public List<Object[]> findorders() { return
	// repo.findorder_line_items(); }
	 

	@Override
	public List<Object[]> listAll(String keyword) {
		 if (keyword != null) {
	            return repo.findorder_line_items(keyword);
	             
	        }
	        return repo.findorder_line_items_all();
	}
	
	


	


}
