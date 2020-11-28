package dev.codenmore.tilegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import dev.codenmore.tilegame.display.Display;
import dev.codenmore.tilegame.gfx.ImageLoader;

public class Game implements Runnable {
	private int height, width;
	private Thread thread;
	private String title;
	private boolean running;
	private Graphics g;
	private BufferStrategy bs;
	private Display display;
	private BufferedImage testImage;
	
	public Game(String title, int width, int height)
	{
		this.height = height;
		this.width = width;
		this.title = title;
		this.running = false;
	}
	
	public void init()
	{
		display = new Display(height, width, title);
		testImage = ImageLoader.loadImage("/textures/testsamurai.png");
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null)
		{
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		//Start Drawing Portion
		g.clearRect(0, 0, width, height);
		
		g.drawImage(testImage, 20, 20, null);

		//End Drawing Portion
		
		
		bs.show();
		g.dispose();
	}

	public void run() {
		// TODO Auto-generated method stub
		init();
		while(running)
		{
			update();
			render();
		}
			
		try {
			stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void start()
	{
		if (!running)
			running = true;
			thread = new Thread(this);
			thread.start();
	}
	
	public synchronized void stop() throws InterruptedException
	{
		if(running)
			running = false;
			thread.join();
	}
	

}
