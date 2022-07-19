package actions;

import app.MainFrame;
import model.Project;
import model.Workspace;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveAction extends AbstractGEDAction{
	
	public SaveAction() {
		
		putValue(NAME,"Save");
		putValue(SHORT_DESCRIPTION,"Save");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		
		if(obj instanceof Workspace || e.getSource() instanceof Workspace) {
			
			Workspace ws = (Workspace) obj;
			File wsFile = ws.getWorkspaceFile();
			
			if(wsFile == null) {
				new SaveAsAction().actionPerformed(e);
				return;
			}
			
			ObjectOutputStream os;
			
			try {
				os = new ObjectOutputStream(new FileOutputStream(wsFile));
				os.writeObject(ws);
				ws.setChanged(false);
				os.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
		if(obj instanceof Project) {
			
			Project project = (Project) obj;
			File projectFile = project.getProjectFile();
			
			
			
			if(projectFile == null) {
				new SaveAsAction().actionPerformed(e);
				return;
			}
			
			ObjectOutputStream os;
			
			try {
				os = new ObjectOutputStream(new FileOutputStream(projectFile));
				os.writeObject(project);
				project.setChanged(false);
				os.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
		
		
		
	}

}
