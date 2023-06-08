package org.example.designPattern.factory;

import org.example.designPattern.factory.buttons.Button;

public class HtmlDialog extends Dialog {

    public Button createButton() {
        return new HtmlButton();
    }
}
