package model;

import app.MainFrame;
import factory.AbstractDocument;
import observer.IListener;
import observer.IObserver;
import view.DocumentView;
import view.PageView;

import javax.swing.*;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Observable;


public class Document extends AbstractDocument implements MutableTreeNode,Serializable,IObserver {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5804159052433378123L;

	private String name;

    private Project parent;

    private ArrayList<Page> pages = new ArrayList<Page>();
    
    private List<IListener> listeners;
    

    //private DocumentView documentView;


    public Document() {
        super();
        this.name = "generic";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPages(Page page) {

        this.pages.add(page);
        page.setName("Page" + pages.size());
        page.setParent(this);
		//PageView pv = new PageView(page);
        //page.setPageView(pv);

        //documentView.add(pv);

        SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getTree());
       
        this.notifyObservers(this.pages.get(this.pages.size() - 1));

		SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getDesktop());
    }
    
    public void closeTab() {
    	
    	
    	this.notifyObservers(this);
    	
    }
    
    
    
    

    @Override
    public TreeNode getChildAt(int childIndex) {
        return this.pages.get(childIndex);
    }

    @Override
    public int getChildCount() {
        if (this.pages != null)
            return this.pages.size();
        return 0;
    }

    public Project getParent() {
        return this.parent;
    }

    @Override
    public int getIndex(TreeNode node) {
        // TODO Auto-generated method stub
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


    public void setParent(Project parent) {
        this.parent = parent;
    }

    @Override
    public void insert(MutableTreeNode child, int index) {

        if (child instanceof Page) {
            this.pages.add(index, (Page) child);
        }


    }

    @Override
    public void remove(int index) {

        this.pages.remove(index);

    }

    @Override
    public void remove(MutableTreeNode node) {
        node.removeFromParent();
        this.pages.remove(node);
        SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getTree());
    }

    @Override
    public void setUserObject(Object object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeFromParent() {
        // TODO Auto-generated method stub
    	this.parent = null;
    }

    @Override
    public void setParent(MutableTreeNode newParent) {

        if (newParent instanceof Project) {
            this.parent = (Project) newParent;
        }

    }

    @Override
    public String toString() {
        return this.parent.getName() + " - " + this.name;
    }

    
    public void rename(String name) {
    	this.name = name;
    }

    /*public void setDocumentView(DocumentView documentView) {
        this.documentView = documentView;
    }

    public DocumentView getDocumentView() {
        return documentView;
    }*/

    public ArrayList<Page> getPages() {
        return pages;
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
}
