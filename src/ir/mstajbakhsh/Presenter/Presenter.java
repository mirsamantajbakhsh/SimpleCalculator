package ir.mstajbakhsh.Presenter;

import ir.mstajbakhsh.Model.Expression;
import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.Presenter.Services.*;
import ir.mstajbakhsh.View.IView;

public class Presenter implements IPresenter, IEventHandler {
    IView view;

    Expression e;

    public Presenter() {

    }

    @Override
    public void onGetResult(IToken result) {
        getView().display("Result is " + result.getRawValue());
    }

    @Override
    public void startProcess(String expression) {
        e = new Expression(expression);
        IService service = null;

        Expression subExpression;

        while ((subExpression = getSubExpressions(expression)) != null) {
            switch (subExpression.getMainOperation()) {
                case Sum:
                    service = new Sum(this);
                    break;
                case Subtract:
                    service = new Subtract(this);
                    break;
                case Multiply:
                    service = new Multiply(this);
                    break;
                case Division:
                    service = new Division(this);
                    break;
                case Power:
                    service = new Power(this);
                    break;
                case Factorial:
                    service = new Factorial(this);
                    break;
            }

            if (service != null) {
                service.execute(subExpression);
            } else {
                getView().alert("Something happened. Could not detect the expression.");
            }
        }
    }

    private Expression getSubExpressions(String subExpression) {
        //TODO gets the next subexpression. For example:
        // (2+4)*(3+5) has the following sub expressions:
        // (2+4) -> which will produce 6
        // (3+5) -> which will produce 8
        // 6 * 8 -> which will produce 48
        // and finally will produce null.
        return null;
    }

    @Override
    public void setView(IView view) {
        this.view = view;
    }

    @Override
    public void present() {
        getView().display("*** Welcome to MVP Big Int calculator. ***");
        startLooper();
    }

    private void startLooper() {
        String line = getView().readLine();

        while (!line.equalsIgnoreCase("quit")) {
            startProcess(line);
            line = getView().readLine();
        }
    }

    private IView getView() {
        return view;
    }
}
