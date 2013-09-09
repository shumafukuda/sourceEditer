package jp.shuma.mvnIDE.model;

import jp.shuma.mvnIDE.view.View;
/**
 * Simple Editorのモデルクラス．
 * @version 0.0 2013/09/09
 * @since 0.0 2013/09/09
 * @author shuma
 */
public class Model {
    /**
     * Viewクラスを保持する．
     */
    private View view;
    /**
     * コンストラクタ．
     * @since 0.0 2013/09/09
     */
    public Model() {
        //do nothing...
    }
    /**
     * Viewを関連づける．
     * @since 0.0 2013/09/09
     * @param view Viewクラス．
     */
    public void setView(View view) {
        this.view = view;
    }
}