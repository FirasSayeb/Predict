package com.example.soaproject.Repository;

import com.example.soaproject.Model.Participe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ParticipeRepository extends JpaRepository<Participe,Integer> {
    @Query("SELECT AVG(p.time) FROM Participe p WHERE p.jouer.nom = :playerName AND p.scored = 1")
    Double findAverageTimeByPlayerNameAndScoredEqualsOne(String playerName);
}
