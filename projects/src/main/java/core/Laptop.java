package core;

/**
 * Created by tvserver on 19/10/16.
 */
public class Laptop {

    String  laptopName;

    public  Laptop(String lap)
    {
        this.laptopName = lap;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }
    public void bootUp()
    {
        System.out.println("welcome to bootup");
    }
    public void shutDown()
    {
        System.out.println("Goes to shutdown");
    }
    public void executeCommand()
    {
        System.out.println("Executed command");
    }
}
