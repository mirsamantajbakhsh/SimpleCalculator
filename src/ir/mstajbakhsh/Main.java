package ir.mstajbakhsh;

import ir.mstajbakhsh.Presenter.IPresenter;
import ir.mstajbakhsh.Presenter.Presenter;
import ir.mstajbakhsh.View.ConsoleView;
import ir.mstajbakhsh.View.IView;

public class Main {

    public static void main(String[] args) {
        IPresenter p = new Presenter();
        IView view = new ConsoleView(p);

        p.setView(view);

        p.present();
    }
}
