package net.keshen.fishgame.manager;

import net.keshen.fishgame.componets.Cannon;
import net.keshen.logger.Logger;
import net.keshen.logger.LoggerManager;


/**
 * 大炮管理器
 * @author shenke
 * @date 2016-3-7 下午4:13:32
 */
public class CannoManager {

	private Logger logger = LoggerManager.getLogger(getClass());
	
	private Cannon cannon;
	private ImageManager manager = ImageManager.getImageManager();
	
	public CannoManager(){
		
	}
	
	//初始化
	public void init(){
		logger.log(logger.getLevel(), "初始化大炮管理器。。。");
		initCannon();
		initBullet();
		
		
		logger.log(logger.getLevel(), "初始化大炮管理器完毕。。。");
	}
	
	private void initCannon(){
		manager.getBitmapsByImageConfig("cannon/fire");
		//cannon = new Cannon(cannoImage);
	}
	private void initBullet(){
		
	}
}
