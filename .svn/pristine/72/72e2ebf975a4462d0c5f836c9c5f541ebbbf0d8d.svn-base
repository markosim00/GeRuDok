package app;

import actions.ActionManager;
import gui.Menu;
import gui.Palette;
import gui.Toolbar;
import gui.WorkSpaceTree;
import model.WorkSpaceTreeModel;
import observer.MainFrameListener;

import javax.swing.*;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;


public class MainFrame extends JFrame {

    private static MainFrame instance = null;
    private JMenuBar menu;
    private Toolbar toolbar;
    private WorkSpaceTree tree;
    private WorkSpaceTreeModel treeModel;
    private JDesktopPane desktop;
    private ActionManager actionManager;
    private JLabel label;

    private JScrollPane scroll;
    private JSplitPane splitPane;
    
    private Palette palette;

    public static MainFrame getInstance() {
        if (instance == null) {
            instance = new MainFrame();
            instance.initElements();
            instance.addElements();
        }
        return instance;
    }

    private MainFrame() {

    }


    private void initElements() {

        actionManager = new ActionManager();
        tree = new WorkSpaceTree();
        treeModel = new WorkSpaceTreeModel();
        tree.setModel(treeModel);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        setTitle("GeRuDok");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new MainFrameListener());
        setPreferredSize(new Dimension(900, 900));
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);


        menu = new Menu();
        toolbar = new Toolbar();
        //tree = new WorkSpaceTree();

        desktop = new JDesktopPane();

        scroll = new JScrollPane(tree);
        scroll.setMinimumSize(new Dimension(200, 150));
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scroll, desktop);
        
        palette = new Palette();
        


        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*try {
            ImageIcon imageIcon = new ImageIcon(
                    Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("assets/ws.png"))
            );
            imageIcon.setImage(getScaledImage(imageIcon.getImage(), 15, 12));
            DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
            renderer.setLeafIcon(imageIcon);
            tree.setCellRenderer(renderer);
        } catch (NullPointerException e) {
            System.out.println("Image not found");
        }*/
    }


    private void addElements() {
        // adding to JFrame
        setJMenuBar(menu);
        add(toolbar, BorderLayout.NORTH);
        add(splitPane);
        add(palette,BorderLayout.EAST);
        pack();
    }

//    private Image getScaledImage(Image srcImg, int w, int h){
//        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2 = resizedImg.createGraphics();
//
//        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//        g2.drawImage(srcImg, 0, 0, w, h, null);
//        g2.dispose();
//
//        return resizedImg;
//    }


    public JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(JMenuBar menu) {
        this.menu = menu;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public WorkSpaceTree getTree() {
        return tree;
    }

    public void setTree(WorkSpaceTree tree) {
        this.tree = tree;
    }

    public WorkSpaceTreeModel getTreeModel() {
        return treeModel;
    }

    public void setTreeModel(WorkSpaceTreeModel treeModel) {
        this.treeModel = treeModel;
    }

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public void setDesktop(JDesktopPane desktop) {
        this.desktop = desktop;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public ActionManager getActionManager() {
        return actionManager;
    }

    public void setActionManager(ActionManager actionManager) {
        this.actionManager = actionManager;
    }


}
