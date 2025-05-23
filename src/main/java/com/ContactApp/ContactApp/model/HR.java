package com.ContactApp.ContactApp.model;

import org.springframework.data.*;

@Document(collection = "hr_data")
public class HR {
      @Id
      private String Id;
      private String name;
      private String email;
      private String company;

      public HR() {
      };

      public HR(String name, String email, String company) {
            this.name = name;
            this.email = email;
            this.company = company;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getEmail() {
            return email;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getName() {
            return name;
      }

      public void setCompany(String company) {
            this.company = company;
      }

      public String getCompany() {
            return company;
      }
}
