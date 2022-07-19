package view;

import app.MainFrame;
import model.Document;
import model.Page;
import observer.IListener;

import javax.swing.*;

import actions.CloseTabAction;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class DocumentView extends JPanel implements IListener {


    private Document document;
    //private static int counter = 0;

    
	private ProjectView parent;
	
	private ArrayList<PageView> pageViews = new ArrayList<PageView>();
	
	private JScrollPane scroll;
	
	
	
	
    public DocumentView(Document document) {
        super();

        this.document = document;
        this.document.addObserver(this);
        //document.setDocumentView(this);
        
        JButton btnClose = new JButton("Close");
        
        add(btnClose);
        
        btnClose.addActionListener(new CloseTabAction());
        
        
        

        //++counter;
        document.setName(document.getName());
        setName(document.getName());
      //  setLayout(new ScrollPaneLayout());
        
        
        setOpaque(false);
        
        
        setVisible(true);
        

    }


    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


    public void addPageView(Page page) {

        PageView pv = new PageView(page);
        //page.setPageView(pv);
        pv.setPage(page);
        pageViews.add(pv);
        pv.setParent(this);
        
        add(pv);
        
        SwingUtilities.updateComponentTreeUI(MainFrame.getInstance());
    }
    
    
    public void close() {
    	this.getParent().remove(this.getParent().getSelectedComponent());
    	this.getParent().getProject().remove(this.getDocument());
    }
    


    public ProjectView getParent() {
        return parent;
    }


    public void setParent(ProjectView parent) {
        this.parent = parent;
    }


	public JScrollPane getScroll() {
		return scroll;
	}


	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}


	@Override
	public void update(Object event) {
		
		if(event instanceof Document) {
    		this.close();
    	}
    	else if(event instanceof Page) {
    		this.addPageView((Page) event);
    	}
		
		
	}


	

    
    

}
