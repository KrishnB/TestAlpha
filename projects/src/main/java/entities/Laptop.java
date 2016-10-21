package entities;


import java.util.ArrayList;
import java.util.List;

public abstract class Laptop {

    abstract public String getName();
    abstract public void bootUp();
    abstract public void shutDown();
    abstract public void executeCommand();
    abstract public List<Laptop> deliverLaptops();

    protected List<Laptop> getLaptops(Laptop laptop, int NumberOfLaptops) {
        List<Laptop> allLaptops = new ArrayList<Laptop>();
        for(int i=0; i< NumberOfLaptops; i++) {
            allLaptops.add(laptop);
        }
        return allLaptops;
    }
}
