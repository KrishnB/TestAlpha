package utils;

import core.Department;
import entities.DellLaptop;
import entities.Laptop;
import entities.LenovoLaptop;
import entities.MacLaptop;


public class LaptopFactory {
    private Department department;
    private int numOfLaptops;
    public LaptopFactory(Department department, int numberOfLaptops) {
        this.department = department;
        this.numOfLaptops = numberOfLaptops;
        
    }

    public Laptop getLaptopMake() {
        Laptop laptop = null;
        switch (department) {
            case IT:
                 System.setProperty("laptopMake","Dell");
                 laptop = new DellLaptop(numOfLaptops);
                break;
            case Network:
                System.setProperty("laptopMake","Lenevo");
                laptop = new LenovoLaptop(numOfLaptops);
                break;
            case Testing:
                System.setProperty("laptopMake","Mac");
                laptop = new MacLaptop(numOfLaptops);
                break;
        }

        return laptop;
    }




}
