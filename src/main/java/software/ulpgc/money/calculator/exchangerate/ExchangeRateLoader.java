package software.ulpgc.money.calculator.exchangerate;

import software.ulpgc.money.calculator.currency.Currency;

import java.io.IOException;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to) throws IOException;
}
