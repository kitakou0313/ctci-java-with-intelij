package org.example.designPattern.factory;


import org.example.designPattern.factory.buttons.Button;

public abstract class Dialog {
    public abstract Button createButton();

    public void renderWindow() {

        Button button = this.createButton();
    }
}

