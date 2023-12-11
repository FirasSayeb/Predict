package com.example.soaproject.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Jouer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nom;
    private int age;

    public Jouer() {
    }

    public Jouer(Integer id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    public Jouer(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Jouer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }


}
