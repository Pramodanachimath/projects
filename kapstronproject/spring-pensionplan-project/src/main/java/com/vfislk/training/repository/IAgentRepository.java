package com.vfislk.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfislk.training.exceptions.AgentNotFoundExcepion;
import com.vfislk.training.model.Agent;
@Repository
public interface IAgentRepository extends JpaRepository<Agent, Integer>{

	List<Agent> findAgentByState(String state) throws AgentNotFoundExcepion;
	List<Agent> findAgentByphoneNumber(long phoneNumber) throws AgentNotFoundExcepion;	

	void updateAgent(Agent agent);

	List<Agent> findAgentByCustomers(String firstName, String lastName) throws AgentNotFoundExcepion;
	List<Agent> findAgentByPlans(String planName) throws AgentNotFoundExcepion;
	List<Agent> findAgentByPremium(double premium) throws AgentNotFoundExcepion;
	List<Agent> findAgentByCoverage(String coverage) throws AgentNotFoundExcepion;
	List<Agent> findAgentByAmount(double amount) throws AgentNotFoundExcepion;


}
