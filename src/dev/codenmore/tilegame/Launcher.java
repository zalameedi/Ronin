package dev.codenmore.tilegame;

import dev.codenmore.tilegame.display.Display;

public class Launcher {
	public static void main(String[] args)
	{
		Game initGame = new Game("Ronin", 450, 400);
		initGame.start();
	}
}
