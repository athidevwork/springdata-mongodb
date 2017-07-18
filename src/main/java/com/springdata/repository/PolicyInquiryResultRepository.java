/**
 * 
 */
package com.springdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springdata.entity.inquiryservice.PolicyInquiryResultType;

/**
 * @author User
 *
 */
public interface PolicyInquiryResultRepository extends MongoRepository<PolicyInquiryResultType, String> {

}
