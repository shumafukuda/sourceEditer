package jp.shuma.mvnIDE.view;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Dimension;

import jp.shuma.mvnIDE.model.Model;
import jp.shuma.mvnIDE.controller.Controller;
/**
 * Simple Editorのコントローラークラス．
 * @version 0.0 2013/09/09
 * @since 0.0 2013/09/09
 * @author shuma
 */
public class View extends JPanel{
    /**
     * Modelクラスを保持する．
     */
    private Model model;
    /**
     * コンストラクタ．
     * @since 0.0 2013/09/09
     */
    public View() {
        super.setPreferredSize(new Dimension(550, 600));
        JTextPane textpane = new JTextPane();
        textpane.setPreferredSize(new Dimension(550, 600));
        textpane.setVisible(true);
        super.add(textpane);
    }
    /**
     * Modelを関連づける．
     * @since 0.0 2013/09/09
     * @param model Modelクラス．
     */
    public void setModel(Model model) {
        this.model = model;
    }
    /**
     * Controllerを関連づける．
     * @since 0.0 2013/09/09
     * @param controller Controllerクラス．
     */
    public void setController(Controller controller) {
        
    }
}