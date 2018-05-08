/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageBuffer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.*;

/**
 *
 * @author Bengre
 */
public class PixelFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedImage img = null;
        File f = null;
        
        f= new File("C:\\Users\\thush\\Documents\\SecondSem\\Algo\\Boston.jpeg");
        img = ImageIO.read(f);
        
        int width = img.getWidth(), height = img.getHeight();
        System.out.println("Width = " + width + ", Height = " + height);
        
        int bMask = (int) Math.pow(2, 8) - 1;
        int gMask = bMask << 8;
        int rMask = gMask << 8;
        
        List<Double> intensityList = new ArrayList<Double>();
        
        for (int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                int argb = img.getRGB(x, y);
                // System.out.println("ARGB Value:");
                // System.out.println(String.format("%32s", Integer.toBinaryString(argb)));
                // System.out.println("Masks:");
                // System.out.println(String.format("%32s", Integer.toBinaryString(bMask)));
                // System.out.println(String.format("%32s", Integer.toBinaryString(gMask)));
                // System.out.println(String.format("%32s", Integer.toBinaryString(rMask)));
                int bValue = argb & bMask;
                int gValue = (argb & gMask) >> 8;
                int rValue = ((argb & rMask) >> 8) >> 8;
                // System.out.println("R, G, B values:");
                // System.out.println(String.format("%32s", Integer.toBinaryString(bValue)));
                // System.out.println(String.format("%32s", Integer.toBinaryString(gValue)));
                // System.out.println(String.format("%32s", Integer.toBinaryString(rValue)));
                double intensity = 0.2989 * rValue + 0.5780 * gValue + 0.1440 * bValue;
                // System.out.println("Intensity = " + intensity);
                intensityList.add(intensity);
            }
        }
        InsertionSort iS= new InsertionSort();
        iS.sort(intensityList);        
        SelectionSort ss= new SelectionSort();
        ss.sort(intensityList);
        MergeSort ms= new MergeSort();
        ms.sort(intensityList,0,intensityList.size()-1);
    }
    
}