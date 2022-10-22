package com.javaexpress.Loans.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.Loans.Repository.ILoansRepository;
import com.javaexpress.Loans.model.Customer;
import com.javaexpress.Loans.model.Loans;

@RestController
public class LoanController {
	
	@Autowired
	private ILoansRepository iLoansRepository;
	
	@GetMapping("myLoans")
	public List<Loans> getALLLoansdetails(@RequestBody Customer customer) {
		Iterable<Loans> findAll = iLoansRepository.findByCustomerId(customer.getCustomerId());
		return (List<Loans>) findAll;
	}

}
