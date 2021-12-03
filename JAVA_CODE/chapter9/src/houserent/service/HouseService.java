package houserent.service;

import houserent.domain.House;

public class HouseService {

    private House[] houses;
    private int idCounter = 0;

    public HouseService(int size) {
        //new houses
        houses = new House[size];
    }

    //add方法，添加新对象，返回boolean
    public void add(House newHouse) {
        House[] tempArr = new House[houses.length + 1];
        System.arraycopy(houses,0,tempArr,0,houses.length);
        tempArr[tempArr.length - 1] = newHouse;
        houses = tempArr;
        //更新id自增
        newHouse.setId(++idCounter);
    }
    //list方法
    public House[] list() {
        return houses;
    }

}
