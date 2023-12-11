package com.example.soaproject;

public class Predict {
    String nom;
    int time;

    public Predict() {
    }

    public Predict(String nom, int time) {
        this.nom = nom;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Predict{" +
                "nom='" + nom + '\'' +
                ", time=" + time +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
