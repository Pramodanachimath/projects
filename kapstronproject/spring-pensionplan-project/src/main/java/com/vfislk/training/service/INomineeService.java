package com.vfislk.training.service;

import java.util.List;

import com.vfislk.training.exceptions.PlanNotFoundException;
import com.vfislk.training.model.Nominee;

public interface INomineeService {

	Nominee addNominee(Nominee nominee);

	void updateNominee(Nominee nominee);

	void deleteNominee(int nomineeId);

	Nominee getNomineeById(int nomineeId) throws PlanNotFoundException;

	List<Nominee> getAllNominees();

	List<Nominee> getNomineeByCustomer(String firstName, String lastName) throws PlanNotFoundException;

	List<Nominee> getNomineeByAge(int age) throws PlanNotFoundException;

	List<Nominee> getNomineeByRelation(String relationship) throws PlanNotFoundException;
}
