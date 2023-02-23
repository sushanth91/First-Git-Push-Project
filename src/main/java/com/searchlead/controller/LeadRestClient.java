package com.searchlead.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlead.dto.Lead;

public class LeadRestClient {
		public Lead getLeadById(long id){
			RestTemplate rest= new RestTemplate();//To consume web services we use rest template class.
Lead lead=rest.getForObject("http://localhost:8080/api/v1/employees/get/"+id, Lead.class);
			//Automatically
			//take the JSON OBJECT and put that into Employee objest.
			return lead;
			
		}
	}

