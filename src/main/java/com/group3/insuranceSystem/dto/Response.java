package com.group3.insuranceSystem.dto;

public class Response {
	private int status;
	private Policy response;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Policy getResponse() {
		return response;
	}

	public void setResponse(Policy response) {
		this.response = response;
	}
}
