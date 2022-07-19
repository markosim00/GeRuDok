package observer;

import app.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrameListener extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        int confirm = JOptionPane.showOptionDialog(
                null, "Do you want to save Workspace?",
                "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == 0) {
            MainFrame.getInstance().getActionManager().getSaveAction().actionPerformed(new ActionEvent(MainFrame.getInstance(), ActionEvent.ACTION_PERFORMED, "Save"));
            System.exit(0);
        }
        if (confirm == 1) {
            System.exit(0);
        }
    }
}
