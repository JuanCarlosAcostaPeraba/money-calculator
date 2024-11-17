package software.ulpgc.money.calculator.currency;

public record Currency(String code, String name) {
    @Override
    public String toString() {
        return code + "-" + name;
    }
}