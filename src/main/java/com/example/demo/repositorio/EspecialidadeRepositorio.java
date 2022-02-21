package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dominio.Especialidade;

@Repository
public interface EspecialidadeRepositorio extends JpaRepository<Especialidade, Integer>{

}
