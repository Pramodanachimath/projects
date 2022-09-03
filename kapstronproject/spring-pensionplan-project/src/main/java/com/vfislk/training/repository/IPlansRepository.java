package com.vfislk.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfislk.training.exceptions.PlanNotFoundException;
import com.vfislk.training.model.Plans;

@Repository
public interface IPlansRepository extends JpaRepository<Plans, Integer>{


	List<Plans> findPlansByPremium(double premium) throws PlanNotFoundException;
	List<Plans> findPlansByCoverage(String coverage) throws PlanNotFoundException;
	List<Plans> findPlansByAmount(double amount) throws PlanNotFoundException;
	List<Plans> findPlansByterm(String term) throws PlanNotFoundException;
	List<Plans> findPlanseByAge(int age) throws PlanNotFoundException;
	List<Plans> checkPremium(int age,double amount) throws PlanNotFoundException;
	List<Plans> checkAmount(int age,double premium) throws PlanNotFoundException;
	List<Plans> checkterm(int age,double amount,double premium) throws PlanNotFoundException;
	
	void updatePlans(Plans plans);


	List<Plans> findPlansByAgent(String agentName) throws PlanNotFoundException;
	
	List<Plans> findPlansByCustomer(String firstName, String lastName) throws PlanNotFoundException;
	
	
}
