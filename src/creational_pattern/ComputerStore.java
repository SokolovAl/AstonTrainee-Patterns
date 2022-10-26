package creational_pattern;

import creational_pattern.builders.PCBuilder;
import creational_pattern.director.Seller;
import creational_pattern.products.PC;

public class ComputerStore {
    public static void main(String[] args) {
        Seller seller = new Seller();
        PCBuilder pcBuilder = new PCBuilder();

        seller.createGamingPC(pcBuilder);

        PC pc = pcBuilder.getResult();
        System.out.println(pc);
    }
}
