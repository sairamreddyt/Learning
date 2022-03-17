package com.restful.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}