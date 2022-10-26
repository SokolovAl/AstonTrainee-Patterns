package structural_pattern.vendors;

import structural_pattern.component.Component;

public class AMD implements Vendor{
    protected Component component;

    public AMD() {
    }

    public AMD(Component component) {
        this.component = component;
    }
    @Override
    public boolean isAMD() {
        return true;
    }
}
