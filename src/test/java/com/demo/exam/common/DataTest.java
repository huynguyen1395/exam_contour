package com.demo.exam.common;

import java.util.ArrayList;
import java.util.List;

public class DataTest {
	//this class is used to generate data 
	public static String memberId;
	public static List<String> expectInfo = new ArrayList<String>();
	// function to generate a random string of length n
    public String getAlphaNumericString(int n, String random_str)
    {
  
        // chose a Character random from this String
        String AlphaNumericString = random_str;
  
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());
  
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                          .charAt(index));
        }
  
        return sb.toString();
    }
  
    public String[] generate_profile_information()
    {
  
        // Get the size n
        int n = 8;
        String random_str = "abcdefghijklmnopqrstuvxyz";
  
        String first_name = getAlphaNumericString(n, random_str);
        String last_name = getAlphaNumericString(n, random_str);
        String title = getAlphaNumericString(n, random_str);
        String company = getAlphaNumericString(n, random_str);
        String phone = "+65-" + getAlphaNumericString(n, "0123456789");
        String website = "https://" + getAlphaNumericString(n, random_str) + ".com";
        String email = getAlphaNumericString(n, random_str) + "@gmail.com";
        String[] information = {first_name, last_name, title, company, phone, website, email};
        return information;
    }
}