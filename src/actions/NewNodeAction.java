package actions;

import java.awt.event.ActionEvent;

import javax.swing.tree.TreePath;

import app.MainFrame;
import factory.DocumentCreator;
import model.Document;
import model.Page;
import model.Project;
import model.Workspace;
import notify.Notification;
import view.ProjectView;

public class NewNodeAction extends AbstractGEDAction{
	
	
	public NewNodeAction() {
		
		putValue(NAME,"New");
		putValue(SHORT_DESCRIPTION,"New");

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		DocumentCreator docCreator = new DocumentCreator();
		
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		
		TreePath path = MainFrame.getInstance().getTree().getSelectionPath();
		
		if(obj instanceof Project) {
			
			MainFrame.getInstance().getTree().expandPath(path);
			
			Project project = (Project) obj;
			
			Document document  = (Document) docCreator.createDocument(Notification.NEW_DOCUMENT);
			
			project.addDocuments(document);
			
		}
		
		else if(obj instanceof Document) {
			
			MainFrame.getInstance().getTree().expandPath(path);
			
			Document document = (Document) obj;
			
			Page page = (Page) docCreator.createDocument(Notification.NEW_PAGE);
			
			document.addPages(page);
			
		}
		
		else {
			Project project = (Project) docCreator.createDocument(Notification.NEW_PROJECT);
			ProjectView pv = new ProjectView(project);
			
			pv.setProject(project);
			
			MainFrame.getInstance().getTree().addProject(project);
			MainFrame.getInstance().getDesktop().add(pv);
			
			MainFrame.getInstance().revalidate();
			MainFrame.getInstance().repaint();
		}
		
		
	}

}
