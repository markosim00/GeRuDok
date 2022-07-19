package actions;

import java.awt.event.MouseListener;

public class ActionManager {


    private MouseListener mouseListener;
    /*private DeletePageAction deletePageAction;
    private DeleteDocumentAction deleteDocumentAction;
    private DeleteProject deleteProjectAction;*/
    /*private NewProjectAction newProjectAction;
    private NewDocumentAction newDocumentAction;
    private NewPageAction newPageAction;*/
    
    private NewNodeAction newNodeAction;
    
    private OpenProjectAction openProjectAction;
    private OpenWorkspaceAction openWorkspaceAction;
    //private SaveDocumentAction saveDocumentAction;
    //private SaveAsProjectAction saveAsProjectAction;
    //private SaveProjectAction saveProjectAction;
    private AboutAction aboutAction;
    private CloseAllTabsAction closeAllTabsAction;
    private RenameNodeAction renameNodeAction;
    private SaveAction saveAction;
    private SaveAsAction saveAsAction;
    private DeleteAction deleteAction;
    
    private PHandCursorAction pHandCursorAction;
    private PCircleAction pCircleAction;
    private PTriangleAction pTriangleAction;
    private PRectangleAction pRectangleAction;
    
    
    
    public ActionManager() {
        /*newProjectAction = new NewProjectAction();
        newDocumentAction = new NewDocumentAction();
        newPageAction = new NewPageAction();*/
    	newNodeAction = new NewNodeAction();
        openProjectAction = new OpenProjectAction();
        openWorkspaceAction = new OpenWorkspaceAction();
        //saveDocumentAction = new SaveDocumentAction();
        //saveAsProjectAction = new SaveAsProjectAction();
        //saveProjectAction = new SaveProjectAction();
        saveAction = new SaveAction();
        saveAsAction = new SaveAsAction();
        aboutAction = new AboutAction();
       /* deleteProjectAction = new DeleteProject();
        deleteDocumentAction = new DeleteDocumentAction();
        deletePageAction = new DeletePageAction();*/
        mouseListener = new MyMouseListener();
        closeAllTabsAction = new CloseAllTabsAction();
        renameNodeAction = new RenameNodeAction();
        deleteAction = new DeleteAction();
        
        pHandCursorAction = new PHandCursorAction();
        pTriangleAction = new PTriangleAction();
        pCircleAction = new PCircleAction();
        pRectangleAction = new PRectangleAction();
        
    }

    public MouseListener getMouseListener() {
        return mouseListener;
    }

    public void setMouseListener(MouseListener mouseListener) {
        this.mouseListener = mouseListener;
    }

   /* public NewProjectAction getNewProjectAction() {
        return newProjectAction;
    }

    public void setNewProjectAction(NewProjectAction newProjectAction) {
        this.newProjectAction = newProjectAction;
    }*/

    public OpenProjectAction getOpenProjectAction() {
        return openProjectAction;
    }

    public void setOpenProjectAction(OpenProjectAction openProjectAction) {
        this.openProjectAction = openProjectAction;
    }

    public OpenWorkspaceAction getOpenWorkspaceAction() {
        return openWorkspaceAction;
    }

    public void setOpenWorkspaceAction(OpenWorkspaceAction openWorkspaceAction) {
        this.openWorkspaceAction = openWorkspaceAction;
    }

   /* public SaveDocumentAction getSaveDocumentAction() {
        return saveDocumentAction;
    }

    public void setSaveDocumentAction(SaveDocumentAction saveDocumentAction) {
        this.saveDocumentAction = saveDocumentAction;
    }*/

    


    public AboutAction getAboutAction() {
        return aboutAction;
    }

   

	public void setAboutAction(AboutAction aboutAction) {
        this.aboutAction = aboutAction;
    }

   /* public NewDocumentAction getNewDocumentAction() {
        return newDocumentAction;
    }

    public void setNewDocumentAction(NewDocumentAction newDocumentAction) {
        this.newDocumentAction = newDocumentAction;
    }

    public NewPageAction getNewPageAction() {
        return newPageAction;
    }

    public void setNewPageAction(NewPageAction newPageAction) {
        this.newPageAction = newPageAction;
    }*/

    

	

	public CloseAllTabsAction getCloseAllTabsAction() {
		return closeAllTabsAction;
	}

	public void setCloseAllTabsAction(CloseAllTabsAction closeAllTabsAction) {
		this.closeAllTabsAction = closeAllTabsAction;
	}

	public RenameNodeAction getRenameNodeAction() {
		return renameNodeAction;
	}

	public void setRenameNodeAction(RenameNodeAction renameNodeAction) {
		this.renameNodeAction = renameNodeAction;
	}

	

	public SaveAction getSaveAction() {
		return saveAction;
	}

	public void setSaveAction(SaveAction saveAction) {
		this.saveAction = saveAction;
	}

	public SaveAsAction getSaveAsAction() {
		return saveAsAction;
	}

	public void setSaveAsAction(SaveAsAction saveAsAction) {
		this.saveAsAction = saveAsAction;
	}

	public DeleteAction getDeleteAction() {
		return deleteAction;
	}

	public void setDeleteAction(DeleteAction deleteAction) {
		this.deleteAction = deleteAction;
	}

	public NewNodeAction getNewNodeAction() {
		return newNodeAction;
	}

	public void setNewNodeAction(NewNodeAction newNodeAction) {
		this.newNodeAction = newNodeAction;
	}

	public PHandCursorAction getpHandCursorAction() {
		return pHandCursorAction;
	}

	public void setpHandCursorAction(PHandCursorAction pHandCursorAction) {
		this.pHandCursorAction = pHandCursorAction;
	}

	public PCircleAction getpCircleAction() {
		return pCircleAction;
	}

	public void setpCircleAction(PCircleAction pCircleAction) {
		this.pCircleAction = pCircleAction;
	}

	public PTriangleAction getpTriangleAction() {
		return pTriangleAction;
	}

	public void setpTriangleAction(PTriangleAction pTriangleAction) {
		this.pTriangleAction = pTriangleAction;
	}

	public PRectangleAction getpRectangleAction() {
		return pRectangleAction;
	}

	public void setpRectangleAction(PRectangleAction pRectangleAction) {
		this.pRectangleAction = pRectangleAction;
	}




}
