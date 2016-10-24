import builders.LaptopBuilder;
import core.Company;
import core.Department;
import core.Designation;
import core.Employee;
import entities.Laptop;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.LaptopFactory;


public class LaptopFactoryTest {

    LaptopFactory laptopFactory, laptopFactory1;
    Company testVagrant;
    Employee vinay,karthik;
    @BeforeTest
    public void setup()
    {
        testVagrant = new Company("TestVagrant","IndiraNagar,Bangalore");

        karthik = new Employee("1","Karthik", Designation.SDET,Department.IT);
        vinay = new Employee("2","Vinay",Designation.QA,Department.Network);

        laptopFactory = new LaptopFactory(Department.IT,100);
        laptopFactory1 = new LaptopFactory(Department.Network,100);
    }

    @Test
    public void laptopCountTest()
    {
        Laptop laptop = laptopFactory.getLaptopMake();
        laptop = new LaptopBuilder(laptop).build();

        System.out.println(System.getProperty("laptopMake"));
        Laptop laptop1 = laptopFactory1.getLaptopMake();
        laptop1 = new LaptopBuilder(laptop1).build();
        System.out.println(System.getProperty("laptopMake"));
//        Assert.assertEquals(laptop.deliverLaptops().size(),100);
//        Assert.assertEquals(laptop.deliverLaptops().get(0).getName(),"dell");

        testVagrant.issueLaptop(karthik,laptop);
        testVagrant.showEmpLaptop(karthik);
        testVagrant.issueLaptop(vinay,laptop1);
        testVagrant.showEmpLaptop(vinay);

        laptop = new LaptopBuilder(laptop).withName("Karthiks Dell").withOs("Ubuntu").withProcessor("AMD").build();
        testVagrant.issueLaptop(karthik,laptop);
        testVagrant.showEmpLaptop(karthik);


    }
}
