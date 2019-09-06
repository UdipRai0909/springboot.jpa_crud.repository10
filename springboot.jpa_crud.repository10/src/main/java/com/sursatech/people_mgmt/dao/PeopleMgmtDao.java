package com.sursatech.people_mgmt.dao;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import com.sursatech.people_mgmt.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {

	@Transactional
	@Modifying(clearAutomatically=true)
	@Query(value="UPDATE Person p SET email=:newEmail WHERE id=:personId ")
	void updatePersonEmailById(@Param("personId")int id, @Param("newEmail")String newEmail);

	
}
