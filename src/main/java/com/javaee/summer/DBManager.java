package com.javaee.summer;

import java.util.ArrayList;

public class DBManager {
    static ArrayList<Footballer> footballers = new ArrayList<>();

    static {
        footballers.add(new Footballer(
                  "Cristiano", "Ronaldo", "Juventus", 30000000, 70000000
        ));
        footballers.add(new Footballer(
                  "Vinicius", "Junior", "Real Madrid", 6000000, 120000000
        ));
        footballers.add(new Footballer(
                  "Ruslan", "Malinovskyi", "Atlanta", 4000000, 15000000
        ));
    }
    static void addFootballer(Footballer footballer) {
        footballers.add(footballer);
    } //this method adds new footballer into list

    static Footballer getFootballer(Long id) {
        return footballers.get(id.intValue());
    } //this method returns an object of footballer by id

    static ArrayList<Footballer> getAllFootballers() {
        return footballers;
    } //this method returns a list of all footballers

    void deleteFootballer(Long id) {
        this.footballers.remove(id.intValue());
    }
}
