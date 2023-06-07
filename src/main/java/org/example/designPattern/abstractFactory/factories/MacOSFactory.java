package org.example.designPattern.abstractFactory.factories;

import org.example.designPattern.abstractFactory.button.Button;
import org.example.designPattern.abstractFactory.button.MacOsButton;
import org.example.designPattern.abstractFactory.checkbox.Checkbox;
import org.example.designPattern.abstractFactory.checkbox.MakOSCheckbox;

public class MacOSFactory implements GUIFactory {

    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MakOSCheckbox();
    }
}
