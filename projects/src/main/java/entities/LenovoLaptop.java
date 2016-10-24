package entities;

import utils.PropertiesHelper;

import java.util.List;

/**
 * Created by vinaykumar on 21/10/16.
 */
public class LenovoLaptop extends Laptop {
    private String name;
    private String os;
    private String processor;
    private int laptopCount;
    private PropertiesHelper propertiesHelper = new PropertiesHelper("Lenevo");

    public LenovoLaptop(int laptopCount) {
        this.laptopCount = laptopCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        this.name = propertiesHelper.getName();
    }


    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;

    }

    public void setOs() {
        this.os = propertiesHelper.getOS();

    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setProcessor() {
        this.processor = propertiesHelper.getProcessor();
    }

    public void bootUp() {
        System.out.println("Here The boot up Process Is done");
    }

    public void shutDown() {
        System.out.println("System is going to ShutDown.....Bye!!");
    }

    public void executeCommand() {
        System.out.println("Please Provide a Command to Execute and Run");
    }

    public List<Laptop> deliverLaptops() {
        return getLaptops(this, laptopCount);
    }
}