package ir.mstajbakhsh.Presenter;

import ir.mstajbakhsh.Model.Token.IToken;
import ir.mstajbakhsh.View.IView;

public interface IPresenter {
    void setView(IView view);
    void present();
    void startProcess(String expression);
}
