package model;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;



public class WorkSpaceTreeModel extends DefaultTreeModel{

	public WorkSpaceTreeModel() {
		super(new Workspace("Workspace"));
		
	}

	public void addProject(Project project){
		
		((Workspace)getRoot()).addProject(project);
		
	}
	
}
