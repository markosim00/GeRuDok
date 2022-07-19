package model;

import app.MainFrame;
import event.UpdateEvent;
import event.UpdateListener;
import factory.AbstractDocument;
import observer.IListener;
import observer.IObserver;
import view.ProjectView;

import javax.swing.*;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class Project extends AbstractDocument implements MutableTreeNode,UpdateListener,Serializable,IObserver {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3759351320318366378L;

	private ArrayList<Document> documents = new ArrayList<Document>();

    private String name;

    private Workspace parent;
    
    private File projectFile;
    
    private transient boolean changed;
    
    
    
    private List<IListener> listeners;

    //private ProjectView projectView;


    public Project(String name) {
        super();
        this.name = name;
        this.changed = false;
        this.projectFile = null;
    }

    public void addDocuments(Document doc) {
        documents.add(doc);
        doc.setName("Dokument" + documents.size());
        doc.setParent(this);

        SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getTree());
        
        this.notifyObservers(this.documents.get(this.documents.size() - 1));
    }


    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public TreeNode getChildAt(int childIndex) {

        return documents.get(childIndex);
    }

    @Override
    public int getChildCount() {
        return documents.size();
    }

    @Override
    public TreeNode getParent() {
        return this.parent;
    }

    @Override
    public int getIndex(TreeNode node) {
        
    	for(Document doc : documents) {
    		
    		if(node.equals(doc)) {
    			return documents.indexOf(doc);
    		}
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
    public Enumeration<? extends TreeNode> children() {
        // TODO Auto-generated method stub
        return null;
    }


    public void setParent(Workspace parent) {
        this.parent = parent;
    }

    @Override
    public void insert(MutableTreeNode child, int index) {

        if (child instanceof Document) {
            this.documents.add(index, (Document) child);
        }

    }

    @Override
    public void remove(int index) {
        this.documents.remove(index);

    }

   /* @Override
    public void remove(MutableTreeNode node) {

        if (node instanceof Document) {
            node.removeFromParent();
            projectView.removeTabAt(documents.indexOf(node));
            this.documents.remove(node);
            SwingUtilities.updateComponentTreeUI(MainFrame.getInstance());
        }

    }*/

    @Override
    public void setUserObject(Object object) {
       

    }

    @Override
    public void removeFromParent() {
    	
    	this.parent = null;
    }

    @Override
    public void setParent(MutableTreeNode newParent) {

        if (newParent instanceof Workspace) {
            this.parent = (Workspace) newParent;
        }

    }

    @Override
    public String toString() {
        return this.name;
    }

	@Override
	public void remove(MutableTreeNode node) {
		// TODO Auto-generated method stub
		if(node instanceof Document) {
			node.removeFromParent();
            this.documents.remove(node);
            SwingUtilities.updateComponentTreeUI(MainFrame.getInstance());
		}
		
	}
	
	public void rename(String name) {
		this.name = name;
		setUserObject(name);
	}

	public File getProjectFile() {
		return projectFile;
	}

	public void setProjectFile(File projectFile) {
		this.projectFile = projectFile;
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

	@Override
	public void updatePerformed(UpdateEvent e) {
		setChanged(true);
	}

	
	
	public void closeAllTabs() {
		
		
		this.notifyObservers(this);
		
		
	}

	@Override
	public void addObserver(IListener listener) {
		
		if(listener == null) return;
		
		if(this.listeners == null) 
			this.listeners = new ArrayList<IListener>();
		
		if(this.listeners.contains(listener))
			return;
		
		this.listeners.add(listener);
		
	}

	@Override
	public void removeObserver(IListener listener) {
		
		if(this.listeners == null || listeners.isEmpty() || !this.listeners.contains(listener))
			return;
		
		this.listeners.remove(listener);
		
	}

	@Override
	public void notifyObservers(Object event) {
		
		if(event == null || this.listeners == null || this.listeners.isEmpty())
			return;
		
		
		for(IListener listener : listeners) {
			listener.update(event);
		}
		
		
	}
	
	
	
	
    /*public ProjectView getProjectView() {
        return projectView;
    }

    public void setProjectView(ProjectView projectView) {
        this.projectView = projectView;
    }*/
}
