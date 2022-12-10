package com.group3.insuranceSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.group3.insuranceSystem.dao.PolicyAddress;
import com.group3.insuranceSystem.dto.Policy;
import com.group3.insuranceSystem.dto.Response;
import com.group3.insuranceSystem.repository.PolicyRepository;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class PolicyController {
	@Autowired
	private PolicyRepository policyRepository;

	@GetMapping("/policies")
	public Response getAllPolicies() {
		Response response = new Response();
		Policy policy = new Policy();
		policy.setPolicy(policyRepository.findAll());
		if (policy.getPolicy() != null) {
			response.setStatus(HttpStatus.OK.value());
			response.setResponse(policy);
		} else {
			policy.setPolicy(new ArrayList<PolicyAddress>());
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			response.setResponse(policy);
		}
		return response;
	}
	@GetMapping(path = "/health")
    	public @ResponseBody String greeting() 
		{
        		return "Hello, World";
    	}

	


}
