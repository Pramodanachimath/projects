package com.vfislk.training.service;

import java.util.List;

import com.vfislk.training.exceptions.PlanNotFoundException;
import com.vfislk.training.model.Plans;

public interface IPlansService {

	Plans addPlans(Plans plans);

	void updatePlans(Plans plans);

	void deletePlans(int planId);

	Plans getPlansById(int planId) throws PlanNotFoundException;

	List<Plans> getAllPlans();

	List<Plans> getPlansByAgent(String agentName) throws PlanNotFoundException;

	List<Plans> getPlansByCustomer(String firstName, String lastName) throws PlanNotFoundException;

	List<Plans> getPlansByPremium(double premium) throws PlanNotFoundException;

	List<Plans> getPlansByCoverage(String coverage) throws PlanNotFoundException;

	List<Plans> getPlansByAmount(double amount) throws PlanNotFoundException;

	List<Plans> getPlansByterm(String term) throws PlanNotFoundException;

	List<Plans> getPlanseByAge(int age) throws PlanNotFoundException;
	
	List<Plans> checkPremium(int age,double amount) throws PlanNotFoundException;
	
	List<Plans> checkAmount(int age,double premium) throws PlanNotFoundException;

	List<Plans> checkterm(int age,double amount,double premium) throws PlanNotFoundException;
	
	double calculateMaturity(int year,double amount);
}
