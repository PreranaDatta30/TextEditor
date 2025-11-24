package texteditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class EditorController implements ActionListener {

    private EditorWindow view;
    private FileService fileService;

    public EditorController(EditorWindow view) {
        this.view = view;
        this.fileService = new FileService();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case AppConstants.ITEM_CUT:
                view.getTextArea().cut();
                break;
            case AppConstants.ITEM_COPY:
                view.getTextArea().copy();
                break;
            case AppConstants.ITEM_PASTE:
                view.getTextArea().paste();
                break;
            case AppConstants.ITEM_SELECT_ALL:
                view.getTextArea().selectAll();
                break;
            case AppConstants.ITEM_CLOSE:
                System.exit(0);
                break;
            case AppConstants.ITEM_NEW:
                new EditorWindow(); // Opens a new instance
                break;
            case AppConstants.ITEM_OPEN:
                openFileOperation();
                break;
            case AppConstants.ITEM_SAVE:
                saveFileOperation();
                break;
        }
    }

    private void openFileOperation() {
        JFileChooser fileChooser = new JFileChooser("C:");
        int option = fileChooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                String content = fileService.readFile(file);
                view.getTextArea().setText(content);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
            }
        }
    }

   private void saveFileOperation() {
        
        JFileChooser fileChooser = new JFileChooser("."); 
        
        int option = fileChooser.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            

            if (!path.toLowerCase().endsWith(".txt")) {
                selectedFile = new File(path + ".txt");
            }

            try {
                fileService.saveFile(selectedFile, view.getTextArea().getText());
                
                JOptionPane.showMessageDialog(null, "File Saved Successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error saving file: " + ex.getMessage());
            }
        }
    }
}
