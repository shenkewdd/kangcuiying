package net.keshen.fishgame.model;

import java.util.List;

import net.keshen.thread.FishRunThread;
/**              .
 * 				 .
 *               .
 *               .
 *               .
 *               .   
 *               .    
 * . . . . . . . . . . . . . . . . . 
 *               .
 *               .
 *               .
 *               .
 *               .
 *               .
 * 领头鱼
 * @author shenke
 * @date 2016-3-8 下午2:31:19
 */
public class HeadFish{
	
	private boolean isNew;		//是否是新生成的鱼
	private double fishX;			//鱼的x坐标
	private double fishY;			//y坐标
	private double lastX;				
	private double lastY;			
	
	private int[] fishOutlinePoint;	//鱼的外接矩阵的主要点的x、y坐标
	private List<Fish> shoal;		//鱼群
	
	private double currentRotate;	//当前旋转的角度
	private int rotateDirection;	//旋转的方向
	
	private FishRunThread runThread;//鱼游动线程
	private Fish fish;				//当前鱼也应该属于鱼群
	
	
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public double getFishX() {
		return fishX;
	}
	public void setFishX(double fishX) {
		this.lastX = this.fishX;
		this.fishX = fishX;
	}
	public double getFishY() {
		return fishY;
	}
	public void setFishY(double fishY) {
		this.lastY = this.fishY;
		this.fishY = fishY;
	}
	public double getLastX() {
		return lastX;
	}
	public void setLastX(double lastX) {
		this.lastX = lastX;
	}
	public double getLastY() {
		return lastY;
	}
	public void setLastY(int lastY) {
		this.lastY = lastY;
	}
	public int[] getFishOutlinePoint() {
		return fishOutlinePoint;
	}
	public void setFishOutlinePoint(int[] fishOutlinePoint) {
		this.fishOutlinePoint = fishOutlinePoint;
	}
	public List<Fish> getShoal() {
		return shoal;
	}
	public void setShoal(List<Fish> shoal) {
		this.shoal = shoal;
	}
	public double getCurrentRotate() {
		return currentRotate;
	}
	public void setCurrentRotate(int currentRotate) {
		this.currentRotate = currentRotate;
	}
	public int getRotateDirection() {
		return rotateDirection;
	}
	public void setRotateDirection(int rotateDirection) {
		this.rotateDirection = rotateDirection;
	}
	public FishRunThread getRunThread() {
		return runThread;
	}
	public void setRunThread(FishRunThread runThread) {
		this.runThread = runThread;
	}
	public Fish getFish() {
		return fish;
	}
	public void setFish(Fish fish) {
		this.fish = fish;
	}
	
}
