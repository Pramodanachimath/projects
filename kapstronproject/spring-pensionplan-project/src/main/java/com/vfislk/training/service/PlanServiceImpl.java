package com.vfislk.training.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfislk.training.exceptions.PlanNotFoundException;
import com.vfislk.training.model.Plans;
import com.vfislk.training.repository.IPlansRepository;
@Service
public class PlanServiceImpl implements IPlansService {

	IPlansRepository plansRepository;

	@Autowired
	public void setPlansRepository(IPlansRepository plansRepository) {
		this.plansRepository = plansRepository;
	}

	@Override
	public Plans addPlans(Plans plans) {
		return plansRepository.save(plans);
	}

	@Override
	public void updatePlans(Plans plans) {
		plansRepository.save(plans);
	}

	@Override
	public void deletePlans(int planId) {
		plansRepository.deleteById(planId);
	}

	@Override
	public Plans getPlansById(int planId) throws PlanNotFoundException {
		return plansRepository.findById(planId).get();
	}

	@Override
	public List<Plans> getAllPlans() {
		return plansRepository.findAll();
	}

	@Override
	public List<Plans> getPlansByAgent(String agentName) throws PlanNotFoundException {
		return plansRepository.findPlansByAgent(agentName);
	}

	@Override
	public List<Plans> getPlansByCustomer(String firstName, String lastName) throws PlanNotFoundException {
		return plansRepository.findPlansByCustomer(firstName, lastName);
	}

	@Override
	public List<Plans> getPlansByPremium(double premium) throws PlanNotFoundException {
		return plansRepository.findPlansByPremium(premium);
	}

	@Override
	public List<Plans> getPlansByCoverage(String coverage) throws PlanNotFoundException {
		return plansRepository.findPlansByCoverage(coverage);
	}

	@Override
	public List<Plans> getPlansByAmount(double amount) throws PlanNotFoundException {
		return plansRepository.findPlansByAmount(amount);
	}

	@Override
	public List<Plans> getPlansByterm(String term) throws PlanNotFoundException {
		return plansRepository.findPlansByterm(term);
	}

	@Override
	public List<Plans> getPlanseByAge(int age) throws PlanNotFoundException {
		return plansRepository.findPlanseByAge(age);
	}

	@Override
	public List<Plans> checkPremium(int age, double amount) throws PlanNotFoundException {
		return plansRepository.checkPremium(age, amount);
	}

	@Override
	public List<Plans> checkAmount(int age, double premium) throws PlanNotFoundException {
		return plansRepository.checkAmount(age, premium);
	}

	@Override
	public List<Plans> checkterm(int age, double amount, double premium) throws PlanNotFoundException {
		return plansRepository.checkterm(age, amount, premium);
	}

	@Override
	public double calculateMaturity(int year,double amount) {
		int n=year*12;
		double r=0.48*12;
		double MV=amount*Math.pow((1+r), n);
		return MV;
	}

}
