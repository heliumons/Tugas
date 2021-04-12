package com.upscale.java06.service;

import com.upscale.java06.dto.CategoryRequest;
import com.upscale.java06.entity.Category;
import com.upscale.java06.exception.BadRequestException;
import com.upscale.java06.exception.EtNotFoundException;
import com.upscale.java06.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    // - validasi title dan description
    public void validateCategory(CategoryRequest request) throws BadRequestException {
        // - validasi title tidak boleh kosong
        if (request.getTitle().isEmpty()) throw new BadRequestException("title harus diisi gan!");
        // - validasi title > 5 karakter
        if (request.getTitle().length() < 5) throw new BadRequestException("title harus > 5 karakter!");
        // - validasi description tidak boleh kosong
        if (request.getDescription().isEmpty()) throw new BadRequestException("description harus diisi gan!");
        // categoryRepository.findByTitle();
    }

    // - find All
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    // - find by title
    public Category findByTitle(String title) throws EtNotFoundException {
        Category category = categoryRepository.findByTitle(title);
        if (category == null)  throw new EtNotFoundException("title: " + title + " tidak ditemukan!");
        return category;
    }

    // - create / save
    public Category save(CategoryRequest request) {
        Category category = new Category();
        category.setTitle(request.getTitle());
        category.setDescription(request.getDescription());
        return categoryRepository.save(category);
    }

    // - update
    public Category update(CategoryRequest request, Category category) {
        category.setTitle(request.getTitle());
        category.setDescription(request.getDescription());
        return categoryRepository.save(category);
    }

    // - delete
    public void delete(Integer id) throws EtNotFoundException {
        try {
            Optional<Category> cat = categoryRepository.findById(id);
            categoryRepository.delete(cat.get());
        } catch (Exception e) {
            throw new EtNotFoundException("Gagal Delete, ProductId: " + id + "tidak ditemukan");
        }
    }
}
