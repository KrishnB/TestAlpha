package entities;

import core.Department;

import java.util.List;

/**
 * Created by vinaykumar on 21/10/16.
 */
public class LenovoLaptop extends Laptop {
    private String name;
    private String os;
    private Department department;
    private String processor;

    public LenovoLaptop(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
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
        return null;
    }
}
