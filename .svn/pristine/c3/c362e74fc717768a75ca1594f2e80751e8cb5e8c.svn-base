package controller;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import app.MainFrame;
import model.Document;
import model.Page;
import model.Project;
import model.Workspace;

public class WorkSpaceTreeController implements TreeSelectionListener{

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getPath().getLastPathComponent();
		setAllowedActions(obj);
	}
	
	public void setAllowedActions(Object obj) {
		
		if(obj instanceof Workspace) {
			
			/*MainFrame.getInstance().getActionManager().getNewProjectAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getNewDocumentAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getNewPageAction().setEnabled(false);*/
			
			//MainFrame.getInstance().getActionManager().getSaveAsProjectAction().setEnabled(false);
			//MainFrame.getInstance().getActionManager().getSaveDocumentAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getSaveAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getSaveAsAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getOpenWorkspaceAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getOpenProjectAction().setEnabled(true);
			
		}
		
		else if(obj instanceof Project) {
			
			/*MainFrame.getInstance().getActionManager().getNewProjectAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getNewDocumentAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getNewPageAction().setEnabled(false);*/
			//MainFrame.getInstance().getActionManager().getSaveAsProjectAction().setEnabled(true);
			//MainFrame.getInstance().getActionManager().getSaveDocumentAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getSaveAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getSaveAsAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getOpenWorkspaceAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getOpenProjectAction().setEnabled(true);
			
			
		}
		
		else if(obj instanceof Document) {
			
			/*MainFrame.getInstance().getActionManager().getNewProjectAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getNewDocumentAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getNewPageAction().setEnabled(true);*/
			//MainFrame.getInstance().getActionManager().getSaveAsProjectAction().setEnabled(false);
			//MainFrame.getInstance().getActionManager().getSaveDocumentAction().setEnabled(true);
			MainFrame.getInstance().getActionManager().getSaveAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getSaveAsAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getOpenWorkspaceAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getOpenProjectAction().setEnabled(false);
			
		}
		
		else if (obj instanceof Page) {
			
			/*MainFrame.getInstance().getActionManager().getNewProjectAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getNewDocumentAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getNewPageAction().setEnabled(false);*/
			//MainFrame.getInstance().getActionManager().getSaveAsProjectAction().setEnabled(false);
			//MainFrame.getInstance().getActionManager().getSaveDocumentAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getSaveAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getSaveAsAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getOpenWorkspaceAction().setEnabled(false);
			MainFrame.getInstance().getActionManager().getOpenProjectAction().setEnabled(false);
			
		}
		
	}

}
