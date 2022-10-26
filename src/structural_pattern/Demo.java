package structural_pattern;

import structural_pattern.component.CPU;
import structural_pattern.component.Component;
import structural_pattern.component.Motherboadr;
import structural_pattern.vendors.AMD;
import structural_pattern.vendors.Intel;

public class Demo {
    public static void main(String[] args) {
        CPU component = new CPU();
        component.setVendor("Intel Core i3");
        chooseComponent(component);
    }

    public static void chooseComponent(Component component){

        System.out.println("Intel");
        Intel intel = new Intel(component);
        intel.isAMD();
        component.printInfo();

        System.out.println("AMD");
        AMD amd = new AMD(component);
        intel.isAMD();
        component.printInfo();
    }
}
