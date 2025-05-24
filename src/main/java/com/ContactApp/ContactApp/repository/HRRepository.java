package com.ContactApp.ContactApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ContactApp.ContactApp.model.HR;

public interface HRRepository extends MongoRepository<HR, String> {
      // You can add custom query methods here if needed
}
