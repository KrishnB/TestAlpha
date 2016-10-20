package utils;


import core.Laptop;

import java.util.ArrayList;
import java.util.List;


public class LaptopFactory
{
    private int numberOfEmployees;
    public LaptopFactory(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

//    public LaptopFactory(int numberOfEmployees, LaptopType laptopType) {
//        this.numberOfEmployees = numberOfEmployees;
//    }


    public List<Laptop> getLaptops() {
        List<Laptop> laptops = new ArrayList<Laptop>();
        for(int i = 0; i<numberOfEmployees; i++) {
            laptops.add(getBasicLaptop());
        }
        return laptops;
    }

    private Laptop getBasicLaptop() {
        Laptop laptop = new Laptop("Lenevo");
        return laptop;
    }
}
