package com.sdmicro.AddressApplication.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdmicro.AddressApplication.Entity.Address;
import com.sdmicro.AddressApplication.Repository.AddressRepository;
import com.sdmicro.AddressApplication.Response.AddressResponse;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressrepo;
	
	@Autowired
	ModelMapper modelmapper;
	
	
	 public AddressResponse getAddressByStudentId(int student_id) {
		
		 Address address= addressrepo.findAddressByStudent_Id(student_id);
		 
		 AddressResponse addressresponse = modelmapper.map(address, AddressResponse.class);
		 
		 return addressresponse;
		 
	 }
}
