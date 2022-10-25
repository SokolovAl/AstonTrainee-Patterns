import builders.PCBuilder;
import director.Seller;
import products.PC;

public class ComputerStore {
    public static void main(String[] args) {
        Seller seller = new Seller();
        PCBuilder pcBuilder = new PCBuilder();

        seller.createGamingPC(pcBuilder);

        PC pc = pcBuilder.getResult();
        System.out.println(pc);
    }
}
