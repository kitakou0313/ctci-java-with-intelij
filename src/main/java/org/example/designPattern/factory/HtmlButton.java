package org.example.designPattern.factory;

import org.example.designPattern.factory.buttons.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("Test button");

    }

    public void onClick() {
        System.out.println("Hello, This is button in HTML!");
    }
}
