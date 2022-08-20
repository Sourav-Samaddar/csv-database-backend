package com.csvdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.csvdatabase.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
