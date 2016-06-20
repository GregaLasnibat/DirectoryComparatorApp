package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    protected TextArea textArea;
    private String selectedFile1;
    private String selectedFile2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void buttonOneClicked(ActionEvent event) throws FileNotFoundException {
//        System.out.println("Selecting path 1...");
        textArea.appendText("Selecting path 1...\n");
//        SWING CODE:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Path 1");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
//            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
//            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
            textArea.appendText("getCurrentDirectory(): " + chooser.getCurrentDirectory() + "\n");
            textArea.appendText("getSelectedFile() : " + chooser.getSelectedFile() + "\n");
            selectedFile1 = chooser.getSelectedFile().toString();
        } else {
//            System.out.println("No Selection ");
            textArea.appendText("No selection\n");
        }
    }


    public void buttonTwoClicked(ActionEvent event) {
//        System.out.println("Selecting path 2...");
        textArea.appendText("Selecting path 2...\n");
//        SWING CODE:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Path 2");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
//            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
//            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
            textArea.appendText("getCurrentDirectory(): " + chooser.getCurrentDirectory() + "\n");
            textArea.appendText("getSelectedFile() : " + chooser.getSelectedFile() + "\n");
            selectedFile2 = chooser.getSelectedFile().toString();
        } else {
//            System.out.println("No Selection ");
            textArea.appendText("No selection\n");
        }
    }


    public void buttonRunClicked(ActionEvent event) throws FileNotFoundException {
//        System.out.println("Running");
        textArea.appendText("Running...\n");
//        DirectoryComparatorMethods.compareTwoFolders(selectedFile1, selectedFile2);
        textArea.appendText(DirectoryComparatorMethods.compareTwoFolders(selectedFile1, selectedFile2));

    }

}
