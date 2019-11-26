package com.example.gof.structural.facade.facade;

import javax.sql.DataSource;

import com.example.gof.structural.facade.report.Report;
import com.example.gof.structural.facade.report.ReportData;
import com.example.gof.structural.facade.report.ReportFooter;
import com.example.gof.structural.facade.report.ReportHeader;
import com.example.gof.structural.facade.report.ReportType;
import com.example.gof.structural.facade.report.ReportWriter;

public class ReportGeneratorFacade {

	public static void generateReport(ReportType type, DataSource dataSource, String location) {

		if (type == null || dataSource == null) {
			// throw some exception
		}

		// Create report
		Report report = new Report();

		report.setHeader(new ReportHeader());
		report.setFooter(new ReportFooter());

		// Get data from dataSource and set to ReportData object
		report.setData(new ReportData());

		// Write report
		ReportWriter writer = new ReportWriter();

		switch (type) {
		case HTML:
			writer.writeHtmlReport(report, location);
			break;

		case PDF:
			writer.writePdfReport(report, location);
			break;
		}
	}
}