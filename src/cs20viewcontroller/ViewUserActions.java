/*
 * The controller classes (like the ViewUserActions class) provides actions
 * that the user can trigger through the view classes.  Those actions are 
 * written in this class as private inner classes (i.e. classes 
 * declared inside another class).
 *
 * You can use all the public instance variables you defined in AllModelsForView, 
 * DrawnView, and ViewOutputs as though they were part of this class! This is 
 * due to the magic of subclassing (i.e. using the extends keyword).
 */
package cs20viewcontroller;

import cs20models.UrlShorcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;

/**
 * ViewUserActions is a class that contains actions users can trigger.
 *
 * User actions are written as private inner classes that implements the
 * ActionListener interface. These actions must be "wired" into the DrawnView in
 * the ViewUserActions constructor, or else they won't be triggered by the user.
 *
 * Actions that the user can trigger are meant to manipulate some model classes
 * by sending messages to them to tell them to update their data members.
 *
 * Actions that the user can trigger can also be used to manipulate the GUI by
 * sending messages to the view classes (e.g. the DrawnView class) to tell them
 * to update themselves (e.g. to redraw themselves on the screen).
 *
 * @author cheng
 */
public class ViewUserActions extends ViewOutputs {

    /*
     * Step 1 of 2 for writing user actions.
     * -------------------------------------
     *
     * User actions are written as private inner classes that implement
     * ActionListener, and override the actionPerformed method.
     *
     * Use the following as a template for writting more user actions.
     */
    private class OpenFileAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String pathToFile = showOpenDialog();
                if (pathToFile == null) {
                    return;
                }

