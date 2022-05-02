package components;

import javax.swing.JSpinner;

public class Spinner extends JSpinner {

    public void setLabelText(String str) {
        SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
        editor.setLabelText(str);
    }
    
    public String getLabelText(){
         SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
         return editor.getLabelText();
    }
    
    public String getText(){
         SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
         return editor.getText();
    }
    
    public void setText(String str){
         SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
         editor.setText(str);
    }

    public Spinner() {
        setOpaque(false);
        setUI(new SpinnerUI());
    }
}
