package com.sportshoe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoe.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}