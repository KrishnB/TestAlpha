package core;

import java.util.List;

/**
 * Created by tvserver on 19/10/16.
 */
public class Employee {

    String empId;
    String empName;
    Department empDepartment;
    Laptop empLaptop;
    Designation designation;

    public Employee(String id,String name, Designation desig)
    {
        this.empId = id;
        this.empName = name;
        this.designation = desig;
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

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }
}
