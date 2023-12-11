package com.example.soaproject.Repository;

import com.example.soaproject.Model.Jouer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JouerRepository extends JpaRepository<Jouer,Integer> {
    Jouer findJouerByNom(String nom);
}
