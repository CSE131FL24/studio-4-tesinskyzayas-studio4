package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
		public static void main(String[] args) throws FileNotFoundException {
			JFileChooser chooser = new JFileChooser("resources");
			chooser.showOpenDialog(null);
			File f = new File(chooser.getSelectedFile().getPath());
			Scanner in = new Scanner(f); //making Scanner with a File
		
			//Colors
			Color pink = new Color(200, 109, 182);
			Color red = new Color (225, 0, 0);
			Color purple = new Color(150, 0, 146);
			
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.filledRectangle(.7, .7, .7, .7);
			
			StdDraw.setPenColor(pink);
			StdDraw.filledRectangle(.5, .5, .4, .3);
			
			StdDraw.setPenColor(red);
			StdDraw.filledRectangle(0.5, 0.5, .3, .2);
			
			StdDraw.setPenColor(pink);
			StdDraw.filledCircle(0.5, 0.5, 0.1);
			
			StdDraw.setPenColor(red);
			StdDraw.filledCircle(0.5, 0.5, 0.075);
			
			StdDraw.setPenColor(purple);
			StdDraw.filledCircle(0.5, 0.5, 0.05);
	}
}
//rectangle 255 109 182 true 0.5 0.5 0.2 0.2
//ellipse 73 0 146 false 0.5 0.5 0.2 0.2