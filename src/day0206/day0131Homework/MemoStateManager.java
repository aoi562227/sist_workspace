package day0206.day0131Homework;

import java.awt.Font;
import java.io.Serializable;

public class MemoStateManager implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private static final String STATE_FILE = "memo_state.ser";
    
    private String text;
    private Font font;

    public MemoStateManager(String text, Font font) {
        this.text = text;
        this.font = font;
    }

    public String getText() {
        return text;
    }

    public Font getFont() {
        return font;
    }
}
