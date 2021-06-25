package com.example.demo.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Document;
import com.example.demo.model.TestScenario;
import com.example.demo.service.ITestScenarioService;
import com.example.demo.testscenario.repo.TestScenarioRepository;



@Service
public class TestScenarioServiceimpl implements ITestScenarioService
{
	
	
	@Autowired
	private TestScenarioRepository repo; //HAS-A
	
	@Override
	public Integer saveTestScenario(TestScenario om) {
		om = repo.save(om);
		Integer id = om.getId();
		return id;
	}
	
	@Override
	public List<TestScenario> getAllTestScenarios() {
		List<TestScenario> list = repo.findAll();
		return list;
	}
	
	@Override
	public void deleteTestScenario(Integer id) {
		repo.deleteById(id);
	}
	
	@Override
	public boolean isTestScenarioExist(Integer id) {
		return repo.existsById(id);
	}
	
	@Override
	public Optional<TestScenario> getOneTestScenario(Integer id) {
		Optional<TestScenario> opt = repo.findById(id);
		return opt;
	}
	
	@Override
	public Integer updateTestScenario(TestScenario om) {
		om = repo.save(om);
		Integer id = om.getId();
		return id;//UPDATE SQL..
	}

	@Override
	public boolean istestScenarioExistByCode(String testScenario_code) {
		
		/*Integer count = repo.getOrderMethodCountByCode(orderCode);
		boolean exist = count>0? true:false;
		return exist;*/
		return  repo.getOrderMethodCountByCode(testScenario_code) > 0;
	}

	@Override
	public Page<TestScenario> getStudentsByPage(Pageable p) {
		// TODO Auto-generated method stub
		return repo.findAll(p);
	}

	
	
	@Override
	public Page<TestScenario> listAll(Pageable p,String keyword) {
		 if (keyword != null) {
	            return repo.search(keyword,p);
	             
	        }
	        return repo.findAll(p);
	}
	
	
	@Override
	public List<Object[]> getproducttestcaseCount() {
		List<Object[]>  list = repo.getproducttestcaseCount();
		return list;
	}

	@Override
	public void saveDocument(Document doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object[]> getDocIdAndNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Document> getDocumentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Object[]> getproducttestcasestatusCount(String Status) {
		List<Object[]>  list = repo.getproducttestcasePassCount(Status);
		return list;
	}


	


	


}
