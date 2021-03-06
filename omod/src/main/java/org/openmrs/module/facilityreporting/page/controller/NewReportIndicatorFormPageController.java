package org.openmrs.module.facilityreporting.page.controller;

import org.openmrs.module.facilityreporting.FacilityReportingConstant;
import org.openmrs.module.facilityreporting.api.models.FacilityReportDataset;
import org.openmrs.module.facilityreporting.api.models.FacilityReportIndicator;
import org.openmrs.module.kenyaui.annotation.AppPage;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

@AppPage(FacilityReportingConstant.APP_FALICITY_REPORTING)
public class NewReportIndicatorFormPageController {
	
	public void controller(@RequestParam("returnUrl") String url, @RequestParam("datasetId") FacilityReportDataset dataset,
	        @RequestParam(value = "id", required = false) FacilityReportIndicator facilityReportIndicator, PageModel model) {
		model.addAttribute("returnUrl", url);
		model.addAttribute("dataset", dataset);
		model.addAttribute("facilityReportIndicator", facilityReportIndicator);
		
	}
}
