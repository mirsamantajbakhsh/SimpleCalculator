package ir.mstajbakhsh.Presenter.Services;

import ir.mstajbakhsh.Model.Expression;
import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.Presenter.IEventHandler;

public class Power extends Service {
    public Power(IEventHandler handler) {
        super(handler);
    }

    @Override
    public void execute(Expression ex) {
        super.execute(ex);

        IToken result = null;

        //TODO calculate the power operation (big int or int)
        // result = new Number(theResult);

        getHandler().onGetResult(result);
    }
}
