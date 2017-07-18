package com.springdata.app;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import 	org.springframework.data.mongodb.core.query.Query;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.springdata.entity.inquiryservice.MessageStatusType;
import com.springdata.entity.inquiryservice.PolicyInquiryResultType;
import com.springdata.entity.policy.MedicalMalpracticePolicyType;
import com.springdata.entity.policy.PolicyDetailType;
import com.springdata.repository.PolicyInquiryResultRepository;

//@SpringBootApplication
public class SpringdataMongodbApplication {
	static Logger log = LoggerFactory.getLogger("SpringdataMongodbApplication");
	static Gson gson = new Gson();
	
	public static void main(String[] args) {
		//SpringApplication.run(SpringdataMongodbApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
			
		PolicyInquiryResultType policyResult = new PolicyInquiryResultType();
		policyResult.setMessageId("test-policy-message");
		MessageStatusType messageStatus = new MessageStatusType();
		messageStatus.setMessageStatusCode("success");
		policyResult.setMessageStatus(messageStatus);
		List<MedicalMalpracticePolicyType> policyList = new ArrayList<MedicalMalpracticePolicyType>();
		MedicalMalpracticePolicyType policy = new MedicalMalpracticePolicyType();
		policy.setPolicyId("Athi1010");
		policyList.add(policy);
		policyResult.setMedicalMalpracticePolicy(policyList);
		
		PolicyInquiryResultRepository repo = context.getBean(PolicyInquiryResultRepository.class);
		log.debug("Policy Count before insert : " + repo.count());
		repo.save(policyResult);
		log.debug("Policy Count after insert: " + repo.count());
		//repo.delete(policyResult);
		repo.delete("{'_id':'test-policy-message'}");
		log.debug("Policy Count after remove: " + repo.count());
		
		/*MongoTemplate template = context.getBean(MongoTemplate.class);
		log.debug("Policy Count before insert : " + template.getCollection("policy").count());
		template.save(policyResult, "policy");
		log.debug("Policy Count after insert: " + template.getCollection("policy").count());
		template.remove(policyResult, "policy");
		log.debug("Policy Count after remove: " + template.getCollection("policy").count());
		
		Query query = query(where("PolicyId").is("H004036"));
		List<PolicyInquiryResultType> plist = template.find(query, PolicyInquiryResultType.class, "policy");
		log.debug(plist.toString());*/
		
		//MongoDbFactory factory = context.getBean(MongoDbFactory.class);
		//DB db = factory.getDb();
		/*MongoClient mongoClient = (MongoClient) context.getBean("mongoClient");
		DB db = mongoClient.getDB("oasispolicy");
		DBCollection collection = db.getCollection("policy");
		
		collection.insert(new BasicDBObject().append("PolicyId", "TestPolicy"));
		log.debug(collection.getFullName() + " collection count = " + collection.count());
		log.debug("Finding Policy : " + collection.findOne("PolicyId"));
		collection.remove(new BasicDBObject().append("PolicyId", "TestPolicy"));
		log.debug("Finding Policy Again : " + collection.findOne("PolicyId"));
		log.debug(collection.getFullName() + " collection count = " + collection.count());*/
		
		/*PolicyInquiryResultType policy = mongoClient.findOne(
                new Query(Criteria.where("MessageId").is(64)), PolicyInquiryResultType.class);
		System.out.println(userB1);*/
	
		String policyJson = null;
		try {
			policyJson = new String(Files.readAllBytes(Paths.get("C:\\Users\\502000755\\Downloads\\H004344.json")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(policyJson);
		
		//collection.insert(new BasicDBObject().append(policyJson));
		
		PolicyInquiryResultType resultType = gson.fromJson(policyJson, PolicyInquiryResultType.class);
		System.out.println(resultType);
		
		/*System.out.println(resultType.getMessageId());
		System.out.println(resultType.getMessageStatus().getMessageStatusCode());*/

		
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
		
		context.close();
	}

}
