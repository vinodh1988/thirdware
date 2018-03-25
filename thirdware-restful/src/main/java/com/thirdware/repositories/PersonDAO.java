package com.thirdware.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.thirdware.entity.Person;


public interface PersonDAO extends CrudRepository<Person, Long>{
 
	  @Query("from Person where sno=:sno")
		public Person findBySno(@Param("sno") int sno);
	  @Query("from Person where city=:city")
	  public List<Person> findByCity(@Param("city")String city);
}
