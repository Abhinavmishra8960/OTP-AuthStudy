package com.example.otpgen.otpGen.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class CustomerResponse {
		
		private String uid;
		
		private String oid;
		
		private String email;
		
		
		private String message;
        

		public CustomerResponse() {
			super();
		}


		public CustomerResponse(String uid, String oid, String email, String message) {
			super();
			this.uid = uid;
			this.oid = oid;
			this.email = email;
			this.message = message;
		}


		public String getUid() {
			return uid;
		}


		public void setUid(String uid) {
			this.uid = uid;
		}


		public String getOid() {
			return oid;
		}


		public void setOid(String oid) {
			this.oid = oid;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}
		
	}


