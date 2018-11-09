/**
 * 
 */
package org.springframework.samples.petclinic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shahzad.hussain
 *
 */

@RestController
@RequestMapping(value = "/api")
public class Test {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Object> hello() {

		Person person = new Person();
		person.setFirstName("Shahzad");
		person.setLastName("Hussain");
		person.setAddress("Sahebganj Muzaffarpur");
		return new ResponseEntity<>(person, HttpStatus.OK);
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Object> hello(@RequestBody Person person) {

		return new ResponseEntity<>(person, HttpStatus.OK);
	}

	class Person {
		private String firstName;
		private String lastName;
		private String address;

		public Person() {
		}

		public Person(String firstName, String lastName, String address) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	}

}
