package com.example.demo.model;


	

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="test_scenario_tab")
public class TestScenario {
	@Id
	@GeneratedValue(generator = "test_seq")
	@SequenceGenerator(name = "test_seq",sequenceName = "test_seq_test", allocationSize=1)
	@Column(name="scena_id_col")
	private Integer id;
	
	@Column(name="testcase_id_col")
	private String testcaseid;
	@Column(name="scena_product_family")
	private String productFamily;
	@Column(name="scena_Prodoffer_col")
	private String productOffer;
	@Column(name="scena_VAS")
	private String VAS;
	@Column(name="scena_child_offer")
	private String childOffer;
	
	@Column(name="scena_BOD")
	private String BOD;
	@Column(name="scena_topo_col")
	private String topology;
	@Column(name="scena_ipver_col")
	private String ipVersion;
	@Column(name="scena_routingproto_col")
	private String RoutingProtocol;
	@Column(name="scena_order_col")
	private String Orderno;
	@Column(name="scena_crm_brm_col")
	private String CRMtoBRMVerification;
	@Column(name="scena_jira_issues")
	private String jiraids;
	
	
	@Column(name="scena_status")
	private String Status;
	

	
	
	
	
	
}


