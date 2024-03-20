package com.ramjava;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUIMain {

	public static void main(String[] args) {
		// JFrame = a GUI window to add components to
		
		var frame = new JFrame(); // creates a frame
		frame.setTitle("JFrame title goes here"); // set title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(false); // prevent frame from being resize
		frame.setSize(420, 420); // set the x-dimension and y-dimension of frame
		frame.setVisible(true); // make frame visible
		
		var image = new ImageIcon("drywalleye.jpg"); // create an ImageIcon
		frame.setIconImage(image.getImage()); // change icon of frame
		
	}
}
