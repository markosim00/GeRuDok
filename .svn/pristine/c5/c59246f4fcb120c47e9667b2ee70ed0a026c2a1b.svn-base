package view;

import app.MainFrame;
import model.Document;
import model.Project;
import observer.IListener;

import javax.swing.*;

import actions.CloseTabAction;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class ProjectView extends JTabbedPane implements IListener {

    private Project project;

    private JTabbedPane tabbedPane;

    //private static int counter = 0;
	
	private JPanel panel;
	
	private ArrayList<DocumentView> documentViews = new ArrayList<DocumentView>();
	
    private static ArrayList<ProjectView> allProjectViews = new ArrayList<ProjectView>();
    
    private int index;


    public ProjectView(Project project) {
        this.project = project;
        this.project.addObserver(this);
        //project.setProjectView(this);
        //setPreferredSize(null);

        //++counter;
        project.setName(project.getName());

        allProjectViews.add(this);
        allProjectViews.forEach(projectView -> projectView.setVisible(false));
        

        MainFrame.getInstance().getContentPane().add(this);
        
        setSize(800,800);
        setVisible(true);
     
        SwingUtilities.updateComponentTreeUI(MainFrame.getInstance());
    }

    public static void showProject(Project selectedNode) {
        allProjectViews.forEach(projectView -> {
            if (projectView.getProject() == selectedNode) {
                projectView.setVisible(true);
            } else {
                projectView.setVisible(false);
            }
        });
    }


    public Project getProject() {
        return project;
    }


    public void setProject(Project project) {
        this.project = project;
    }


    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }


    public void setTabbedPane(JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
    }

    public void addDocumentView(Document document) {

        DocumentView dv = new DocumentView(document);

        documentViews.add(dv);
        
        dv.setParent(this);
        
        this.addTab(dv.getDocument().getName(), dv);
        
        /*index = this.getTabCount() - 1;
     
        JButton btnClose = new JButton("x");
        btnClose.setSize(5,5);
  
        this.setTabComponentAt(index,btnClose);
        
        
        
        btnClose.addActionListener(new CloseTabAction());*/

        SwingUtilities.updateComponentTreeUI(this);
    }

    public void closeAllTabs() {
    	this.removeAll();
    	
    	Project p = this.getProject();
    	
    	p.getDocuments().clear();
    	
    	
    	SwingUtilities.updateComponentTreeUI(MainFrame.getInstance());
    	
    }
    
   

   

	public int getIndex() {
		return this.getSelectedIndex();
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public ArrayList<DocumentView> getDocumentViews() {
		return documentViews;
	}

	public void setDocumentViews(ArrayList<DocumentView> documentViews) {
		this.documentViews = documentViews;
	}

	@Override
	public void update(Object event) {
		
		if(event instanceof Project) {
    		this.closeAllTabs();
    	}
    	
    	if(event instanceof Document) {
    		this.addDocumentView((Document) event);
    	}
	}
    
    
    
    

}
