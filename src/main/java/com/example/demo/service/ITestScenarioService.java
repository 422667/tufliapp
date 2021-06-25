package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.model.Document;
import com.example.demo.model.TestScenario;


public interface ITestScenarioService {
	
	Integer saveTestScenario(TestScenario ts);
	List<TestScenario> getAllTestScenarios();
	void deleteTestScenario(Integer id);
	boolean isTestScenarioExist(Integer id);
	Optional<TestScenario> getOneTestScenario(Integer id);
	Integer updateTestScenario(TestScenario ts);
	boolean istestScenarioExistByCode(String testcaseid);
	Page<TestScenario> getStudentsByPage(Pageable p);
	List<Object[]> getproducttestcaseCount();
	List<Object[]> getproducttestcasestatusCount(String Status);
	public void saveDocument(Document doc);
	public List<Object[]> getDocIdAndNames();
	public Optional<Document> getDocumentById(Integer id);

	Page<TestScenario> listAll(Pageable p,String keyword);
}
