package com.example.otpgen.otpGen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.otpgen.otpGen.entities.OTPBean;
import com.example.otpgen.otpGen.exception.NoResourceException;
import com.example.otpgen.otpGen.exception.OTPTime;
import com.example.otpgen.otpGen.service.OTPServiceInterface;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@RestController
public class MyController {
	
	Logger logger = LogManager.getLogger(MyController.class);
	


	@Autowired
	private OTPServiceInterface otpService;

	@GetMapping("/genOtp")
	public String generateOtp() {
		
		return this.otpService.generateOTP();
	}
	@PostMapping("/OTPBean")
	public OTPBean generatedOtp(@RequestBody OTPBean otpentity) throws NoResourceException, OTPTime {
		
		logger.info("generated otp for ->"+ otpentity);
		
		return otpService.generatedOTP(otpentity);
	
	}
	@GetMapping("/validate/{uid}/{otp}")
	public ResponseEntity<OTPBean>validateOtp(@PathVariable String uid,@PathVariable String otp) throws NoResourceException{
		return this.otpService.validateOTP(uid,otp);
		
	}

}
