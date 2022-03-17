package com.sportshoe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoe.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}