/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.gui;

import java.io.File;
/**
 *
 * @author deckard
 */
public class ImgFilter extends javax.swing.filechooser.FileFilter{

    @Override
    public boolean accept(File f) {
       if(f.isDirectory()){
           return true;
       } 
       String ext = f.getName();
       ext = ext.substring(ext.lastIndexOf("."));
       if(ext != null){
           if(ext.equals(".png") || ext.equals(".jpg") || ext.equals(".jpeg") || ext.equals(".tiff") ||
           ext.equals(".gif") || ext.equals(".tif")){
               return true;
           }
       }
       return false;
    }

    @Override
    public String getDescription() {
        return "File";
    }
    
}
