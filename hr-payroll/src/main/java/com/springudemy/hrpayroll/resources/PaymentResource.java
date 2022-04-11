package com.springudemy.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springudemy.hrpayroll.domain.Payment;
import com.springudemy.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentResource {

	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, 
			@PathVariable Integer days){
		Payment obj = paymentService.getPayment(workerId, days);
		return ResponseEntity.ok().body(obj);
	}
	
}
