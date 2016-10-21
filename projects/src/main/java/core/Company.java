package core;


import entities.Laptop;

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

        employeeList.add(employee);

    }

    public void displayEmployee(Employee employee)
    {
        System.out.println(employee.getEmployeeDetails(employee));
    }
    public void displayAllEmployees()
    {
        for (Employee employee : employeeList) {
            System.out.println(employee.getEmpName());
        }
    }
//Company Will issue the Laptop Depending upon the Department
    public void issueLaptop(Employee employee,Laptop laptop)
    {
        if((employee.getEmpDepartment())== Department.IT)
                    employee.setEmpLaptop(laptop);

    }
//Company need to show the Employee Laptop
    public void showEmpLaptop(Employee employee)
    {
//        System.out.println(employee.getEmpName() + " belonging to "+employee.getEmpDepartment()+" has a " + employee.getEmpLaptop().getLaptopName());
    }

//Company need to find the number of individual Laptops issued to the employees
    public void FindLaptops(Laptop laptop){
        int count=0;
        for(Employee employee : employeeList){

            if(employee.getEmpLaptop().getName().equals(laptop))
            {
                count++;
            }
            System.out.println(employee.getEmpLaptop().getName()+" has" +count);

       }
    }
}

