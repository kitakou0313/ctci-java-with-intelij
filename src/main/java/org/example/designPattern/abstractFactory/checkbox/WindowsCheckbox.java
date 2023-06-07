package org.example.designPattern.abstractFactory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("This is checkbox in Windows");

    }
}
