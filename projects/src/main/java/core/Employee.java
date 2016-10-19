package core;

import java.util.List;

/**
 * Created by tvserver on 19/10/16.
 */
public class Employee {

    String empId;
    String empName;
    String empDesignation;
    Department empDepartment;
    Laptop empLaptop;

    public Employee(String id,String name, String desig)
    {
        this.empId = id;
        this.empName = name;
        this.empDesignation = desig;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Laptop getEmpLaptop()
    {
        return empLaptop;
    }

    public void setEmpLaptop(Laptop empLaptop)
    {
        this.empLaptop = empLaptop;
    }

    public Department getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(Department empDepartment) {
        this.empDepartment = empDepartment;
    }
}
