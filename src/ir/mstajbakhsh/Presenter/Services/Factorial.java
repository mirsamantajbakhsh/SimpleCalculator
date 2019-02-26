package ir.mstajbakhsh.Presenter.Services;

import ir.mstajbakhsh.Model.Expression;
import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.Presenter.IEventHandler;

public class Factorial extends Service {
    public Factorial(IEventHandler handler) {
        super(handler);
    }

    @Override
    public void execute(Expression ex) {
        super.execute(ex);

        IToken result = null;

        //TODO calculate the factorial of the expression (big int or int)
        // result = new Number(theResult);

        getHandler().onGetResult(result);
    }
}
