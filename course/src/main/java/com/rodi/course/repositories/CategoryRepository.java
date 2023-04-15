package com.rodi.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rodi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
