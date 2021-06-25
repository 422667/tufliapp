package com.example.demo.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class TestcaseTypeUtil {

	public void generatePieChart(
			String path,List<Object[]> list)
	{
		// a. Create DataSet using List<Object[]>
		DefaultPieDataset dataset = new DefaultPieDataset();
		for(Object[] ob:list) {
			dataset.setValue(
					ob[0].toString(), //key-String
					Double.valueOf(ob[1].toString()) //value-Double
					);
		}

		// b. Create JFreeChart object using ChartFactory
		//JFreeChart chart = ChartFactory.createPieChart("SHIPMENT MODES", dataset);
		JFreeChart chart = ChartFactory.createPieChart3D("TESTCASE MOC Report", dataset);

		// c. Convert to Image Format using ChartUtils.
		try {
			ChartUtils.saveChartAsPNG(new File(path+"/shipmentA.png"), chart, 450, 250);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void generateBarChart(	
			String path,List<Object[]> list)
	{
		//  a. Create DataSet using List<Object[]>
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for(Object[] ob:list ) {
			dataset.setValue(
					Double.valueOf(ob[1].toString()), //value
					ob[0].toString(),  //key
					""); //label
		}
		//  b. Create JFreeChart object using ChartFactory
		JFreeChart chart = ChartFactory.createBarChart("TESTCASE MOC REPORT", "Testcase Type","ACTUAL COUNT", dataset);
		
		// c. Convert to Image Format using ChartUtils.
		try {
			ChartUtils.saveChartAsPNG(new File(path+"/shipmentB.png"), chart, 700, 450);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void generateBarChartforStatus(	
			String path,List<Object[]> list)
	{
		System.out.println(list.toString());
		System.out.println("JETTI DINESH REDDY");
		//  a. Create DataSet using List<Object[]>
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for(Object[] ob:list ) {
			dataset.setValue(
					Double.valueOf(ob[1].toString()), //value
					ob[0].toString(),  //key
					""); //label
		}
		//  b. Create JFreeChart object using ChartFactory
		JFreeChart chart = ChartFactory.createBarChart("TESTCASE MOC LIVE STATUS REPORT", "Testcase Type", "PASS COUNT", dataset);
		// c. Convert to Image Format using ChartUtils.
		try {
			ChartUtils.saveChartAsPNG(new File(path+"/shipmentC.png"), chart, 400, 450);
		} catch (IOException e) {
			e.printStackTrace();
		}
}


}
