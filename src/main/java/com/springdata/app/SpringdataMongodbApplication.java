package com.springdata.app;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

@SpringBootApplication
public class SpringdataMongodbApplication {
	 static Gson gson = new Gson();
	 public static void main(String[] args) {
         //SpringApplication.run(SpringdataMongodbApplication.class, args);
		 String policyJson = args[1];
		 PolicyInquiryResultType resultType = gson.fromJson(policyJson, PolicyInquiryResultType);
 }

}
