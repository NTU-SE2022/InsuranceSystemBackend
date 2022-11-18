package com.group3.insuranceSystem.dto;

import java.util.List;
import com.group3.insuranceSystem.dao.PolicyAddress;

public class Policy {
	private List<PolicyAddress> policy;

	public List<PolicyAddress> getPolicy() {
		return policy;
	}

	public void setPolicy(List<PolicyAddress> policy) {
		this.policy = policy;
	}

}