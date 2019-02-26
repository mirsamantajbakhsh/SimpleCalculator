package ir.mstajbakhsh.Model.Operation;

public class OperationFactory {

    public static Operation buildOperation(String operation) {
        Operation o = new Operation();
        switch (operation) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "^":
                o.setOperatorCount(2);
                break;
            case "!":
                o.setOperatorCount(1);
                break;
        }

        switch (operation) {
            case "+":
                o.setType(Operations.Sum);
                break;
            case "-":
                o.setType(Operations.Subtract);
                break;
            case "*":
                o.setType(Operations.Multiply);
                break;
            case "/":
                o.setType(Operations.Division);
                break;
            case "^":
                o.setType(Operations.Power);
                break;
            case "!":
                o.setType(Operations.Factorial);
                break;
        }

        return o;
    }
}
