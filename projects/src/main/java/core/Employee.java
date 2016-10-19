package core;

/**
 * Created by tvserver on 19/10/16.
 */
public class Employee {

    String empId;
    String empName;
    String empDesignation;
    Department department;
    Laptop laptop;

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

}
