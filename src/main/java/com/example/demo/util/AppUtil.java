package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppUtil {

	
	public static String getCurrentDateTime() {
		return new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss")
				.format(new Date());
	}
}
