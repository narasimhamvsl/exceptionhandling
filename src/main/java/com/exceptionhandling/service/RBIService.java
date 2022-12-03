package com.exceptionhandling.service;

import java.util.UUID;

import com.exceptionhandling.exception.InsuficientFundsException;

public class RBIService {
	public String upiTransfer(String fromUpiID, String toUpiID, double amount) {
		if(fromUpiID.equals("9999999991@icici")) {
			throw new InsuficientFundsException("no sufficient Balance.");
		}
		return UUID.randomUUID().toString().substring(0,9);
	}
}