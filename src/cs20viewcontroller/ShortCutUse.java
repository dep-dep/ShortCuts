/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs20viewcontroller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author 105243003
 */
public class ShortCutUse {
        public static void Shortcut(String ex) throws URISyntaxException{
        String url = ex;
        
        if (Desktop.isDesktopSupported()) {
        Desktop desktop = Desktop.getDesktop();
        
            try {
            desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
            e.printStackTrace(); 
            }
        } else {
        Runtime runtime = Runtime.getRuntime();
        try {
        runtime.exec("xdg-open " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        }
        }
}
