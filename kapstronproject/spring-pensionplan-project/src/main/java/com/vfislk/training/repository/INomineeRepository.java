package com.vfislk.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfislk.training.exceptions.PlanNotFoundException;
import com.vfislk.training.model.Nominee;

@Repository
public interface INomineeRepository extends JpaRepository<Nominee, Integer>{

	List<Nominee> findNomineeByAge(int age) throws PlanNotFoundException;
	List<Nominee> findNomineeByRelation(String relationship) throws PlanNotFoundException;

	void updateNominee(Nominee nominee);

	List<Nominee> findNomineeByCustomer(String firstName, String lastName) throws PlanNotFoundException;
	
}
