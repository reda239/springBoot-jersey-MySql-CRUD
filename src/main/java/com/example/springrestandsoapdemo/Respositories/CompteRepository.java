package com.example.springrestandsoapdemo.Respositories;

import com.example.springrestandsoapdemo.Entity.Comptes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Comptes,Long> {
}
