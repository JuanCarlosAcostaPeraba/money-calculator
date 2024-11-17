package software.ulpgc.money.calculator.money;

import software.ulpgc.money.calculator.currency.Currency;

import java.util.List;

public interface MoneyDialog {
    MoneyDialog define(List<Currency> currencies);
    Money get();
}
