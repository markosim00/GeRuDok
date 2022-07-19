package actions;

import view.AboutView;

import java.awt.event.ActionEvent;

public class AboutAction extends AbstractGEDAction {

    public AboutAction() {
        putValue(NAME, "About");
        putValue(SHORT_DESCRIPTION, "About");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AboutView.show();
    }

}
