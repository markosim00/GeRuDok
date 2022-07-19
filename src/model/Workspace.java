package model;

import app.MainFrame;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Observable;



public class Workspace extends DefaultMutableTreeNode implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8007584919445235284L;

	private ArrayList<Project> projects = new ArrayList<Project>();
	
	private File workspaceFile;
	
	private transient boolean changed;

	public Workspace(String name) {
		super("Workspace");
		// TODO Auto-generated constructor stub
	}
	
	
	public void addProject(Project project){
		projects.add(project);
		project.setName("Project "+projects.size());
		project.setParent(this);
		
		SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getTree());
	}
	
	public Project getProject(int index) {
		return projects.get(index);
	}	
	
	public int getProjectIndex(Project project) {
		return projects.indexOf(project);
	}
	public int getProjectsCount() {
		return projects.size();
	}

	

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIndex(TreeNode node) {
		
		if(node instanceof Project) {
			return projects.indexOf(node);
		}
		return 0;
		
	}

	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

	


	@Override
	public TreeNode getChildAt(int childIndex) {
		return projects.get(childIndex);
	}


	@Override
	public int getChildCount() {
		return projects.size();
	}


	@Override
	public void insert(MutableTreeNode child, int index) {
		
		if(child instanceof Project) {
			this.projects.add(index,(Project) child);
		}
		
	}


	@Override
	public void remove(int index) {
		this.projects.remove(index);
	}


	@Override
	public void remove(MutableTreeNode node) {
		Project project = (Project) node;
		//project.getProjectView().setEnabled(false);
		//project.getProjectView().setVisible(false);
		project.removeFromParent();
		this.projects.remove(project);
		SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getTree());
	}



	@Override
	public void setUserObject(Object object) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeFromParent() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setParent(MutableTreeNode newParent) {
		// TODO Auto-generated method stub
		
	}


	public File getWorkspaceFile() {
		return workspaceFile;
	}


	public void setWorkspaceFile(File workspaceFile) {
		this.workspaceFile = workspaceFile;
	}


	public boolean isChanged() {
		return changed;
	}


	public void setChanged(boolean changed) {
		
		if(this.changed != changed) {
			
			this.changed = changed;
			
			SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getTree());
			
		}
		
		
	}

	
	

	
	
	
}
