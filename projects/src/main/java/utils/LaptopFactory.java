package utils;

import core.Department;
import core.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopFactory
{
    private int numberOfEmployees;
    public LaptopFactory(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public List<Laptop> getITLaptops() {
        List<Laptop> ITLaptops = new ArrayList<Laptop>();
        for(int i = 0; i<numberOfEmployees; i++) {
            ITLaptops.add(issueITLaptop());
        }
        return ITLaptops;
    }

    private Laptop issueITLaptop() {
        Laptop dell = new Laptop("Dell");
        return dell;
    }

    //public abstract Laptop getLaptopForDepartment(Department department);
}
