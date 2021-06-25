package com.example.demo.order.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Document;
import com.example.demo.model.TestScenario;
import com.example.demo.order.service.IOrderService;
import com.example.demo.service.IDocumentService;



@Controller
@RequestMapping("/testscenario/orders")
public class OrderItemController {
	
	@Autowired
	private IOrderService service;
	
	//1. show Documents Screen
	//@GetMapping("/show")
	/*
	 * public String showDocs(Model model) { List<Object[]> list =
	 * service.findorders(); model.addAttribute("list", list);
	 * System.out.println(list.toString()); return "OrderReport"; }
	 */
	
	@RequestMapping("/show")
    public String viewHomePage(Model model, @RequestParam(value="keyword",required = false) String keyword) {
		List<Object[]> list = service.listAll(keyword);
		model.addAttribute("keyword", keyword);
		model.addAttribute("list", list);
		return "OrderReport";
       
    }
	
	
	
}
