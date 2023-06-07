package org.example.designPattern.abstractFactory.factories;

import org.example.designPattern.abstractFactory.button.Button;
import org.example.designPattern.abstractFactory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
