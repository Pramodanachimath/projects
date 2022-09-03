package com.vfislk.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfislk.training.exceptions.CustomerNotFoundExcepion;
import com.vfislk.training.model.Customer;
@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

	List<Customer> findCustomerByPhoneNumber(long phoneNumber) throws CustomerNotFoundExcepion;
	List<Customer> findCustomerByOccupation(String occupation) throws CustomerNotFoundExcepion;
	List<Customer> findCustomerByCustomerAge(int customerAge) throws CustomerNotFoundExcepion;

	void updateCustomer(Customer customer);

	List<Customer> findCustomerByAgent(String agentName) throws CustomerNotFoundExcepion;
	List<Customer> findCustomerByPlans(String planName) throws CustomerNotFoundExcepion;
	List<Customer> findCustomerByPremium(double premium) throws CustomerNotFoundExcepion;
	List<Customer> findCustomerByCoverage(String coverage) throws CustomerNotFoundExcepion;
	List<Customer> findCustomerByAmount(double amount) throws CustomerNotFoundExcepion;
	List<Customer> findCustomerByNominee(String nomineeName) throws CustomerNotFoundExcepion;

	
}
