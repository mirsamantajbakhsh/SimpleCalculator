package ir.mstajbakhsh.Presenter.Services;

import ir.mstajbakhsh.Model.Expression;
import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.Presenter.IEventHandler;

public class Multiply extends Service {
    public Multiply(IEventHandler handler) {
        super(handler);
    }

    @Override
    public void execute(Expression ex) {
        super.execute(ex);

        IToken result = null;

        //TODO multiply the expression (big int or int)
        // result = new Number(theResult);

        getHandler().onGetResult(result);
    }
}
