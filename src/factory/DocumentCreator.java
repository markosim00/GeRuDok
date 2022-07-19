package factory;

import javax.swing.tree.TreePath;

import app.MainFrame;
import model.Document;
import model.Page;
import model.Project;
import notify.Notification;
import view.ProjectView;

public class DocumentCreator extends AbstractDocumentCreator{

	

	@Override
	public AbstractDocument createDocument(Notification type) {
		
		
		AbstractDocument doc = null;
		
		if(type.equals(Notification.NEW_PROJECT))
			
			doc = new Project(" "); 
		
		else if(type.equals(Notification.NEW_DOCUMENT))
			
			doc = new Document();
		
		else if(type.equals(Notification.NEW_PAGE))
			
			doc = new Page();
		
		
		
		return doc;
	}

	
	
	
}
