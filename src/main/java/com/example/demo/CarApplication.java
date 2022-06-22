package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {



	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
		Car c = new Car("Ford", "mustang",70000,1968,"yellow");
		System.out.println(" Model " + c.getModel() + " Make: " + c.getMake() + " Price " +c.getPrice() +  " Year " + c.getYear() + " Color" + c.getColor());
		Car	 c1 = new Car("Chevy", "Corvette", 80000,1963, "red");
		System.out.println(" Model " + c1.getModel() + " Make " + c1.getMake() + " Price " + c1.getPrice() +  " Year " + c1.getYear() + " Color " + c1.getColor());
		Car c2 = new Car("Pontiac", "GTO,", 26000, 1970, "green");
		System.out.println(" Model " + c2.getModel() + " Make " + c2.getMake() + " Price "+c2.getPrice() +  " year " + c2.getYear() + " Color " + c2.getColor());
        Bike b = new Bike("Honda", "CRF 150R",5299,2023,"red");
        System.out.println(" Model " + b.getModel() + " Make " + b.getMake() + " Price " + b.getPrice() + " Year " + b.getYear() + " Color " + b.getColor());
        Bike b2 = new Bike("Indian", "FTR Rally", 14000,2023, "Black");
        System.out.println(" Model " + b.getModel() + " Make " + b.getMake() + " Price " + b.getPrice() + " Year " + b.getYear() + " Color " + b.getColor());
		Truck t = new Truck(" Tesla ", " Cybertruck ", 69900, 2022, " Sliver ");
		System.out.println(" Model " + b.getModel() + " Make " + b.getMake() + " Price " + b.getPrice() + " Year " + b.getYear() + " Color " + b.getColor());
		Truck t1 = new Truck (" Toyota ", " Tundra ",35000, 2022, " Grey ");
		System.out.println(" Model " + b.getModel() + " Make " + b.getMake() + " Price " + b.getPrice() + " Year " + b.getYear() + " Color " + b.getColor());
		Truck t2 = new Truck(" Ford ", " Raptor ", 73590, 2020, " Blue ");
		System.out.println(" Model " + b.getModel() + " Make " + b.getMake() + " Price " + b.getPrice() + " Year " + b.getYear() + " Color " + b.getColor());
	}

}
