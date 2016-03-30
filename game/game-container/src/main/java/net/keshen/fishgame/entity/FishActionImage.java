package net.keshen.fishgame.entity;

import net.keshen.base.graphics.Bitmap;

public class FishActionImage {

	private String name;
	private Bitmap fishActionImage;
	private int actionNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bitmap getFishActionImages() {
		return fishActionImage;
	}
	public void setFishActionImages(Bitmap fishActionImages) {
		this.fishActionImage = fishActionImages;
	}
	public int getActionNum() {
		return actionNum;
	}
	public void setActionNum(int actionNum) {
		this.actionNum = actionNum;
	}
}
