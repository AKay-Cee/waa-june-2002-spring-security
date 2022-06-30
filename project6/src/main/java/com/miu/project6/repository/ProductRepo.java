package com.miu.project6.repository;

import edu.miu.springsecurity1.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
}
