package com.upscale.tugas3.repositories;

import com.upscale.tugas3.models.Pegawai;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PgwRepository extends JpaRepository<Pegawai, Integer> {

}
