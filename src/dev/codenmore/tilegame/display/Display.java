package dev.codenmore.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	private JFrame frame;
	private Canvas canvas;
	
	private int width, height;
	private String title;
	
	public Display()
	{
		this.width = 0;
		this.height = 0;
		this.title = "";
	}
	
	public Display(int height, int width, String title)
	{
		this.height = height;
		this.width = width;
		this.title = title;
		
		createDisplay();
	}
	
	public void createDisplay()
	{
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack();
	}

}
