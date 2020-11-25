package dev.codenmore.tilegame;

import dev.codenmore.tilegame.display.Display;

public class Game implements Runnable {
	private int height, width;
	private Thread thread;
	private String title;
	private boolean running;
	
	public Game(String title, int width, int height)
	{
		this.height = height;
		this.width = width;
		this.title = title;
		this.running = false;
	}
	
	public void init()
	{
		Display myDisplay = new Display(height, width, title);
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		
	}

	public void run() {
		// TODO Auto-generated method stub
		init();
		while(running)
			update();
			render();
			
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
			thread = new Thread(thread);
			thread.start();
	}
	
	public synchronized void stop() throws InterruptedException
	{
		if(running)
			running = false;
			thread.join();
	}
	

}
