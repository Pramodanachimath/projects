package com.vfislk.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vfislk.training.exceptions.CustomerNotFoundExcepion;
import com.vfislk.training.model.Customer;
import com.vfislk.training.repository.ICustomerRepository;
@Service
public class CustomerServiceImpl implements ICustomerService {

	ICustomerRepository customerRepository;

	@Autowired
	public void setCustomerRepository(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer getCustomerById(int customerId) throws CustomerNotFoundExcepion {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public List<Customer> customersList() {
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> getCustomerByAgent(String agentName) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByAgent(agentName);
	}

	@Override
	public List<Customer> getCustomerByPlans(String planName) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByPlans(planName);
	}

	@Override
	public List<Customer> getCustomerByPremium(double premium) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByPremium(premium);
	}

	@Override
	public List<Customer> getCustomerByCoverage(String coverage) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByCoverage(coverage);
	}

	@Override
	public List<Customer> getCustomerByAmount(double amount) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByAmount(amount);
	}

	@Override
	public List<Customer> getCustomerByNominee(String nomineeName) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByNominee(nomineeName);
	}

	@Override
	public List<Customer> getCustomerByPhoneNumber(long phoneNumber) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByPhoneNumber(phoneNumber);
	}

	@Override
	public List<Customer> getCustomerByOccupation(String occupation) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByOccupation(occupation);
	}

	@Override
	public List<Customer> getCustomerByCustomerAge(int customerAge) throws CustomerNotFoundExcepion {
		return customerRepository.findCustomerByCustomerAge(customerAge);
	}

}
