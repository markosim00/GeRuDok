package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

import app.MainFrame;

public class Toolbar extends JToolBar{
	
	private JButton btnNewProject;
	private JButton btnNewDiagram;
	
	private JButton btnOpenWorkspace;
	private JButton btnOpenProject;
	
	private JButton btnSaveWorkspace;
	private JButton btnSaveProject;
	private JButton btnSaveDiagram;
	
	private JButton btnCloseDiagram;
	private JButton btnCloseAllDiagrams;
	private JButton btnCloseProject;

	public Toolbar() {
		/*add(MainFrame.getInstance().getActionManager().getNewProjectAction());
		add(MainFrame.getInstance().getActionManager().getNewDocumentAction());
		add(MainFrame.getInstance().getActionManager().getNewPageAction());*/
		add(MainFrame.getInstance().getActionManager().getNewNodeAction());
		add(MainFrame.getInstance().getActionManager().getOpenWorkspaceAction());
		add(MainFrame.getInstance().getActionManager().getOpenProjectAction());
		//add(MainFrame.getInstance().getActionManager().getSaveAsProjectAction());
		//add(MainFrame.getInstance().getActionManager().getSaveProjectAction());
		add(MainFrame.getInstance().getActionManager().getSaveAction());
		add(MainFrame.getInstance().getActionManager().getSaveAsAction());
		//add(MainFrame.getInstance().getActionManager().getSaveDocumentAction());
	}
	
	private void initElements() {
		btnNewProject = new JButton();
		btnNewDiagram = new JButton();
		
		btnOpenWorkspace = new JButton();
		btnOpenProject = new JButton();
		
		btnSaveWorkspace = new JButton();
		btnSaveProject = new JButton();
		btnSaveDiagram = new JButton();
		
		btnCloseDiagram = new JButton();
		btnCloseAllDiagrams = new JButton();
		btnCloseProject = new JButton();
	}
	
	private void addElements() {
		this.add(btnNewProject);
		this.add(btnNewDiagram);
		
		this.add(btnOpenWorkspace);
		this.add(btnOpenProject);
		
		this.add(btnSaveWorkspace);
		this.add(btnSaveProject);
		this.add(btnSaveDiagram);
		
		this.add(btnCloseDiagram);
		this.add(btnCloseAllDiagrams);
		this.add(btnCloseProject);
	}
	
}
