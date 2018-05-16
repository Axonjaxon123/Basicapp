package dilip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class otp {

	public static String generateOTP() {
		
		int randomPin   =(int)(Math.random()*9000)+1000;
		String otp  =String.valueOf(randomPin);
		return otp;
	}
   
	public static void main(String[] args) throws IOException {
		String otpSting  =generateOTP();
		System.out.println("OTP : "+otpSting);
		
	    
    }
	}


