package structural_pattern.component;

public class CPU implements Component {
    private String vendor;

    @Override
    public void setVendor(String vendor) {
        if (vendor.toLowerCase().contains("AMD")) {
            this.vendor = "AMD";
        } else {
            this.vendor = "Intel";
        }
    }

    @Override
    public String getVendor() {
        return vendor;
    }

    @Override
    public void printInfo() {
        System.out.println("You choose " + vendor + " as CPU vendor");
    }
}
