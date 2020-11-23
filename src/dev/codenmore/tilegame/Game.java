package dev.codenmore.tilegame;

import dev.codenmore.tilegame.display.Display;

public class Game {
	private int height, width;
	
	public Game(String title, int width, int height)
	{
		this.height = height;
		this.width = width;
		
		Display myDisplay = new Display(height, width, title);
	}

}
