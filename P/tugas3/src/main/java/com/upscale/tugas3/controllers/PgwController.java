package com.upscale.tugas3.controllers;

import java.util.List;

import javax.management.relation.RelationNotFoundException;

import com.upscale.tugas3.models.Pegawai;
import com.upscale.tugas3.repositories.PgwRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PgwController {

    @Autowired
    private PgwRepository PgwRepo;

    @GetMapping("/")
    public List<Pegawai> aList() {
        return PgwRepo.findAll();
    }

    @GetMapping("pegawai/{id}")
    public ResponseEntity<Pegawai> getPegawaiById(@PathVariable(value = "id") Integer id)
            throws RelationNotFoundException {
        Pegawai pgw = PgwRepo.findById(id)
                .orElseThrow(() -> new RelationNotFoundException("Pegawai not found for this id :: " + id));
        return ResponseEntity.ok().body(pgw);
    }

    @PostMapping("create")
    public Pegawai createPegawai(@RequestBody Pegawai pegawai) {
        if (pegawai.getTemp() >= 33 && pegawai.getSleepHour() >= 6) {
            pegawai.setFitNote("Fit To Work");
        } else if (pegawai.getTemp() <= 37 && pegawai.getSleepHour() >= 6) {
            pegawai.setFitNote("Fit To Work");
        } else {
            pegawai.setFitNote("Not Fit To Work");
        }
        return PgwRepo.save(pegawai);
    }

    @PutMapping("update/{id}")
    public Pegawai updatePegawai(@PathVariable(value = "id") Integer id, @RequestBody Pegawai pegawai)
            throws RelationNotFoundException {
        return PgwRepo.findById(id).map(question -> {
            question.setName(pegawai.getName());
            question.setTemp(pegawai.getTemp());
            question.setSleepHour(pegawai.getSleepHour());
            if (pegawai.getTemp() >= 33 && pegawai.getSleepHour() >= 6) {
                question.setFitNote("Fit To Work");
            } else if (pegawai.getTemp() <= 37 && pegawai.getSleepHour() >= 6) {
                question.setFitNote("Fit To Work");
            } else {
                question.setFitNote("Not Fit To Work");
            }
            return PgwRepo.save(question);
        }).orElseThrow(() -> new RelationNotFoundException("Question not found with id " + id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deletePegawai(@PathVariable(value = "id") Integer id) throws RelationNotFoundException {
        return PgwRepo.findById(id).map(question -> {
            PgwRepo.delete(question);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new RelationNotFoundException("Question not found with id " + id));
    }
}
