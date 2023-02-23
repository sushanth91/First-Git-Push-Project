package com.searchlead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlead.dto.Lead;

@Controller
public class SearchLeadController {
	@RequestMapping("/searchPage")
	public String viewSearchPage() {
		return "search_lead";
	}

	@RequestMapping("/searchLead")
	public String searchEmployee(@RequestParam("id") long id, ModelMap model) {
		LeadRestClient client = new LeadRestClient();
		Lead employee = client.getLeadById(id);// Employee object has all the data
		model.addAttribute("employee", employee);
		/*
		 * System.out.println(employee.getId());
		 * System.out.println(employee.getFirstName());
		 * System.out.println(employee.getLastName());
		 * System.out.println(employee.getEmailId());
		 */
		return "employee_result"; // Redirecting to this page

	}
}
