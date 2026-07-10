package Generic_class.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Bus());
        vehicleList.add(new Car());

        List<Bus> busList = new ArrayList<>();
//        busList=vehicleList;  //invalid as buslist can only store objs of type bus
//        vehicleList=busList;  //invalid as vehicle list can store both bus and car obj but buslist can only store objs of type bus

        Print printobj=new Print();
        printobj.setPrintValues(vehicleList);
        printobj.setPrintValues(busList);


        List<Integer> wildCardListSource = new ArrayList<>();
        List<Float>wildCardListDestination = new ArrayList<>();
        printobj.computeList(wildCardListSource,wildCardListDestination);
//        printobj.computeList2(wildCardListSource,wildCardListDestination); //wrong as only one type is allowed
    }

}
