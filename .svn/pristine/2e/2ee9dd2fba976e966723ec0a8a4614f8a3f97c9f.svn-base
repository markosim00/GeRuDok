package actions;

import java.awt.event.ActionEvent;

import app.MainFrame;
import model.Document;
import model.Page;
import model.Project;
import model.Workspace;

public class DeleteAction extends AbstractGEDAction{
	
	public DeleteAction() {
		
		putValue(NAME,"Delete");
		putValue(SHORT_DESCRIPTION,"Delete");
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		
		if(obj instanceof Project) {
			
			Project node = (Project) obj;
			Workspace parent = (Workspace) node.getParent();
		    parent.remove(node);
		    node.closeAllTabs();
			
		}
		
		
		if(obj instanceof Document) {
			
			Document node = (Document) obj;
			Project parent = node.getParent();
	        parent.remove(node);
	        node.closeTab();
			
		}
		
		
		if(obj instanceof Page) {
			
			Page node = (Page) obj;
			Document parent = node.getParent();
	        parent.remove(node);
	        node.close();
		}
		
		
	}
	
	
	

}
