package com.ContactApp.ContactApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ContactApp.ContactApp.model.HR;
import com.ContactApp.ContactApp.repository.HRRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/hr")
public class HRController {

      @Autowired
      private HRRepository hrRepository;

      @PostMapping
      public HR addHR(@RequestBody HR hr) {
            return hrRepository.save(hr);

      }

}
