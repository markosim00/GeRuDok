package actions;

import java.awt.event.ActionEvent;

import app.MainFrame;
import model.Document;
import model.Project;

public class CloseTabAction extends AbstractGEDAction{
	
	public CloseTabAction() {
		
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();

		if(obj instanceof Document) {
			
			Document doc = (Document) obj;
			
			doc.closeTab();
			
		}
		
		
	}

}
