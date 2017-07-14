package com.springdata.app;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.springdata.entity.inquiryservice.PolicyInquiryResultType;

@SpringBootApplication
public class SpringdataMongodbApplication {
	static Gson gson = new Gson();
	public static void main(String[] args) {
		//SpringApplication.run(SpringdataMongodbApplication.class, args);

		String policyJson = null;
		try {
			policyJson = new String(Files.readAllBytes(Paths.get("C:\\Users\\502000755\\Downloads\\H004344.json")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(policyJson);
		
		PolicyInquiryResultType resultType = gson.fromJson(policyJson, PolicyInquiryResultType.class);
		/*System.out.println(resultType.getMessageId());
		System.out.println(resultType.getMessageStatus().getMessageStatusCode());*/
		System.out.println(resultType);
		
		/*JSONObject jsonObj = new JSONObject(policyJson);
		System.out.println(jsonObj);
		ObjectMapper mapper = new ObjectMapper();
		try {
			resultType = mapper.readValue(jsonObj.toString(), PolicyInquiryResultType.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(resultType.getMessageId());
		System.out.println(resultType.getMessageStatus().getMessageStatusCode());*/
	}

}
