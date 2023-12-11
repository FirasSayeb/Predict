package com.example.soaproject;

import com.example.soaproject.Repository.JouerRepository;
import com.example.soaproject.Repository.ParticipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class MainController {

    @Autowired
    ParticipeRepository repository;

    @Autowired
    JouerRepository jouerRepository;

    @RequestMapping(path = "predict")
    public String predict(@RequestBody Predict predict) {
        int time= predict.getTime();
        String playerName=predict.getNom();
        if (time < 0 || time > 120) {
            return "Wrong time";
        } else if (jouerRepository.findJouerByNom(playerName) == null) {
            return "Jouer Not Found";
        } else {
            Double averageTime = repository.findAverageTimeByPlayerNameAndScoredEqualsOne(playerName);
            if (averageTime == null) {
                return "Unable to calculate average time";
            }
            if (time >= averageTime) {
                return "Will score";
            } else {
                return "Will not score";
            }
        }
    }
}
