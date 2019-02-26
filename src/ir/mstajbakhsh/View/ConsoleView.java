package ir.mstajbakhsh.View;

import ir.mstajbakhsh.Presenter.IPresenter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleView implements IView {
    BufferedReader br;
    IPresenter p;

    public ConsoleView(IPresenter presenter) {
        br = new BufferedReader(new InputStreamReader(System.in));
        p = presenter;
    }

    @Override
    public void display(String msg) {
        System.out.println(msg);
    }

    @Override
    public void alert(String msg) {
        System.err.println(msg);
    }

    @Override
    public String readLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
