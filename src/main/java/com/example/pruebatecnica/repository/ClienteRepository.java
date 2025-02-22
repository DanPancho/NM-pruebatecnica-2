package com.example.pruebatecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pruebatecnica.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
