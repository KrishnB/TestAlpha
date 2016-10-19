package core;

import java.util.ArrayList;
import java.util.List;

public class Company {
    String comName;
    String comAddress;
    public List<Employee> employeeList;

    public Company(String name, String Address)
    {
        this.comName = name;
        this.comAddress = Address;
        employeeList = new ArrayList<Employee>();
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee)
    {


    }

    public void displayEmployee(Employee employee)
    {

    }
    public void displayAllEmployees()
    {

    }
    public void issueLaptop(Employee employee,Laptop laptop)
    {

    }
}
