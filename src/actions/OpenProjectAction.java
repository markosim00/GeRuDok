package actions;

import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;

import app.MainFrame;
import model.Project;
import model.Workspace;
import view.DocumentView;
import view.ProjectView;

public class OpenProjectAction extends AbstractGEDAction{

	public OpenProjectAction() {
		putValue(NAME,"Open project");
		putValue(SHORT_DESCRIPTION,"Open project");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JFileChooser jfc = new JFileChooser();
		jfc.setFileFilter(new DocumentFileFilter());
		
		Object obj = MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		
		if(obj instanceof Workspace) {
			
			Workspace ws = (Workspace) obj;
			
			if(jfc.showOpenDialog(MainFrame.getInstance()) == JFileChooser.APPROVE_OPTION) {
				
				try {
					ObjectInputStream os = new ObjectInputStream(new FileInputStream(jfc.getSelectedFile()));
					
					Project p = null;
					
					try {
						p = (Project) os.readObject();
						os.close();
						((Workspace)MainFrame.getInstance().getTreeModel().getRoot()).addProject(p);
						
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					MainFrame.getInstance().getTree().addProject(p);
					
					
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
			
			
		}
		
		
		
	}

	
}
