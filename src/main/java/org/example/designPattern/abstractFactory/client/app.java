package org.example.designPattern.abstractFactory.client;

import org.example.designPattern.abstractFactory.button.Button;
import org.example.designPattern.abstractFactory.checkbox.Checkbox;
import org.example.designPattern.abstractFactory.factories.GUIFactory;
import org.example.designPattern.abstractFactory.factories.MacOSFactory;
import org.example.designPattern.abstractFactory.factories.WindowsFactory;

public class app {

    public static void main(String[] args) {
        OSTypes os = OSTypes.MACOS;

        GUIFactory factory = null;

        switch (os) {
            case MACOS:
                factory = new MacOSFactory();
                break;
            case WINDOWS:
                factory = new WindowsFactory();
                break;
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}
