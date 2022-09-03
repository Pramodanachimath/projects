package com.vfislk.training.service;

import java.util.List;

import com.vfislk.training.exceptions.CustomerNotFoundExcepion;
import com.vfislk.training.model.Customer;

public interface ICustomerService {

	Customer addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(int customerId);

	Customer getCustomerById(int customerId) throws CustomerNotFoundExcepion;

	List<Customer> customersList();

	List<Customer> getCustomerByAgent(String agentName) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByPlans(String planName) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByPremium(double premium) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByCoverage(String coverage) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByAmount(double amount) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByNominee(String nomineeName) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByPhoneNumber(long phoneNumber) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByOccupation(String occupation) throws CustomerNotFoundExcepion;

	List<Customer> getCustomerByCustomerAge(int customerAge) throws CustomerNotFoundExcepion;

}
