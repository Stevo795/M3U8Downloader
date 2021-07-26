package MTv1;

// display system.out.print to the textArea
// credit: https://stackoverflow.com/a/38664810

import javax.swing.*;
import java.io.OutputStream;

public class PanelOutPutStream extends OutputStream {
    private JTextArea textArea;

    public PanelOutPutStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
//        textArea.append(String.valueOf((char)b));
        textArea.setText(textArea.getText() + String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
        // keeps the textArea up to date
        //textArea.update(textArea.getGraphics());
    }
}
