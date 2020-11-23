package dev.codenmore.tilegame.display;

import javax.swing.JFrame;

public class Display {
	private JFrame frame;
	
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
	}

}
