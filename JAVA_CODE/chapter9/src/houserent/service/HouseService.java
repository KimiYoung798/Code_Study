package houserent.service;

import houserent.domain.House;

public class HouseService {

    private House[] houses;
    private int idCounter = 0;

    //数组构造器
    public HouseService(int size) {
        //new houses
        houses = new House[size];
    }

    //update方法
    public boolean update(int findId, String name, String phone, String address, double rent, String state) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == findId) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("没找到对应id，输入有误");
            return false;
        } else {
            houses[index].setName(name);
            houses[index].setPhone(phone);
            houses[index].setAddress(address);
            houses[index].setRent(rent);
            houses[index].setState(state);
            return true;
        }
    }
    //find方法，查找对象
    public House find(int findId) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == findId) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("没找到对应id，输入有误");
            return null;
        } else {
            return houses[index];
        }
    }


    //del方法，查找删除对象并删除
    public boolean del(int delId) {

        //找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        } else {
            House[] tempArr = new House[houses.length - 1];
            for (int i = 0; i < tempArr.length; i++) {
                if (i < index) {
                    tempArr[i] = houses[i];
                    tempArr[i].setId(i + 1);
                }else {
                    tempArr[i] = houses[i + 1];
                    tempArr[i].setId(i + 1);
                }
            }
            houses = tempArr;
            return true;
        }
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
