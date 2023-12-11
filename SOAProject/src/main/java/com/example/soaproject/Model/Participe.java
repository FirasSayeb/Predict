package com.example.soaproject.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Participe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "foot_id") // Name of the column in Participe table referencing Foot
    private Foot foot;

    @ManyToOne
    @JoinColumn(name = "jouer_id") // Name of the column in Participe table referencing Jouer
    private Jouer jouer;

    private int scored;

    private int time;


    public Participe() {
    }

    public Participe(Integer id, Foot foot, Jouer jouer, int scored, int time) {
        this.id = id;
        this.foot = foot;
        this.jouer = jouer;
        this.scored = scored;
        this.time = time;
    }

    public Participe(Foot foot, Jouer jouer, int scored, int time) {
        this.foot = foot;
        this.jouer = jouer;
        this.scored = scored;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public Jouer getJouer() {
        return jouer;
    }

    public void setJouer(Jouer jouer) {
        this.jouer = jouer;
    }

    public int getScored() {
        return scored;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Participe{" +
                "id=" + id +
                ", foot=" + foot +
                ", jouer=" + jouer +
                ", scored=" + scored +
                ", time=" + time +
                '}';
    }
}
