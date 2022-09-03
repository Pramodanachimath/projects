package com.vfislk.training.service;

import java.util.List;

import com.vfislk.training.exceptions.AgentNotFoundExcepion;
import com.vfislk.training.model.Agent;

public interface IAgentService {

	Agent addAgent(Agent agent);

	void updateAgent(Agent agent);

	void deleteAgent(int agentId);

	Agent getAgentById(int agentId) throws AgentNotFoundExcepion;

	List<Agent> getAllAgents();

	List<Agent> getAgentByCustomers(String firstName, String lastName) throws AgentNotFoundExcepion;

	List<Agent> getAgentByPlans(String planName) throws AgentNotFoundExcepion;

	List<Agent> getAgentByPremium(double premium) throws AgentNotFoundExcepion;

	List<Agent> getAgentByCoverage(String coverage) throws AgentNotFoundExcepion;

	List<Agent> getAgentByAmount(double amount) throws AgentNotFoundExcepion;

	List<Agent> getAgentByState(String state) throws AgentNotFoundExcepion;

	List<Agent> getAgentByphoneNumber(long phoneNumber) throws AgentNotFoundExcepion;

}
