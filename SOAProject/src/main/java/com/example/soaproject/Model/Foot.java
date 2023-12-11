package com.example.soaproject.Model;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table
public class Foot {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Date date;

    public Foot() {
    }

    public Foot(Integer id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Foot(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
