package net.keshen.fishgame.manager;

import net.keshen.fishgame.componets.Bottom;
import net.keshen.fishgame.componets.BottomGold;
import net.keshen.fishgame.componets.BottomTime;
import net.keshen.util.ImageUtils;

/**
 * 组件管理器
 * @author shenke
 * @date 2016-3-9 下午1:39:08
 */
public class ComponetsManager {

	private static ComponetsManager manager;
	private CannoManager cannoManager;
	
	private Bottom bottom;
	private BottomGold bottomGold;
	private BottomTime bottomTime;
	
	public static ComponetsManager getComponetsManager(){
		if(manager==null){
			manager = new ComponetsManager();
		}
		return manager;
	}
	
	private ComponetsManager(){
		init();
	}
	
	//初始化所有组件
	private void init(){
		//初始化底座
		bottom = new Bottom();
		bottom.setDrawableName("bottom");
		bottom.setBg(ImageUtils.getImage(bottom.getDrawableName()));
		//初始化金币框
		bottomGold = new BottomGold();
		bottomGold.setDrawableName("bottom_gold");
		bottomGold.setBg(ImageUtils.getImage(bottomGold.getDrawableName()));
		//初始化计时器
		bottomTime = new BottomTime();
		bottomTime.setDrawableName("bottom_time");
		bottomTime.setBg(ImageUtils.getImage(bottomTime.getDrawableName()));
		//
		
	}
	
	/**
	 * 获取大炮底座
	 * @return
	 */
	public Bottom getBottom(){
		return this.bottom;
	}
	
	/**
	 * 获取金币底座
	 * @return
	 */
	public BottomGold getBottomGold(){
		return this.bottomGold;
	}
	
	/**
	 * 获取计时器底座
	 * @return
	 */
	public BottomTime getBottomTime(){
		return this.bottomTime;
	}
}
