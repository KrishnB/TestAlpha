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
                 laptop = new DellLaptop(numOfLaptops);
                break;
            case Network:
                laptop = new LenovoLaptop(department);
                break;
            case Testing:
                laptop = new MacLaptop(department);
                break;
        }

        return laptop;
    }




}
