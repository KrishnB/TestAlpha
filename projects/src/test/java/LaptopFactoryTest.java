import core.Department;
import entities.Laptop;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.LaptopFactory;


public class LaptopFactoryTest {

    LaptopFactory laptopFactory;
    @BeforeTest
    public void setup() {
        laptopFactory = new LaptopFactory(Department.IT,100);
    }

    @Test
    public void laptopCountTest() {
        Laptop laptop = laptopFactory.getLaptopMake();
        Assert.assertEquals(laptop.deliverLaptops().size(),100);
        Assert.assertEquals(laptop.deliverLaptops().get(0).getName(),"dell");
    }
}
