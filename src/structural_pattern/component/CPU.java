package structural_pattern.component;

import structural_pattern.vendors.Vendor;

public class CPU extends Component{

    public CPU(Vendor vendor) {
        super(vendor);
    }

    @Override
    public void applyVendor( ) {
        vendor.applyVendor();
    }
}
