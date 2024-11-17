package software.ulpgc.money.calculator.command;

import software.ulpgc.money.calculator.currency.Currency;
import software.ulpgc.money.calculator.currency.CurrencyDialog;
import software.ulpgc.money.calculator.exchangerate.ExchangeRate;
import software.ulpgc.money.calculator.exchangerate.ExchangeRateLoader;
import software.ulpgc.money.calculator.money.Money;
import software.ulpgc.money.calculator.money.MoneyDialog;
import software.ulpgc.money.calculator.money.MoneyDisplay;

import java.io.IOException;
import java.text.DecimalFormat;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class ExchangeMoneyCommand implements Command {
    private final MoneyDialog moneyDialog;
    private final CurrencyDialog currencyDialog;
    private final ExchangeRateLoader exchangeRateLoader;
    private final MoneyDisplay moneyDisplay;

    public ExchangeMoneyCommand(MoneyDialog moneyDialog, CurrencyDialog currencyDialog, ExchangeRateLoader exchangeRateLoader, MoneyDisplay moneyDisplay) {
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
        this.exchangeRateLoader = exchangeRateLoader;
        this.moneyDisplay = moneyDisplay;
    }

    @Override
    public void execute() throws IOException {
        Money money = moneyDialog.get();
        Currency currency = currencyDialog.get();
        ExchangeRate exchangeRate = exchangeRateLoader.load(money.currency(), currency);
        Money result = new Money(money.amount() * exchangeRate.rate(), currency);
        moneyDisplay.show(result);
    }
}
