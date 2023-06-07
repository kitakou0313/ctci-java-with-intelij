package org.example.designPattern.abstractFactory.factories;

import org.example.designPattern.abstractFactory.button.Button;
import org.example.designPattern.abstractFactory.button.WindowsButton;
import org.example.designPattern.abstractFactory.checkbox.Checkbox;
import org.example.designPattern.abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
