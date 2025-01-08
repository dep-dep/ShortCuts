package cs20viewcontroller;

import cs20models.UrlShorcut;
import java.io.File;
import javax.swing.JFileChooser;

/**
 * Write methods in this class for displaying data in the DrawnView.
 *
 * You can use all the public instance variables you defined in AllModelsForView
 * and DrawnView as though they were part of this class! This is due to the
 * magic of subclassing (i.e. using the extends keyword).
 *
 * The methods for displaying data in the DrawnView are written as methods in
 * this class.
 *
 * Make sure to use these methods in the ViewUserActions class though, or else
 * they will be defined but never used!
 *
 * @author cheng
 */
public class ViewOutputs extends DrawnView {

//    public void updateThoughtDisplayed() {
//        outputTextField.setText(this.aPowPerson.getThought());
//    }
    
    
    public void updatePowListDisplay() {
        powList1.setListData(thePowList.toArray());
    }

    public void showPowInfo(String id) {
        //PowPerson selectedPow = powList.getSelectedValues();
        updatePowListDisplay();

        UrlShorcut aPowPerson = thePowList.getPow(id);

        if (aPowPerson != null) {
            String name = aPowPerson.getName();
            nameField.setText(name);

            String rank = aPowPerson.getRank();
            RankField.setText(rank);

            String serical = aPowPerson.getSerial();
            String sericalStr = (serical);
            serialField.setText(sericalStr);

            
        } else {
            nameField.setText("");
            RankField.setText("");
        }
    }

    public void clearPowDisplay() {
        updatePowListDisplay();

        nameField.setText("");
        RankField.setText("");
        serialField.setText("");
    }

    public String showSaveDialog() {
        JFileChooser jfc = new JFileChooser();
        int status = jfc.showSaveDialog(this);
        if (status == JFileChooser.APPROVE_OPTION){
            File theFile = jfc.getSelectedFile();
            String thePath = theFile.getAbsolutePath();
            return thePath;
        }
        
    return null;
    }
    
    public String showOpenDialog() {
            JFileChooser jfc = new JFileChooser();
        int status = jfc.showOpenDialog(this);    //showSaveDialog(this);
        if (status == JFileChooser.APPROVE_OPTION){
            File theFile = jfc.getSelectedFile();
            String thePath = theFile.getAbsolutePath();
            return thePath;
        }
        
    return null;
    
    
    }
}
