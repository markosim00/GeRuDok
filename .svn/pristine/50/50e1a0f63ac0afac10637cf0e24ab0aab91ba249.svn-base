package actions;

import java.awt.event.ActionEvent;

import app.MainFrame;
import model.Document;
import model.Page;
import model.Project;
import model.Workspace;

public class RenameNodeAction extends AbstractGEDAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = e.getActionCommand();
		
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		
		if(obj instanceof Project) {
			
			Project project = (Project) obj;
			
			project.setName(name);
			
		}
		
		if(obj instanceof Document) {
			
			Document document = (Document) obj;
			
			document.setName(name);
			
			
		}
		
		if(obj instanceof Page) {
			
			Page page = (Page) obj;
			
			page.setName(name);
			
			
		}
		
		
	}

	
	
	
}
