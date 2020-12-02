package dev.codenmore.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage trunks1, trunks2, trunks3, flyTrunks;
	public final static int w = 24;
	public final static int h = 32;
	
	
	public static void init()
	{
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Trunks.png")); //918*668
		trunks1 = sheet.crop(0, 0, w, h);
		trunks2 = sheet.crop(w*2, h*3, w, h);
		trunks3 = sheet.crop(w*3, h*3, w, h);
		flyTrunks = sheet.crop(w*4, h*4, w, h);
	}
}
