import model.House;
import model.Residence;
import model.SummerHouse;
import model.Villa;
import service.ResidenceBuilder;
import service.ResidenceService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ResidenceBuilder residenceBuilder = new ResidenceBuilder();
        ResidenceService residenceService = new ResidenceService();

        List<House> houseList = residenceBuilder.createHouseList();
        List<Villa> villaList = residenceBuilder.createVillaList();
        List<SummerHouse> summerHouseList = residenceBuilder.createSummerHouseList();

        List<Residence> residenceList = new ArrayList<>();

        residenceList.addAll(houseList);
        residenceList.addAll(villaList);
        residenceList.addAll(summerHouseList);

        System.out.println("Total House Price: "+residenceService.getTotalPriceOfHouse(houseList));
        System.out.println("Total Villa Price: "+residenceService.getTotalPriceOfVillas(villaList));
        System.out.println("Total Summer House Price: "+residenceService.getTotalPriceOfSummerHouse(summerHouseList));
        System.out.println("Total Residence Price: "+residenceService.getTotalPriceOfAllResidences(residenceList));
        System.out.println();


        System.out.println("Average of all House Areas: "+residenceService.getAvgAreaOfHouse(houseList));
        System.out.println("Average of all Villa Areas: "+residenceService.getAvgAreaOfVilla(villaList));
        System.out.println("Average of all Summer House Areas: "+residenceService.getAvgAreaOfSummerHouse(summerHouseList));
        System.out.println("Average of all Residence Areas: "+residenceService.getAvgAreaOfAllResidences(residenceList));
        System.out.println();

        System.out.println("Residences by room number and lounge number: "+residenceService.getResidencesByRoomAndLoungeNumber(residenceList,4,2));














    }
}
