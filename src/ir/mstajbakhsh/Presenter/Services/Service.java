package ir.mstajbakhsh.Presenter.Services;

import ir.mstajbakhsh.Model.Expression;
import ir.mstajbakhsh.Presenter.IEventHandler;

public class Service implements IService {
    IEventHandler _eventHandler;

    public Service(IEventHandler handler){
        _eventHandler = handler;
    }

    protected IEventHandler getHandler() {
        return _eventHandler;
    }

    @Override
    public void execute(Expression ex) {
        System.out.println("Executing ...");
    }
}
