package ir.mstajbakhsh.Model;

import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.Model.Token.TokenType;

public class Number implements IToken {
    String rawNumber;

    public Number(String Number) {
        rawNumber = Number;
    }

    private boolean isValid() {
        //TODO is rawNumber a valid number?
        return false;
    }

    public boolean isInteger() {
        if (isValid()) {
            try {
                int i = Integer.parseInt(rawNumber);
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
        return false;
    }

    public boolean isBigInteger() {
        if (isValid() && !isInteger()) {
            return true;
        }
        return false;
    }

    public void increment() {
        //TODO it will act as ++
    }

    public void decrement() {
        //TODO it will act as --
    }

    @Override
    public TokenType getType() {
        return TokenType.Number;
    }

    @Override
    public String getRawValue() {
        return rawNumber;
    }
}
