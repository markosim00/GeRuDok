package gui;

import javax.swing.BoxLayout;
import javax.swing.JToolBar;

import app.MainFrame;

public class Palette extends JToolBar{
	
	public Palette() {
		
		super(JToolBar.VERTICAL);
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		add(MainFrame.getInstance().getActionManager().getpHandCursorAction());
		addSeparator();
		add(MainFrame.getInstance().getActionManager().getpCircleAction());
		addSeparator();
		add(MainFrame.getInstance().getActionManager().getpRectangleAction());
		addSeparator();
		add(MainFrame.getInstance().getActionManager().getpTriangleAction());
		
		
	}
	
	

}
