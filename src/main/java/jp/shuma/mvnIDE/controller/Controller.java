package jp.shuma.mvnIDE.controller;

import jp.shuma.mvnIDE.model.Model;
/**
 * Simple Editorのコントローラークラス．
 * @version 0.0 2013/09/09
 * @since 0.0 2013/09/09
 * @author shuma
 */
public class Controller {
    /**
     * Modelクラスを保持する．
     */
    private Model model;
    /**
     * コンストラクタ．
     * @since 0.0 2013/09/09
     */
    public Controller() {
        //do nothing...
    }
    /**
     * Modelを関連づける．
     * @since 0.0 2013/09/09
     * @param model Modelクラス．
     */
    public void setModel(Model model) {
        this.model = model;
    }
}