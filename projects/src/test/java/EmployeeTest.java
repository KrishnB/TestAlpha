import core.Company;
import core.Employee;
import core.Laptop;
import org.testng.annotations.Test;
import utils.LaptopFactory;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by tvserver on 19/10/16.
 */
public class EmployeeTest
{
    @Test
    public void shouldCreateEmployee()
    {
        //Creating Company Class Object
        Company testVagrant = new Company("TestVagrant","IndiraNagar,Bangalore");

        //Creating The Employee object
        Employee karthik = new Employee("1","Karthik","SDET");
        Employee vinay = new Employee("2","Vinay","SDET");

        //Adding the employee in to list
        testVagrant.addEmployee(karthik);
        testVagrant.addEmployee(vinay);

        //Displaying All Employees
        testVagrant.displayAllEmployees();

        //Display a Particular Employee
        testVagrant.displayEmployee(vinay);

        //Testing the Employee Details
        assertEquals(karthik.getEmpId(), "1");
        assertEquals(karthik.getEmpName(), "Karthik");
        assertEquals(karthik.getEmpDesignation(), "SDET");

        assertEquals(vinay.getEmpId(), "2");
        assertEquals(vinay.getEmpName(), "Vinay");
        assertEquals(vinay.getEmpDesignation(), "SDET");

        //Find the number of employees present in the company
        LaptopFactory factory = new LaptopFactory(3);
        List<Laptop> laptops = factory.getLaptops();

        testVagrant.issueLaptop(karthik,laptops.get(0));
        testVagrant.issueLaptop(vinay,laptops.get(1));


    }

}
