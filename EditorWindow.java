package texteditor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class EditorWindow extends JFrame {
    private JTextArea textArea;
    private EditorController controller;

    public EditorWindow() {
        
        textArea = new JTextArea();
        controller = new EditorController(this); 

        initMenu(); 
        initLayout(); 

        
        this.setTitle(AppConstants.APP_TITLE);
        this.setBounds(0, 0, AppConstants.WINDOW_WIDTH, AppConstants.WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        
       
        JMenu fileMenu = new JMenu(AppConstants.MENU_FILE);
        JMenu editMenu = new JMenu(AppConstants.MENU_EDIT);


        addMenuItem(fileMenu, AppConstants.ITEM_NEW);
        addMenuItem(fileMenu, AppConstants.ITEM_OPEN);
        addMenuItem(fileMenu, AppConstants.ITEM_SAVE);
        
        addMenuItem(editMenu, AppConstants.ITEM_CUT);
        addMenuItem(editMenu, AppConstants.ITEM_COPY);
        addMenuItem(editMenu, AppConstants.ITEM_PASTE);
        addMenuItem(editMenu, AppConstants.ITEM_SELECT_ALL);
        addMenuItem(editMenu, AppConstants.ITEM_CLOSE);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        this.setJMenuBar(menuBar);
    }

    private void addMenuItem(JMenu menu, String label) {
        JMenuItem item = new JMenuItem(label);
        item.addActionListener(controller); 
        menu.add(item);
    }

    private void initLayout() {
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new BorderLayout(0, 0));
        panel.add(textArea, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(textArea, 
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        this.add(scrollPane);
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
