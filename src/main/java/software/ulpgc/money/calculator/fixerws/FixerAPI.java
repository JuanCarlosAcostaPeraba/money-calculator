package software.ulpgc.money.calculator.fixerws;

import io.github.cdimascio.dotenv.Dotenv;

public class FixerAPI {
    private static final Dotenv dotenv = Dotenv.load();
    // This line is for the teacher only
    // public static final String key = "3595971b91355c2b5c019cab471b8dbd";
    public static final String key = dotenv.get("FIXER_API_KEY");
}
