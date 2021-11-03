package com.company;

public class House {
    private    int id;
    private      String Nomerkv,
            square,
            floor,
            rooms,
            street,
            building,
            srok;
    public House(){
    }

    public int getId() {
        return id;
    }

    public String getNomerkv() {
        return Nomerkv;
    }

    public String getSquare() {
        return square;
    }

    public String getFloor() {
        return floor;
    }

    public String getRooms() {
        return rooms;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getSrok() {
        return srok;
    }

    public House(int id, String nomerkv, String square, String floor, String rooms, String street, String building, String srok) {
        this.id = id;
        Nomerkv = nomerkv;
        this.square = square;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.building = building;
        this.srok = srok;
    }

    @Override
    public String toString() {
        return "com.company.House{" +
                "id=" + id +
                ", Nomerkv='" + Nomerkv + '\'' +
                ", square='" + square + '\'' +
                ", floor='" + floor + '\'' +
                ", rooms='" + rooms + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", srok='" + srok + '\'' +
                '}';
    }
}
