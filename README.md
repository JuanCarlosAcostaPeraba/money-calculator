# Money Calculator

Money Calculator is a Java application that allows users to convert amounts between different currencies using exchange rates from the Fixer API.

## Features

- **Currency Conversion**: Convert amounts between different currencies.
- **Exchange Rates**: Fetches exchange rates from the Fixer API.
- **Swing GUI**: User-friendly graphical interface using Java Swing.

## Dependencies

- [Gson](https://github.com/google/gson) (2.10.1)
- [JCalendar](https://toedter.com/jcalendar/) (1.4)
- [dotenv-java](https://github.com/cdimascio/dotenv-java) (2.2.0)

## Setup

1. **Clone the repository**:

    ```sh
    git clone <repository-url>
    cd money-calculator
    ```

2. **Set up the environment**:
    - Copy `.env.copy` to `.env` and add your Fixer API key:

        ```env
        FIXER_API_KEY=your_fixer_api_key
        ```

3. **Build the project**:
   - Open the project in your favorite IDE and build it.

## Usage

1. **Select a date**: Choose the date for which you want to fetch exchange rates.
2. **Enter amount**: Input the amount you want to convert.
3. **Select currencies**: Choose the source and target currencies.
4. **Convert**: Click the "Convert" button to see the converted amount.

## Code Overview

- **Main Application**: [`Main`](src/main/java/software/ulpgc/money/calculator/swing/Main.java)
- **Main Frame**: [`MainFrame`](src/main/java/software/ulpgc/money/calculator/swing/MainFrame.java)
- **Date Frame**: [`DateFrame`](src/main/java/software/ulpgc/money/calculator/swing/DateFrame.java)
- **Currency Dialog**: [`SwingCurrencyDialog`](src/main/java/software/ulpgc/money/calculator/swing/SwingCurrencyDialog.java)
- **Money Dialog**: [`SwingMoneyDialog`](src/main/java/software/ulpgc/money/calculator/swing/SwingMoneyDialog.java)
- **Numeric Panel**: [`SwingNumericPanel`](src/main/java/software/ulpgc/money/calculator/swing/SwingNumericPanel.java)
- **Money Display**: [`SwingMoneyDisplay`](src/main/java/software/ulpgc/money/calculator/swing/SwingMoneyDisplay.java)
- **Exchange Money Command**: [`ExchangeMoneyCommand`](src/main/java/software/ulpgc/money/calculator/command/ExchangeMoneyCommand.java)
- **Currency Loader**: [`FixerCurrencyLoader`](src/main/java/software/ulpgc/money/calculator/fixerws/FixerCurrencyLoader.java)
- **Exchange Rate Loader**: [`FixerExchangeRateLoader`](src/main/java/software/ulpgc/money/calculator/fixerws/FixerExchangeRateLoader.java)
