package view;

import model.Page;
import model.elements.DocumentDevice;
import model.elements.RectangleElement;
import observer.IListener;
import painters.ElementPainter;

import javax.swing.*;

import app.MainFrame;
import event.UpdateEvent;
import event.UpdateListener;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class PageView extends JInternalFrame implements IListener,UpdateListener{
	
	private Page page;
	
	private DocumentView parent;
	
	private JPanel framework;
	
	public PageView(Page page) {
		
		this.page = page;
		this.page.addObserver(this);
		//page.setPageView(this);
		
		
		setTitle(page.toString());
		
		
		
	
		
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.YELLOW);
		
		
		
		setIconifiable(true);
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setVisible(true);
		
		
		framework = new Framework();
		framework.setCursor(new Cursor(Cursor.HAND_CURSOR));
		framework.setBackground(Color.WHITE);
		add(framework, BorderLayout.CENTER);
		framework.addMouseListener(new MouseController());

	}

	

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public DocumentView getParent() {
		return parent;
	}

	public void setParent(DocumentView parent) {
		this.parent = parent;
	}
	
	public void close() {
		this.setVisible(false);
		MainFrame.getInstance().revalidate();
		MainFrame.getInstance().repaint();
	}

	



	@Override
	public void update(Object event) {
		
		this.close();
		
	}
	
	
	private class MouseController extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			
			if(e.getButton() == MouseEvent.BUTTON1) {
				
				Point position = e.getPoint();
				GeneralPath gp = new GeneralPath();
				
				Paint fill = new Color(255,255,255);
				
				RectangleElement rectangle = new RectangleElement(fill,new BasicStroke(2f), new Dimension(200,200),position);
				
				rectangle.setName("Rectangle" + page.getModel().getElementCount());
				page.getModel().addDocumentElements(rectangle);
			}
			
		}
	
	}
	
	
	
	
	
	private class Framework extends JPanel{
		
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
			
			Iterator<DocumentDevice> it = page.getModel().getDeviceIterator();
			
			while(it.hasNext()) {
				
				DocumentDevice device = (DocumentDevice) it.next();
				
				ElementPainter painter = device.getPainter();
				
				painter.paint(g2, device);
			}
			
			System.out.println("Izvrsena paint component");
		}
		
		
		
	}


	@Override
	public void updatePerformed(UpdateEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	
	
	
	
	
	
	
	
}
