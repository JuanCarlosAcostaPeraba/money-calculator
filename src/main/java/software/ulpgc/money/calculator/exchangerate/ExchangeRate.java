package software.ulpgc.money.calculator.exchangerate;

import software.ulpgc.money.calculator.currency.Currency;

import java.time.LocalDate;

public record ExchangeRate(Currency from, Currency to, LocalDate date, double rate) {
}
