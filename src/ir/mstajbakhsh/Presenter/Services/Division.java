package ir.mstajbakhsh.Presenter.Services;

import ir.mstajbakhsh.Model.Expression;
import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.Presenter.IEventHandler;

public class Division extends Service {

    public Division(IEventHandler handler) {
        super(handler);
    }

    @Override
    public void execute(Expression ex) {
        super.execute(ex);

        IToken result = null;

        //TODO Division the expression (big int or int)
        // result = new Number(theResult);

        getHandler().onGetResult(result);
    }
}


