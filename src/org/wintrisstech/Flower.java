/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wintrisstech;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author workshopjan23
 */
public class Flower
{
    private Image flower;
    public Flower() throws IOException
    {
        flower = ImageIO.read(getClass().getResource("Gerald_G_Tulips.png"));
    }
    public void paint(Graphics g)
    {
        g.drawImage(flower, 500, 500, 100, 136, null);
    }
}
