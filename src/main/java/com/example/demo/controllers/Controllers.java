package com.example.demo.controllers;


import com.example.demo.Bike;
import com.example.demo.Boat;
import com.example.demo.Car;
import com.example.demo.Truck;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;



@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class Controllers {


    @RequestMapping(value = "/Cars", method = RequestMethod.GET)
    public List<Car> getCar(Model model){
        List<Car> carList = new ArrayList<>( );
        carList.add(new Car("Ford","Model T",70000,1920,"Black"));
        System.out.println( "This is the car list:" + carList);
        return carList;
    }

    @RequestMapping( value = "/Bikes", method = RequestMethod.GET)
    public List<Bike> getBike(Model model){
        List<Bike> bikeList = new ArrayList<>(  );
        bikeList.add(new Bike("Harley Davidson", "Fat Boy", 15500, 2015,"Black"));
        System.out.println( "This is the bike list:" + bikeList );
        return bikeList;
    }

    @RequestMapping( value = "/Trucks", method = RequestMethod.GET)
    public List<Truck> getTruck(Model model){
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(" Dodge ", " Ram ", 50000, 2023, " Orange "));
        System.out.println("This is the truck list" + truckList);
        return truckList;
    }

    @RequestMapping( value = "/Boats", method = RequestMethod.GET)
    public List<Boat> getBoat(Model model){
        List<Boat> boatList = new ArrayList<>();
        boatList.add(new Boat(" Outerlimits ", " Legacy ", 259000, 2021, " Yellow "));
        System.out.println("This is the truck list" + boatList);
        return boatList;
    }

}
