/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wintrisstech;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author workshopjan23
 */
public class Bees 
{
    private int beex = 400;
    private int beey = 500;
    private Image bee;
    private Random r = new Random();
    public Bees() throws IOException
    {
        bee = ImageIO.read(getClass().getResource("bee_right.png"));
        beex = 1 + r.nextInt(1024);
        beey =  r.nextInt(751) - 50;
    }
    public void paint(Graphics g)
    {
        g.drawImage(bee, beex, beey, 20, 20, null);
    }
}
