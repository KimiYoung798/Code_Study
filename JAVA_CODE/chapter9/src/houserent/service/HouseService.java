package houserent.service;

import houserent.domain.House;

public class HouseService {

    private House[] houses;

    public HouseService(int size) {
        //new houses
        houses = new House[size];

    }

    //list方法
    public House[] list() {
        return houses;
    }

}
