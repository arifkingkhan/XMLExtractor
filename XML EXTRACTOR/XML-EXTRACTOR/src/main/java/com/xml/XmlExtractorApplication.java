package com.xml;

import com.xml.bean.ExcelConsumer;
import com.xml.extractor.ExcelReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class XmlExtractorApplication {

	static List<ExcelConsumer> excelConsumer = new ArrayList<ExcelConsumer>();

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = (new SpringApplicationBuilder(new Class[]{XmlExtractorApplication.class})).headless(false).run(args);
		EventQueue.invokeLater(() -> {


			ExcelReader obj1 = new ExcelReader();
			try {
				excelConsumer = obj1.excelReader();
			} catch (Exception e) {
				e.printStackTrace();
			}
			File directoryPath = new File("C:\\Users\\Arif Ahmed Khan\\Desktop\\01 NOV 2020");
			System.out.println(directoryPath.);

			SpringApplication.run(XmlExtractorApplication.class, args);







		});





	}

}
