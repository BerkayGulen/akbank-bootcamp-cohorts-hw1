package service;

import model.House;
import model.SummerHouse;
import model.Villa;

import java.util.ArrayList;
import java.util.List;

public class ResidenceBuilder {

//    private List<House> houseList;
//    private List<SummerHouse> summerHouseList;
//    private List<Villa> villaList;
//    private List<Residence> residenceList;
//
//    public ResidenceBuilder() {
//        this.houseList = new ArrayList<>();
//        this.summerHouseList = new ArrayList<>();
//        this.villaList = new ArrayList<>();
//        this.residenceList = new ArrayList<>();
//    }
//
    public List<House> createHouseList(){
        List<House> houseList = new ArrayList<>();
        houseList.add(new House(50000,250,2,1));
        houseList.add(new House(100000,300,4,1));
        houseList.add(new House(200000,350,4,2));
        return houseList;
    }

    public List<Villa> createVillaList(){
        List<Villa> villaList = new ArrayList<>();
        villaList.add(new Villa(300000,400,4,2));
        villaList.add(new Villa(500000,500,5,2));
        villaList.add(new Villa(700000,500,6,2));

        return villaList;
    }

    public List<SummerHouse> createSummerHouseList(){
        List<SummerHouse> summerHouseList = new ArrayList<>();
        summerHouseList.add(new SummerHouse(100000,600,6,1));
        summerHouseList.add(new SummerHouse(900000,550,4,2));
        summerHouseList.add(new SummerHouse(850000,480,3,2));
        return summerHouseList;
    }
}
