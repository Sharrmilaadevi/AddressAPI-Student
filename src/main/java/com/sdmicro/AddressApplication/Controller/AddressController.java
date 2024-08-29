package com.sdmicro.AddressApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sdmicro.AddressApplication.Response.AddressResponse;
import com.sdmicro.AddressApplication.Service.AddressService;



@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	//Get the Address based on student_id
	@GetMapping("/address/{student_id}")
	public ResponseEntity<AddressResponse> getAddressByStudentId(@PathVariable int student_id){
		AddressResponse addressResponse= addressService.getAddressByStudentId(student_id);
	
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
		
	}
	

}
