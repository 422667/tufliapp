package com.example.demo.testscenario.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.TestScenario;

public interface TestScenarioRepository extends JpaRepository<TestScenario, Integer> {

	
	@Query("SELECT COUNT(testScenario.testcaseid) FROM TestScenario testScenario WHERE testScenario.testcaseid=:testcaseid")
	public Integer getOrderMethodCountByCode(String testcaseid);
	
	
	@Query("SELECT testScenario.productFamily, count(testScenario.productFamily) FROM TestScenario testScenario GROUP BY testScenario.productFamily")
	List<Object[]> getproducttestcaseCount();
	
	@Query("SELECT testScenario.productFamily, count(testScenario.Status) FROM TestScenario testScenario WHERE testScenario.Status =?1 GROUP BY testScenario.productFamily")
	List<Object[]> getproducttestcasePassCount(@Param("Status") String Status);
	
	@Query("SELECT ts FROM TestScenario ts WHERE CONCAT(ts.testcaseid, ' ', ts.productFamily, ' ', ts.productOffer, ' ', ts.VAS, ' ', ts.BOD, ' ', ts.childOffer, ' ', ts.topology, ' ', ts.ipVersion, ' ', ts.RoutingProtocol, ' ', ts.Orderno, ' ', ts.CRMtoBRMVerification, ' ', ts.jiraids, ' ', ts.Status) LIKE %?1%")
	public Page<TestScenario> search(String keyword, Pageable pageable);
}
