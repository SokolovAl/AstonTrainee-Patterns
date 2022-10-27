package structural_pattern;

import structural_pattern.component.CPU;
import structural_pattern.component.Component;
import structural_pattern.vendors.AMD;

public class ChooseVendor {
    public static void main(String[] args) {
        Component component = new CPU(new AMD());
        component.applyVendor();
    }
}