package software.ulpgc.money.calculator.swing;

import software.ulpgc.money.calculator.money.Money;
import software.ulpgc.money.calculator.money.MoneyDisplay;

import javax.swing.*;
import java.awt.*;

public class SwingMoneyDisplay extends JLabel implements MoneyDisplay {
    @Override
    public void show(Money money) {
        this.setFont(new Font(Font.SERIF, Font.BOLD, 24));
        this.setText(money.toString());
    }
}
