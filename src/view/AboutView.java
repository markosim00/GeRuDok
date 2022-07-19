package view;

import javax.swing.*;
import java.awt.*;

public class AboutView {

    public static void show() {
        EventQueue.invokeLater(() -> {

            JFrame frame = new JFrame("About");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setPreferredSize(new Dimension(300, 300));
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception except) {
                except.printStackTrace();
            }
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setOpaque(true);
            JTextArea textArea = new JTextArea("Marko Simonovic 82-2019\nMarko Milosevic 101-2019");
            textArea.setWrapStyleWord(true);
            textArea.setEditable(false);
            textArea.setFont(Font.getFont(Font.SANS_SERIF));
            JScrollPane scroller = new JScrollPane(textArea);
            scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            panel.add(textArea);
            frame.getContentPane().add(BorderLayout.CENTER, panel);
            frame.pack();
            frame.setLocationByPlatform(true);
            frame.setVisible(true);
            frame.setResizable(true);

        });
    }

}
