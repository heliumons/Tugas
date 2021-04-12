package com.upscale.java06.controller;

import com.upscale.java06.dto.TransactionRequest;
import com.upscale.java06.entity.Category;
import com.upscale.java06.entity.Transaction;
import com.upscale.java06.service.CategoryService;
import com.upscale.java06.service.TransactionService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    TransactionService transactionService;
    @Autowired
    CategoryService categoryService;

    // - findAll
    @GetMapping("/categories")
    public List<Transaction> findAll() {
        return transactionService.findAll();
    }

    // - findById
    @GetMapping("{id}/categories/")
    public Transaction findById(@PathVariable("id") Integer id) {
        return transactionService.findById(id);
    }

    // - create
    @PostMapping("/categories/{title}")
    public Transaction save(@PathVariable("title") String title,
                            @RequestBody TransactionRequest request) {
        // @TODO
        // - validasi transaction
        transactionService.validateTransaction(request);
        // - find category by title
        Category category = categoryService.findByTitle(title);
        return transactionService.save(request, category);
    }

    // - update
    @PutMapping("{id}/categories/{title}")
    public Transaction update(@PathVariable("id") Integer id,
                              @PathVariable("title") String title,
                              @RequestBody TransactionRequest request) {
        transactionService.validateTransaction(request);
        Transaction tran = transactionService.findById(id);
        Category cat = categoryService.findByTitle(title);
        return transactionService.update(request, tran, cat);
    }

    // - delete
    @DeleteMapping("{id}/categories/")
    public void delete(@PathVariable("id") Integer id) {
        transactionService.delete(id);
    }
}
