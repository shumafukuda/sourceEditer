package jp.shuma.mvnIDE;

import jp.shuma.mvnIDE.model.Model;
import jp.shuma.mvnIDE.view.View;
import jp.shuma.mvnIDE.controller.Controller;
import javax.swing.JFrame;
/**
 * Simple Editorのメインクラス．
 * @version 0.0 2013/09/09
 * @since 0.0 2013/09/09
 * @author shuma
 */
public class Main {
    /**
     * コンストラクタ．
     * @since 0.0 2013/09/09
     */
    public Main() {
        //Model, View, Controllerの準備．
        Model model = new Model();
        Controller controller = new Controller();
        View view = new View();
        model.setView(view);
        view.setModel(model);
        view.setController(controller);
        controller.setModel(model);
        //ウィンドウを開く．
        JFrame aWindow = new JFrame("Simple Editor");
		aWindow.getContentPane().add(view);
		aWindow.setResizable(false);
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aWindow.pack();
		aWindow.setVisible(true);
    }
    /**
     * メインメソッド．
     * @param args コマンドライン引数．
     * @since 0.0 2013/09/09
     */
    public static void main(String[] args) {
        new Main();
    }
}