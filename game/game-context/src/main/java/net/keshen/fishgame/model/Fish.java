package net.keshen.fishgame.model;

import net.keshen.base.drawable.support.DrawableAdapter;
import net.keshen.base.graphics.Bitmap;
import net.keshen.base.graphics.Matrix;

/**
 * @author shenke
 * @date 2016-3-8 上午9:18:52
 */
public class Fish extends DrawableAdapter implements Movement{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5803704233691237605L;

	private Bitmap[] actBitmap;			//鱼游动的图片
	private Bitmap[] catchActBitmap;	//鱼被捕捉时的动作图片
	private int[] fishOutRectPoint ;	//图片外接矩形的四个点
	
	private FishInfo info;				//鱼的游动速度、价值、捕捉概率等
	private HeadFish headFish;			//领头鱼
	//TODO								//鱼游动的线程
	
	private boolean canRun;				//是否可以游动
	private boolean isAlive;			//是否存活
	private boolean outScreen;			//是否超出屏幕
	private int currentActId;			//当前游动动作Id
	private int catchCurrentActId;		//被捕捉时动作图片Id
	private int distHeadFishX;			//距离领头鱼的X方向上的偏移量
	private int distheadFishY;			//
	
	public Fish getFish(){
		return new Fish();
	}
	
	public Fish() {
		
	}

	@Override
	public Matrix getPicMatrix() {
		return getMatrix();
	}

	@Override
	public Bitmap getCurrentPic() {
		if(isAlive){
			return actBitmap[currentActId];
		}
		else{
			return catchActBitmap[catchCurrentActId];
		}
	}

	@Override
	public int getPicWidth() {
		return getCurrentPic().getWidth();
	}

	@Override
	public int getPicHeight() {
		return getCurrentPic().getHeight();
	}

	@Override
	public String getDrawableName() {
		return super.name;
	}
	
	/**
	 * 设置当前动作图片Id
	 */
	public void setCurrentActBitmapId(int currentActId) {
		if(isAlive){
			this.currentActId = currentActId;
		}else{
			this.catchCurrentActId = currentActId;
		}
	}

	public int getActBitmapLength() {
		return actBitmap.length;
	}

	public void setActBitmap(Bitmap[] actBitmap) {
		this.actBitmap = actBitmap;
	}

	public int getCatchActBitmapLength() {
		return catchActBitmap.length;
	}

	public void setCatchActBitmap(Bitmap[] catchActBitmap) {
		this.catchActBitmap = catchActBitmap;
	}

	public int[] getFishOutRectPoint() {
		return fishOutRectPoint;
	}

	public void setFishOutRectPoint(int[] fishOutRectPoint) {
		this.fishOutRectPoint = fishOutRectPoint;
	}

	public FishInfo getInfo() {
		return info;
	}

	public void setInfo(FishInfo info) {
		this.info = info;
	}

	public HeadFish getHeadFish() {
		return headFish;
	}

	public void setHeadFish(HeadFish headFish) {
		this.headFish = headFish;
	}

	public boolean isCanRun() {
		return canRun;
	}

	public void setCanRun(boolean canRun) {
		this.canRun = canRun;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isOutScreen() {
		return outScreen;
	}

	public void setOutScreen(boolean outScreen) {
		this.outScreen = outScreen;
	}
	
	public int getDistHeadFishX() {
		return distHeadFishX;
	}

	public void setDistHeadFishX(int distHeadFishX) {
		this.distHeadFishX = distHeadFishX;
	}

	public int getDistheadFishY() {
		return distheadFishY;
	}

	public void setDistheadFishY(int distheadFishY) {
		this.distheadFishY = distheadFishY;
	}
}
