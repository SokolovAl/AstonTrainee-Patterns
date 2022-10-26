package structural_pattern.component;

import structural_pattern.vendors.Vendor;

public abstract class Component {
    protected Vendor vendor;

    public Component(Vendor vendor) {
        this.vendor = vendor;
    }

    abstract public void applyVendor();
}
