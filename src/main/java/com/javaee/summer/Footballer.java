package com.javaee.summer;

public class Footballer {
    Long id;
    String name;
    String surname;
    String club;
    int salary;
    int transferPrice;

    private static Long idCount = 1L;

    public Footballer(String name, String surname, String club, int salary, int transferPrice) {
        this.id = idCount;
        this.name = name;
        this.surname = surname;
        this.club = club;
        this.salary = salary;
        this.transferPrice = transferPrice;

        idCount++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(int transferPrice) {
        this.transferPrice = transferPrice;
    }
}
