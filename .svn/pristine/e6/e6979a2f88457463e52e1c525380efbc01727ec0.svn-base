package actions;

import app.MainFrame;
import model.Project;
import model.Workspace;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveAsAction extends AbstractGEDAction{
	
	public SaveAsAction() {
		
		putValue(NAME,"Save As...");
		putValue(SHORT_DESCRIPTION,"Save As...");
	
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFileChooser jfc = new JFileChooser();
		
		jfc.setFileFilter(new DocumentFileFilter());
		
		File projectFile = null;
		
		File wsFile = null;
		
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		
		if(obj instanceof Workspace || e.getSource() instanceof Workspace) {
			
			Workspace ws = (Workspace) obj;
			
			if(jfc.showSaveDialog(MainFrame.getInstance()) == JFileChooser.APPROVE_OPTION) {
				wsFile = jfc.getSelectedFile();
				
			}
			
			ObjectOutputStream os;
			
			try {
				os = new ObjectOutputStream(new FileOutputStream(projectFile));
				os.writeObject(ws);
				ws.setChanged(false);
				ws.setWorkspaceFile(projectFile);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
		
		if(obj instanceof Project) {
			
			Project project = (Project) obj;
			
			if(jfc.showSaveDialog(MainFrame.getInstance()) == JFileChooser.APPROVE_OPTION) {
				projectFile = jfc.getSelectedFile();
				
			}
			
			ObjectOutputStream os;
			
			try {
				os = new ObjectOutputStream(new FileOutputStream(projectFile));
				os.writeObject(project);
				project.setChanged(false);
				project.setProjectFile(projectFile);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
		
	}

}
