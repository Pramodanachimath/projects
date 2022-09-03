package com.vfislk.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfislk.training.exceptions.AgentNotFoundExcepion;
import com.vfislk.training.model.Agent;
import com.vfislk.training.repository.IAgentRepository;
@Service
public class AgentServiceImpl implements IAgentService {

	IAgentRepository agentRepository;

	@Autowired
	public void setAgentRepository(IAgentRepository agentRepository) {
		this.agentRepository = agentRepository;
	}

	@Override
	public Agent addAgent(Agent agent) {
		return agentRepository.save(agent);
	}

	@Override
	public void updateAgent(Agent agent) {
		agentRepository.save(agent);
	}

	@Override
	public void deleteAgent(int agentId) {
		agentRepository.deleteById(agentId);
	}

	@Override
	public Agent getAgentById(int agentId) throws AgentNotFoundExcepion {
		return agentRepository.findById(agentId).get();
	}

	@Override
	public List<Agent> getAllAgents() {
		return agentRepository.findAll();
	}

	@Override
	public List<Agent> getAgentByCustomers(String firstName, String lastName) throws AgentNotFoundExcepion {
		return agentRepository.findAgentByCustomers(firstName, lastName);
	}

	@Override
	public List<Agent> getAgentByPlans(String planName) throws AgentNotFoundExcepion {
		return agentRepository.findAgentByPlans(planName);
	}

	@Override
	public List<Agent> getAgentByPremium(double premium) throws AgentNotFoundExcepion {
		return agentRepository.findAgentByPremium(premium);
	}

	@Override
	public List<Agent> getAgentByCoverage(String coverage) throws AgentNotFoundExcepion {
		return agentRepository.findAgentByCoverage(coverage);
	}

	@Override
	public List<Agent> getAgentByAmount(double amount) throws AgentNotFoundExcepion {
		return agentRepository.findAgentByAmount(amount);
	}

	@Override
	public List<Agent> getAgentByState(String state) throws AgentNotFoundExcepion {
		return agentRepository.findAgentByState(state);
	}

	@Override
	public List<Agent> getAgentByphoneNumber(long phoneNumber) throws AgentNotFoundExcepion {
		return agentRepository.findAgentByphoneNumber(phoneNumber);
	}

}
