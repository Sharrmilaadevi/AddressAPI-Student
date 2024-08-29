package com.sdmicro.AddressApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sdmicro.AddressApplication.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	
	@Query(nativeQuery=true, value="SELECT a.idaddress, a.lane1, a.lane2, a.state, a.zip, a.student_id\n"
			+ "FROM Ems.address a\n"
			+ "JOIN Ems.student s ON a.student_id = s.rollno\n"
			+ "WHERE a.student_id = :student_id")
	public Address findAddressByStudent_Id(@Param("student_id") int student_id);

}
