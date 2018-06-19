/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sebas.transpomex.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
    private BufferedImage img;

    public ImagePanel(String url){
        try {
            img = ImageIO.read(getClass().getClassLoader().getResource("default.jpg"));
        } catch (IOException e) {
            System.err.println("No se pudo cargar el archivo\nError:\n"+e);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(img, 0, 0,this.getSize().width,this.getSize().height, this);
    }
    
}
