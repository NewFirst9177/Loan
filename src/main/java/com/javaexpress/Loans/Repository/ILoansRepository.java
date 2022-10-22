package com.javaexpress.Loans.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaexpress.Loans.model.Loans;
@Repository
public interface ILoansRepository extends CrudRepository<Loans, Integer> {

	Iterable<Loans> findByCustomerId(int customerId);
}
