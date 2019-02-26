package ir.mstajbakhsh.Model.Operation;

import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.Model.Token.TokenType;

public class Operation implements IToken {

    private Operations _opr = Operations.Dummy;
    private int operatorCount = -1;

    public Operations getOperationType() {
        return _opr;
    }

    public void setType(Operations type) {
        if (type == Operations.Dummy) {
            throw new IllegalArgumentException("Dummy is not allowed in operations.");
        }
        _opr = type;
    }

    public void setOperatorCount(int operators) {
        if (operators > 2 || operators < 1) {
            throw new IllegalArgumentException("Number of operators should be 1 or 2");
        }

        operatorCount = operators;
    }

    public boolean requireTwoOperands() {
        return operatorCount == 2;
    }

    public boolean requireOneOperand() {
        return operatorCount == 1;
    }

    @Override
    public TokenType getType() {
        return TokenType.Operand;
    }

    @Override
    public String getRawValue() {
        return _opr.toString();
    }
}
