package builders;

import entities.Laptop;

/**
 * Created by vinaykumar on 24/10/16.
 */
public class LaptopBuilder {

    private Laptop laptop;

     public LaptopBuilder(Laptop laptop) {
         this.laptop = laptop;
         withName();
         withOs();
         withProcessor();
     }

     public LaptopBuilder withName() {
        laptop.setName();
         return this;
     }

    public LaptopBuilder withName(String name) {
        laptop.setName(name);
        return this;
    }

     public LaptopBuilder withOs() {
        laptop.setOs();
         return this;
     }

    public LaptopBuilder withOs(String os) {
        laptop.setOs(os);
        return this;
    }

     public LaptopBuilder withProcessor() {
         laptop.setProcessor();
         return this;
     }

    public LaptopBuilder withProcessor(String processor) {
        laptop.setProcessor(processor);
        return this;
    }

     public Laptop build() {
         return laptop;
     }
}
