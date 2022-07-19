package gui;

import app.MainFrame;

import javax.swing.*;

public class Menu extends JMenuBar{
	
	private JMenu file;
	private JMenu window;
	private JMenu help;
	
	private JMenuItem fNewProject;
	private JMenuItem fNewDiagram;
	
	private JMenuItem fOpenProject;
	private JMenuItem fOpenWorkSpace;
	
	private JMenuItem fSaveProject;
	private JMenuItem fSaveWorkSpace;
	private JMenuItem fSaveDiagram;
	
	private JMenuItem fCloseDiagram;
	private JMenuItem fCloseAllDiagrams;
	private JMenuItem fCloseProject;
	
	private JMenuItem hAbout;

	
	public Menu() {
		super();
		initElements();
		addElementsToJMenuBar();
		addElementsToJMenu();
	}
	
	private void initElements() {
		file = new JMenu("File");
		//window = new JMenu("Window");
		help = new JMenu("Help");
		
		/*fNewProject = new JMenuItem("New project");
		fNewDiagram = new JMenuItem("New diagram");
		
		fOpenWorkSpace = new JMenuItem("Open workspace");
		fOpenProject = new JMenuItem("Open project");
		
		fSaveWorkSpace = new JMenuItem("Save workspace");
		fSaveProject = new JMenuItem("Save project");
		fSaveDiagram = new JMenuItem("Save diagram");
		
		fCloseDiagram = new JMenuItem("Close diagram");
		fCloseAllDiagrams = new JMenuItem("Close all diagrams");
		fCloseProject = new JMenuItem("Close project");*/
		
		hAbout = new JMenuItem("About");
		
	}
	
	private void addElementsToJMenu() {
		
		/*file.add(MainFrame.getInstance().getActionManager().getNewProjectAction());
		file.add(MainFrame.getInstance().getActionManager().getNewDocumentAction());
		file.add(MainFrame.getInstance().getActionManager().getNewPageAction());*/
		file.add(MainFrame.getInstance().getActionManager().getNewNodeAction());
		file.add(MainFrame.getInstance().getActionManager().getOpenWorkspaceAction());
		file.add(MainFrame.getInstance().getActionManager().getOpenProjectAction());
		//file.add(MainFrame.getInstance().getActionManager().getSaveAsProjectAction());
		//file.add(MainFrame.getInstance().getActionManager().getSaveProjectAction());
		file.add(MainFrame.getInstance().getActionManager().getSaveAction());
		file.add(MainFrame.getInstance().getActionManager().getSaveAsAction());
		//file.add(MainFrame.getInstance().getActionManager().getSaveDocumentAction());
		
		/*file.add(fNewProject);
		file.add(fNewDiagram);
		
		file.add(fOpenWorkSpace);
		file.add(fOpenProject);
		
		file.add(fSaveWorkSpace);
		file.add(fSaveProject);
		file.add(fSaveDiagram);
		
		file.add(fCloseDiagram);
		file.add(fCloseAllDiagrams);
		file.add(fCloseProject);*/
		
		help.add(MainFrame.getInstance().getActionManager().getAboutAction());
	}
	
	private void addElementsToJMenuBar() {
		add(file);
		//add(window);
		add(help);
	}
	
}
