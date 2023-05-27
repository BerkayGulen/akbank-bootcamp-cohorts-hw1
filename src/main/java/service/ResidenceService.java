package service;

import model.House;
import model.Residence;
import model.SummerHouse;
import model.Villa;

import java.util.List;

public class ResidenceService {

    public double getTotalPriceOfHouse(List<House> houseList) {
        List<? extends Residence> upcasted = houseList;
        return calculateTotalPrice((List<Residence>) upcasted);

    }

    public double getTotalPriceOfVillas(List<Villa> villas) {
        List<? extends Residence> upcasted = villas;
        return calculateTotalPrice((List<Residence>) upcasted);
    }

    public double getTotalPriceOfSummerHouse(List<SummerHouse> summerHouseList) {
        List<? extends Residence> upcasted = summerHouseList;
        return calculateTotalPrice((List<Residence>) upcasted);
    }

    public double getTotalPriceOfAllResidences(List<Residence> residenceList) {
        return calculateTotalPrice(residenceList);
    }

    public double getAvgAreaOfHouse(List<House> houseList) {
        List<? extends Residence> upcasted = houseList;
        return calculateAvgArea((List<Residence>) upcasted);
    }

    public double getAvgAreaOfVilla(List<Villa> villaList) {
        List<? extends Residence> upcasted = villaList;
        return calculateAvgArea((List<Residence>) upcasted);
    }

    public double getAvgAreaOfSummerHouse(List<SummerHouse> summerHouseList) {
        List<? extends Residence> upcasted = summerHouseList;
        return calculateAvgArea((List<Residence>) upcasted);
    }

    public double getAvgAreaOfAllResidences(List<Residence> residenceList) {
        return calculateAvgArea(residenceList);
    }

    public List<Residence> getResidencesByRoomAndLoungeNumber(List<Residence> residences, int roomNumber, int loungeNumber) {
        return residences.stream().
                filter(residence -> (residence.getRoomCount() == roomNumber && residence.getLoungeCount() == loungeNumber))
                .toList();
    }


    private double calculateTotalPrice(List<Residence> residenceList) {
        return residenceList.stream()
                .mapToDouble(Residence::getPrice)
                .sum();
    }

    private double calculateAvgArea(List<Residence> residenceList) {
        return residenceList.stream()
                .mapToDouble(Residence::getPrice)
                .average().getAsDouble();
    }

}
