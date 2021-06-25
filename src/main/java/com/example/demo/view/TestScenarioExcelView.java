package com.example.demo.view;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.example.demo.model.TestScenario;
import com.example.demo.util.AppUtil;

public class TestScenarioExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//Modify File Name
		response.setHeader("Content-Disposition", "attachment;filename=TESTSCENARIOS-"+AppUtil.getCurrentDateTime()+".xlsx");
		
		//Read data from ModelAndView memory
		@SuppressWarnings("unchecked")
		List<TestScenario> list = (List<TestScenario>) model.get("list");
		

		//create one sheet using workbook
		Sheet sheet = workbook.createSheet("TestScenarios");
		
		//create one row.(1st row in excel-Row#0)
		setHead(sheet);
		setBody(sheet,list);

	}

			/**
			 * This is not pre-defined method.
			 * I wrote this method that indicates
			 * creating Row#0 calling as Head in Excel File
			 */
			private void setHead(Sheet sheet) {
				Row row = sheet.createRow(0);
				row.createCell(0).setCellValue("S.No");
				row.createCell(1).setCellValue("TEST CASE ID");
				row.createCell(2).setCellValue("PRODUCT FAMILY");
				row.createCell(3).setCellValue("PRODUCT OFFER");
				row.createCell(4).setCellValue("VAS");
				row.createCell(5).setCellValue("CHILD OFFER");
				row.createCell(6).setCellValue("TOPOLOGY");
				row.createCell(7).setCellValue("IP VERSION");
				row.createCell(8).setCellValue("ROUTING PROTOCOL");
				row.createCell(9).setCellValue("ORDER NUMBER");
				row.createCell(10).setCellValue("CRM TO BRM VERIFICATION");
				row.createCell(11).setCellValue("JIRA ISSUES");
				row.createCell(12).setCellValue("STATUS");
				
				
			}
			
			private void setBody(Sheet sheet, List<TestScenario> list) {
				int rowNum = 1;
				for(TestScenario st:list) {
					Row row = sheet.createRow(rowNum++);
					row.createCell(0).setCellValue(st.getId());
					row.createCell(1).setCellValue(st.getTestcaseid());
					row.createCell(2).setCellValue(st.getProductFamily());
					row.createCell(3).setCellValue(st.getProductOffer());
					row.createCell(4).setCellValue(st.getVAS());
					row.createCell(5).setCellValue(st.getChildOffer());
					row.createCell(6).setCellValue(st.getTopology());
					row.createCell(7).setCellValue(st.getIpVersion());
					row.createCell(8).setCellValue(st.getRoutingProtocol());
					row.createCell(9).setCellValue(st.getOrderno());
					row.createCell(10).setCellValue(st.getCRMtoBRMVerification());
					row.createCell(11).setCellValue(st.getJiraids());
					row.createCell(12).setCellValue(st.getStatus());
					//rowNum = rowNum + 1;
					//rowNum += 1;
					//rowNum++;
				}
			}

		
}