                //"C:\Users\Harde\Downloads"
                //thePowList.saveToFile(pathToFile);
                thePowList.openFromFile(pathToFile);

            } catch (IOException ex) {
                Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SaveToFileAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String pathToFile = showSaveDialog();
                if (pathToFile == null) {
                    return;
                }

                //"C:\Users\Harde\Downloads"
                thePowList.saveToFile(pathToFile);
            } catch (IOException ex) {
                Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class ClearPowDisplayAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            clearPowDisplay();
        }
    }

    private class GetPowInfoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object powObj = powList1.getSelectedValue();
            UrlShorcut aPow = (UrlShorcut) powObj;
            String serial = aPow.getSerial();

            showPowInfo(serial);

        }
    }

    private class SetPowInfoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String serialStr = serialField.getText();
            String rankStr = RankField.getText();
            if (serialStr.equals("")) {
                return;
            }
            boolean setTrue = true;
            if (serialStr.equalsIgnoreCase("a")) {
            aPowPerson.setaTF(setTrue);
            aPowPerson.setaStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("b")) {
            aPowPerson.setbTF(setTrue);
            aPowPerson.setbStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("c")) {
            aPowPerson.setcTF(setTrue);
            aPowPerson.setcStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("d")) {
            aPowPerson.setdTF(setTrue);
            aPowPerson.setdStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("e")) {
            aPowPerson.seteTF(setTrue);
            aPowPerson.seteStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("f")) {
            aPowPerson.setfTF(setTrue);
            aPowPerson.setfStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("g")) {
            aPowPerson.setgTF(setTrue);
            aPowPerson.setgStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("h")) {
            aPowPerson.sethTF(setTrue);
            aPowPerson.sethStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("i")) {
            aPowPerson.setiTF(setTrue);
            aPowPerson.setiStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("j")) {
            aPowPerson.setjTF(setTrue);
            aPowPerson.setjStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("k")) {
            aPowPerson.setkTF(setTrue);
            aPowPerson.setkStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("l")) {
            aPowPerson.setlTF(setTrue);
            aPowPerson.setlStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("m")) {
            aPowPerson.setmTF(setTrue);
            aPowPerson.setmStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("n")) {
            aPowPerson.setnTF(setTrue);
            aPowPerson.setnStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("o")) {
            aPowPerson.setoTF(setTrue);
            aPowPerson.setoStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("p")) {
            aPowPerson.setpTF(setTrue);
            aPowPerson.setpStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("q")) {
            aPowPerson.setqTF(setTrue);
            aPowPerson.setqStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("r")) {
            aPowPerson.setrTF(setTrue);
            aPowPerson.setrStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("s")) {
            aPowPerson.setsTF(setTrue);
            aPowPerson.setsStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("t")) {
            aPowPerson.settTF(setTrue);
            aPowPerson.settStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("u")) {
            aPowPerson.setuTF(setTrue);
            aPowPerson.setuStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("v")) {
            aPowPerson.setvTF(setTrue);
            aPowPerson.setvStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("w")) {
            aPowPerson.setwTF(setTrue);
            aPowPerson.setwStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("x")) {
            aPowPerson.setxTF(setTrue);
            aPowPerson.setxStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("y")) {
            aPowPerson.setyTF(setTrue);
            aPowPerson.setyStr(rankStr);
            } else if (serialStr.equalsIgnoreCase("z")) {
            aPowPerson.setzTF(setTrue);
            aPowPerson.setzStr(rankStr);
            } else if ("1".equals(serialStr)) {
            aPowPerson.setOneTF(setTrue);
            aPowPerson.setOneStr(rankStr);
            }else if ("2".equals(serialStr)) {
            aPowPerson.setTwoTF(setTrue);
            aPowPerson.setTwoStr(rankStr);
            } else if ("3".equals(serialStr)) {
            aPowPerson.setThreeTF(setTrue);
            aPowPerson.setThreeStr(rankStr);
            } else if ("4".equals(serialStr)) {
            aPowPerson.setFourTF(setTrue);
            aPowPerson.setFourStr(rankStr);
            } else if ("5".equals(serialStr)) {
            aPowPerson.setFiveTF(setTrue);
            aPowPerson.setFiveStr(rankStr);
            } else if ("6".equals(serialStr)) {
            aPowPerson.setSixTF(setTrue);
            aPowPerson.setSixStr(rankStr);
            } else if ("7".equals(serialStr)) {
            aPowPerson.setSevenTF(setTrue);
            aPowPerson.setSevenStr(rankStr);
            } else if ("8".equals(serialStr)) {
            aPowPerson.setEightTF(setTrue);
            aPowPerson.setEightStr(rankStr);
            } else if ("9".equals(serialStr)) {
            aPowPerson.setNineTF(setTrue);
            aPowPerson.setNineStr(rankStr);
            } else if ("0".equals(serialStr)) {
            aPowPerson.setZeroTF(setTrue);
            aPowPerson.setZeroStr(rankStr);
            }
            
            String serial = (serialStr);
            UrlShorcut aPowPerson = thePowList.getPow(serial);

            if (aPowPerson != null) {

                String name = nameField.getText();
                aPowPerson.setName(name);

                String rank = RankField.getText();
                aPowPerson.setRank(rank);

                serialStr = serialField.getText();
                serial = (serialStr);
                aPowPerson.setSerial(serial);

//                if (maleChoiceBtn.isSelected()) {
//                    gender = "male";
//                } else if (femaleChoiceBtn.isSelected()) {
//                    gender = "female";
//                }
            } else {
                UrlShorcut newPerson = new UrlShorcut();
                newPerson.setName(nameField.getText());
                newPerson.setRank(RankField.getText());
                newPerson.setSerial(serial);

                thePowList.addPow(newPerson);
            }

            
            updatePowListDisplay();
        }
    }
    
        private class UpdateUrlPowDisplayAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            updatePowListDisplay();
        }
    }

//    private class CopyUserText implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            String userText = nameField.getText(); // get text from view
//            aPowPerson.setThought(userText); // update model
//            updateThoughtDisplayed(); // tell view to update
//        }
//    }

    /*
     * ViewUserActions constructor used for wiring user actions to GUI elements
     */
    public ViewUserActions() {
        /*
         * Step 2 of 2 for writing user actions.
         * -------------------------------------
         *
         * Once a private inner class has been written for a user action, you
         * can wire it to a GUI element (i.e. one of GUI elements you drew in
         * the DrawnView class and which you gave a memorable public variable
         * name!).
         *
         * Use the following as a template for wiring more user actions.
         */
//        copyTextButton.addActionListener(new CopyUserText());
        this.getPowButton.addActionListener(new GetPowInfoAction());
        this.setPowInfoButton.addActionListener(new SetPowInfoAction());
        this.clearButton.addActionListener(new ClearPowDisplayAction());
        this.saveButton.addActionListener(new SaveToFileAction());
        this.openButton.addActionListener(new OpenFileAction());
        this.jButton2.addActionListener(new UpdateUrlPowDisplayAction());
    }
}
