package entities;

import utils.PropertiesReader;

import java.util.List;


public class DellLaptop extends Laptop {
    private String name;
    private String os;
    private String processor;
    private int laptopCount;

    public DellLaptop(int laptopCount) {
        this.laptopCount = laptopCount;
    }


    public String getName() {
        return PropertiesReader.name;
    }


    public String getOs() {
        return PropertiesReader.os;
    }


    public String getProcessor() {
        return PropertiesReader.processor;
    }

    public void bootUp(){
        System.out.println("Here The boot up Process Is done");
    }
    public void shutDown(){
        System.out.println("System is going to ShutDown.....Bye!!");
    }
    public void executeCommand(){
        System.out.println("Please Provide a Command to Execute and Run");
    }
    public List<Laptop> deliverLaptops() {
        return getLaptops(this,laptopCount);
    }
}
