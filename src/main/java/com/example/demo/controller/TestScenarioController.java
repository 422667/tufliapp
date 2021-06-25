package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.TestScenario;
import com.example.demo.service.ITestScenarioService;
import com.example.demo.util.TestcaseTypeUtil;
import com.example.demo.view.TestScenarioExcelView;


@Controller
@RequestMapping("/testscenario")

public class TestScenarioController {
	
	@Autowired
	private ITestScenarioService service;
	
	@Autowired
	private TestcaseTypeUtil util;
	
	@Autowired
	private ServletContext sc;

	//1. Show Register page
	@GetMapping("/register")
	public String showReg() {
		return "TestScenarioRegister";
	}

	//2. On click submit button read form -> save data
	@PostMapping("/save")
	public String saveShipmentType(
			//Reading Form Data
			@ModelAttribute TestScenario testScenario,
			Model model //send to UI
			) 
	{

		//call service
		Integer id = service.saveTestScenario(testScenario);
		
		//create message
		String message = "Test Case ID"+testScenario.getTestcaseid()+" saved";
	
		//send message to UI
		model.addAttribute("message", message);

		//Go back to same page
		return "TestScenarioRegister";
	}


	//3. Display all rows
	//@GetMapping("/all")
	public String showAllShipmentTypes(
			Model model	) 
	{
		// call service layer
		List<TestScenario> list = service.getAllTestScenarios();

		//send data to UI
		model.addAttribute("list", list);

		//Go back to UI page
		return "TestScenarioData";
	}
	
	//@GetMapping("/all")
	public String getAllStudentsByPage(
			@PageableDefault(page = 0, size = 10) Pageable pageable,
			Model model
			) 
	{
		Page<TestScenario> page = service.getStudentsByPage(pageable);
		//model.addAttribute("list", page.getContent());
		model.addAttribute("page", page);
		return "TestScenarioData";
	}
	
	
	@RequestMapping("/all")
    public String viewHomePage(Model model, @RequestParam(value="keyword",required = false) String keyword,@PageableDefault(page = 0, size = 10) Pageable pageable) {
		Page<TestScenario> page = service.listAll(pageable,keyword);
		model.addAttribute("keyword", keyword);
		model.addAttribute("page", page);
		return "TestScenarioData";
       
    }

	//4. delete by id : /st/delete?id=<val>
	@GetMapping("/delete")
	public String deleteShipmentType( 
			@RequestParam("id")Integer sid, //read param
			Model model
			) 
	{
		if(service.isTestScenarioExist(sid)) {
			//call service
			service.deleteTestScenario(sid);

			//create message
			String message = new StringBuffer()
					.append("Scenario '")
					.append(sid)
					.append("' Deleted!")
					.toString();

			//send to UI
			model.addAttribute("message", message);
		} else {
			model.addAttribute("message", sid+ " not found!!");
		}
		//latest data
		model.addAttribute("list", service.getAllTestScenarios());

		return "redirect:all";
	}

	//5. show edit page
	@GetMapping("/edit")
	public String showShipmentTypeEdit(
			@RequestParam("id")Integer sid,
			Model model
			) 
	{
		String page = null;
		Optional<TestScenario> opt = service.getOneTestScenario(sid);
		if(opt.isPresent()) { //if data is present (not null)
			//object --> Fill in Form
			model.addAttribute("testScenario", opt.get());
			page = "TestScenarioEdit"; 
		} else {
			// response.sendRedirect("/all");
			page = "redirect:all";
		}
		return page;
	}

	//6. Update ShipmentType
	@PostMapping("/update")
	public String doUpdateShipmentType(
			@ModelAttribute TestScenario testScenario,
			Model model) 
	{
		
		
		
		
		service.updateTestScenario(testScenario);

		
		//create message
		String message = "Test Case ID '"+testScenario.getTestcaseid()+"' updated!!";
	
		//send message to UI
		model.addAttribute("message", message);
		//call service to update
		

		//return "redirect:all";
		
		//send message to UI
	//	model.addAttribute("message", "Test Case ID'"+testCaseID.getTestcaseid()+"' Updated!!");

		// call service layer for latest data
	//	List<TestScenario> list = service.getAllTestScenarios();
		//send data to UI for HTML table
		return "redirect:all";
		//model.addAttribute("list", list);

		//Go back to UI page
		//return "TestScenarioData";
		
	}
	
	
	
	//7. AJAX VALIDATION
		@GetMapping("/validateCode")
		public @ResponseBody String validateOrderCode(
				@RequestParam("code") String testcaseid
				) 
		{
			String message = "";
			if(service.istestScenarioExistByCode(testcaseid)) {
				message = "Test Case ID '"+testcaseid+"' Exist! Try different!";
			}
			
			return message;
		}
		
		
		@GetMapping("/excel")
		public ModelAndView showExcelExport() {
			//fetch all rows from DB
			List<TestScenario> list = service.getAllTestScenarios();
			
			//create ModelAndView
			ModelAndView  m = new ModelAndView();
			m.addObject("list", list);
			m.setView(new TestScenarioExcelView());
			
			return m;
		}


		@GetMapping("/charts")
		public String showCharts() {
			// call service for data
			List<Object[]> list = service.getproducttestcaseCount();
			List<Object[]> Statuslist = service.getproducttestcasestatusCount("PASS");
			// dynamic path inside server(runtime location)
			String path = sc.getRealPath("/"); //root location
			System.out.println("Runtime location=>" + path);
			
			// call util method for generation
			util.generatePieChart(path, list);
			util.generateBarChart(path, list);
			util.generateBarChartforStatus(path, Statuslist);
			return "TestcaseType.html";
		}
		
	
}
