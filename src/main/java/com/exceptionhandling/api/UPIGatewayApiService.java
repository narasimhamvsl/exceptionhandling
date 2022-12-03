package com.exceptionhandling.api;

import com.exceptionhandling.dto.MerchantPaymentRequest;
import com.exceptionhandling.dto.UPIPaymentReceipt;
import com.exceptionhandling.service.RBIService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/upiGateway")
public class UPIGatewayApiService {
	
	private RBIService rbiService;
	
	public UPIGatewayApiService() {
		rbiService = new RBIService();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/merchantTransferNoExceptionHandling")
	public UPIPaymentReceipt merchantPayWithNoExHandling(MerchantPaymentRequest request) {
		String transationNo = null;
		UPIPaymentReceipt paymentReceipt = null;
		
		transationNo = rbiService.upiTransfer(request.getFromUpiID(), request.getToUpiID(), request.getAmount());
		paymentReceipt = UPIPaymentReceipt.of();

	}

}
