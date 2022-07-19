package gui;

import app.MainFrame;
import controller.WorkSpaceTreeController;
import model.Document;
import model.Page;
import model.Project;
import model.Workspace;

import javax.swing.*;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class WorkSpaceTree extends JTree {

    public WorkSpaceTree() {

        super(new Workspace("Workspace"));
        getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        addTreeSelectionListener(new WorkSpaceTreeController());
        addMouseListener(MainFrame.getInstance().getActionManager().getMouseListener());

        setEditable(true);

    }

    public JPopupMenu getPopupMenu() {
        JPopupMenu menu = new JPopupMenu();
        Object selectedNode = this.getSelectionPath().getLastPathComponent();

        if (selectedNode instanceof Workspace) {
            JMenuItem newItem = new JMenuItem("New Project");
            newItem.addActionListener(MainFrame.getInstance().getActionManager().getNewNodeAction());
            menu.add(newItem);
            
            JMenuItem saveItem = new JMenuItem("Save workspace");
            saveItem.addActionListener(MainFrame.getInstance().getActionManager().getSaveAction());
            menu.add(saveItem);
            
            JMenuItem saveAsItem = new JMenuItem("Save As...");
            saveAsItem.addActionListener(MainFrame.getInstance().getActionManager().getSaveAsAction());
            menu.add(saveAsItem);
            
        } else if (selectedNode instanceof Project) {
        	
            JMenuItem newItem = new JMenuItem("New Document");
            newItem.addActionListener(MainFrame.getInstance().getActionManager().getNewNodeAction());
            menu.add(newItem);
            
            JMenuItem delItem = new JMenuItem("Delete Project");
            delItem.addActionListener(MainFrame.getInstance().getActionManager().getDeleteAction());
            menu.add(delItem);
            
            JMenuItem closeAllTabsItem = new JMenuItem("Close all tabs");
            closeAllTabsItem.addActionListener(MainFrame.getInstance().getActionManager().getCloseAllTabsAction());
            menu.add(closeAllTabsItem);
            
            JMenuItem saveItem = new JMenuItem("Save project");
            saveItem.addActionListener(MainFrame.getInstance().getActionManager().getSaveAction());
            menu.add(saveItem);
           
            JMenuItem saveAsItem = new JMenuItem("Save As...");
            saveAsItem.addActionListener(MainFrame.getInstance().getActionManager().getSaveAsAction());
            menu.add(saveAsItem);            
            
            
        } else if (selectedNode instanceof Document) {
        	
            JMenuItem newItem = new JMenuItem("New Page");
            newItem.addActionListener(MainFrame.getInstance().getActionManager().getNewNodeAction());
            menu.add(newItem);
            
            JMenuItem delItem = new JMenuItem("Delete Document");
            delItem.addActionListener(MainFrame.getInstance().getActionManager().getDeleteAction());
            menu.add(delItem);
            
            
            
        } else if (selectedNode instanceof Page) {
        	
            JMenuItem newItem = new JMenuItem("New Socket(to be added)");
            //newItem.addActionListener(MainFrame.getInstance().getActionManager().getNewPageAction());
            menu.add(newItem);
            
            JMenuItem delItem = new JMenuItem("Delete Page");
            delItem.addActionListener(MainFrame.getInstance().getActionManager().getDeleteAction());
            menu.add(delItem);
            
                       
        }

        return menu;
    }

    public void addProject(Project project) {
        ((Workspace) getModel().getRoot()).addProject(project);

        SwingUtilities.updateComponentTreeUI(this);
    }

    public void remove(Project node) {
    }
    
    public Project getCurrentProject() {
    	
    	TreePath path = this.getSelectionPath();
    	
    	for(int i = 0; i < path.getPathCount(); i++) {
    		if(path.getPathComponent(i) instanceof Project) {
    			return (Project)path.getPathComponent(i);
    		}
    	}
    	
    	return null;
    	
    }
    
    
    
    
}






