package com.upscale.tugas3.controllers;

import java.util.List;

import com.upscale.tugas3.models.Pegawai;
import com.upscale.tugas3.repositories.PgwRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PgwController {

    @Autowired
    private PgwRepository PgwRepo;

    @GetMapping("/")
    public List<Pegawai> aList() {
        return PgwRepo.findAll();
    }

    // @GetMapping("/")
    // public String index() {
    // return "SELAMAT ANDA BERHASIL SAMPAI SINI";
    // }
}
