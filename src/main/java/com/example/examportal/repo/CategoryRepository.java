package com.example.examportal.repo;

import com.example.examportal.model.exam.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface CategoryRepository extends JpaRepository<Category,Long> {
}
