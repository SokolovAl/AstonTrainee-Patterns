package structural_pattern.component;

import structural_pattern.vendors.Vendor;

public class Motherboard extends Component {

    public Motherboard(Vendor vendor) {
        super(vendor);
    }

    @Override
    public void applyVendor() {
        vendor.applyVendor();
    }
}
