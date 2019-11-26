package com.example.gof.structural.facade;

import com.example.gof.structural.facade.facade.ReportGeneratorFacade;
import com.example.gof.structural.facade.report.ReportType;

public class Main {

	public static void main(String[] args) throws Exception {

		ReportGeneratorFacade.generateReport(ReportType.HTML, null, null);

		ReportGeneratorFacade.generateReport(ReportType.PDF, null, null);
	}
}