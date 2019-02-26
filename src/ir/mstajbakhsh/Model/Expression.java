package ir.mstajbakhsh.Model;

import ir.mstajbakhsh.Model.Operation.Operation;
import ir.mstajbakhsh.Model.Operation.Operations;
import ir.mstajbakhsh.Model.Token.IToken;

import java.util.ArrayList;
import java.util.List;

public class Expression {
    String rawExpression;

    public Expression(String exp) {
        rawExpression = exp;
    }

    private boolean isValidExpression() {
        //TODO Check the expression validity. Check (), operands, ...
        return false;
    }

    public List<IToken> parseExpression() {
        List<IToken> tokens = new ArrayList<>();

        if (isValidExpression()) {
            //TODO parse the expression and fill @tokens
        }
        return null;
    }

    public Operations getMainOperation() {
        //TODO will produce + for the following expression: 2+4 => +
        // will produce null if there are more than one operation. 2+4+6 => null
        return null;
    }
}
