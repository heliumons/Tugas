package com.upscale.java06.controller;

import com.upscale.java06.dto.CategoryRequest;
import com.upscale.java06.entity.Category;
import com.upscale.java06.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    // @TODO
    // - list / findAll
    @GetMapping("")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("{title}")
    public Category findByTitle(@PathVariable("title") String title) {
        return categoryService.findByTitle(title);
    }

    @PostMapping("")
    public Category save(@RequestBody CategoryRequest request) {
        // - untuk validasi
        categoryService.validateCategory(request);
        // - untuk save
        return categoryService.save(request);
    }

    // - update
    @PutMapping("{title}")
    public Category update(@PathVariable("title") String title,
                           @RequestBody CategoryRequest request) {
        // - validasi
        categoryService.validateCategory(request);
        // - cari category untuk diupdate
        Category category = categoryService.findByTitle(title);
        return categoryService.update(request, category);
    }

    // @TODO
    // - delete
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        categoryService.delete(id);
    }
}
