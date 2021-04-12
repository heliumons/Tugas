package com.upscale.java06.repository;

import com.upscale.java06.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("SELECT d FROM Category d WHERE d.title = :title")
    Category findByTitle(@Param("title") String title);
}
