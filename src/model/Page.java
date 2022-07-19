package model;

import view.PageView;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import factory.AbstractDocument;
import models.PageModel;
import observer.IListener;
import observer.IObserver;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Observable;



public class Page extends AbstractDocument implements MutableTreeNode,Serializable,IObserver{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4000666568433885647L;

	private String name;
	
	private Document parent;
	//private PageView pageView;
	
	
	private List<IListener> listeners;
	
	private List<Slot> slots = new ArrayList<Slot>();
	
	private PageModel model = new PageModel();

	public Page() {
		super();
		
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getChildCount() {
		return slots.size();
	}

	public Document getParent() {
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

	

	
	public void setParent(Document parent) {
		this.parent = parent;
	}

	@Override
	public void insert(MutableTreeNode child, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(MutableTreeNode node) {
		// TODO Auto-generated method stub
		
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
		
		if(newParent instanceof Document) {
			this.parent = (Document) newParent;
		}
		
	}

	@Override
	public String toString() {
		return this.parent.getParent().getName() + " - " + this.parent.getName() + " - " + this.name;
	}
	
	public void rename(String name) {
		this.name = name;
	}
	
	
	public void close() {
		
		
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

	public PageModel getModel() {
		return model;
	}

	public void setModel(PageModel model) {
		this.model = model;
	}
	
	
	
	
	

    /*public void setPageView(PageView pageView) {
        this.pageView = pageView;
    }

    public PageView getPageView() {
        return pageView;
    }*/
}
