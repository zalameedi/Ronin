package dev.codenmore.tilegame.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet)
	{
		this.sheet = sheet;
	}
	
	public BufferedImage crop(int x, int y, int w, int h)
	{
		return this.sheet.getSubimage(x, y, w, h);
	}

}
