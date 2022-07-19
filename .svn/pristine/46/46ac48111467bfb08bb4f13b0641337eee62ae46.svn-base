package actions;

import java.awt.event.ActionEvent;

import app.MainFrame;
import model.Project;

public class CloseAllTabsAction extends AbstractGEDAction{

	public CloseAllTabsAction() {
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		
		if(obj instanceof Project) {
			
			Project project = (Project) obj;
			
			project.closeAllTabs();
			
			
		}
		
		
		
		
	}
	
	
	

}
