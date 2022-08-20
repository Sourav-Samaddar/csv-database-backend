package com.csvdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csvdatabase.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
