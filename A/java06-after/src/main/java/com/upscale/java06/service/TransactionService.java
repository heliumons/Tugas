package com.upscale.java06.service;

import com.upscale.java06.dto.TransactionRequest;
import com.upscale.java06.entity.Category;
import com.upscale.java06.entity.Transaction;
import com.upscale.java06.exception.BadRequestException;
import com.upscale.java06.exception.EtNotFoundException;
import com.upscale.java06.repository.CategoryRepository;
import com.upscale.java06.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public void validateTransaction(TransactionRequest request) throws  BadRequestException {
        // - validasi title tidak boleh kosong
        if (request.getNote().isEmpty()) throw new BadRequestException("Note harus diisi gan!");
        // - validasi title > 5 karakter
        if (request.getNote().length() < 5) throw new BadRequestException("Note harus > 5 karakter!");
        // - validasi description tidak boleh kosong
//        if (request.getAmount().isNaN()) throw new BadRequestException("Amount");
    }

    // - find All
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    // - find By Id
    public Transaction findById(Integer id) throws EtNotFoundException {
        Optional<Transaction> tran = transactionRepository.findById(id);
        if (tran.isEmpty()) throw new EtNotFoundException("id : " + id + " Tidak Ditemukan" );
        return tran.get();
    }

    // - create / save
    public Transaction save(TransactionRequest request, Category category) {
        Transaction transaction = new Transaction();
        transaction.setNote(request.getNote());
        transaction.setAmount(request.getAmount());
        // - set category
        transaction.setCategory(category);
        return transactionRepository.save(transaction);
    }

    // - update / save
    public Transaction update(TransactionRequest request, Transaction tran, Category category) {
        tran.setNote(request.getNote());
        tran.setAmount(request.getAmount());
        tran.setCategory(category);
        return transactionRepository.save(tran);
    }

    // - delete
    public void delete(Integer id) throws EtNotFoundException{
        try {
            Optional<Transaction> tran = transactionRepository.findById(id);
            transactionRepository.delete(tran.get());
        } catch (Exception e) {
            throw new EtNotFoundException("Gagal Delete, TransactionId: " + id + " tidak ditemukan");
        }
    }
}
