package com.greatlearning.service;

public class OTPGenerator {
	
	/*
	 * generateOTP method generates a 4 digit random otp and returns
	 */
	public int generateOTP()
	{
		int otp=(int)(Math.random()*9000)+1000;
		return otp;
	}

}
