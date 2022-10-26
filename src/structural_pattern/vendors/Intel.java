package structural_pattern.vendors;

import structural_pattern.component.Component;

public class Intel implements Vendor {
    protected Component component;

    public Intel() {
    }

    public Intel(Component component) {
        this.component = component;
    }

    @Override
    public boolean isAMD() {
        return false;
    }
}
