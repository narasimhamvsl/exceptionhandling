package com.exceptionhandling.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(builderMethodName = "of")
public class UPIPaymentReceipt {
	private String transactionNo;
	private String fromUpiID;
	private String toUpiID;
	private LocalDate transactionDate;
	private double amount;
	private String status;

}