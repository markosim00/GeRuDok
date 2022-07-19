package actions;

import app.MainFrame;
import model.Document;
import model.Project;
import view.DocumentView;
import view.ProjectView;

import javax.swing.tree.TreePath;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {


    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
            TreePath treePath = MainFrame.getInstance()
                    .getTree().getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
            if (null != treePath) {
                MainFrame.getInstance().getTree().setSelectionPath(treePath);

                MainFrame.getInstance().getTree()
                        .getPopupMenu().show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
            }
        }
        if (mouseEvent.getClickCount() == 2) {
            TreePath treePath = MainFrame.getInstance()
                    .getTree().getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
            if (null != treePath) {
                MainFrame.getInstance().getTree().setSelectionPath(treePath);

                Object selectedNode = treePath.getLastPathComponent();
                if (selectedNode instanceof Project) {
                    ProjectView.showProject((Project) selectedNode);
                }
                
            }
        }
        
        
        
        super.mousePressed(mouseEvent);
    }

}
