package com.xml.extractor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class XmlExtractorApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = (new SpringApplicationBuilder(new Class[]{XmlExtractorApplication.class})).headless(false).run(args);
		EventQueue.invokeLater(() -> {


			ExcelReader obj1 = new ExcelReader();
			try {
				obj1.excelReader();
			} catch (Exception e) {
				e.printStackTrace();
			}

			SpringApplication.run(XmlExtractorApplication.class, args);







		});





	}

}
