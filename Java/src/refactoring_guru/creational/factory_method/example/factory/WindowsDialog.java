package refactoring_guru.creational.factory_method.example.factory;

import refactoring_guru.creational.factory_method.example.buttons.Button;
import refactoring_guru.creational.factory_method.example.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
