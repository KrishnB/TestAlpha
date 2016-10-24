package entities;


import java.util.ArrayList;
import java.util.List;

public abstract class Laptop {

    abstract public String getName();
    abstract public void setName();
    abstract public void setName(String name);
    abstract public String getOs();
    abstract public void setOs();
    abstract public void setOs(String os);
    abstract public String getProcessor();
    abstract public void setProcessor();
    abstract public void setProcessor(String processor);
    abstract public void bootUp();
    abstract public void shutDown();
    abstract public void executeCommand();
    abstract public List<Laptop> deliverLaptops();

    abstract public void trackLaptops();
    abstract public void trackChangeConfig();

    protected List<Laptop> getLaptops(Laptop laptop, int NumberOfLaptops) {
        List<Laptop> allLaptops = new ArrayList<Laptop>();
        for(int i=0; i< NumberOfLaptops; i++) {
            allLaptops.add(laptop);
        }
        return allLaptops;
    }
}
