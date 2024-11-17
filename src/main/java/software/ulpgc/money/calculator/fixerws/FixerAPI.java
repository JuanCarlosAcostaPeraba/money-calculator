package software.ulpgc.money.calculator.fixerws;

import io.github.cdimascio.dotenv.Dotenv;

public class FixerAPI {
    private static final Dotenv dotenv = Dotenv.load();
    public static final String key = dotenv.get("FIXER_API_KEY");
}
