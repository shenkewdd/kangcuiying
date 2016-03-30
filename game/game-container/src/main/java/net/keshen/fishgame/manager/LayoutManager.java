package net.keshen.fishgame.manager;

/**
 * 布局管理器
 * @author shenke
 * @date 2016-3-9 下午1:27:56
 */
public class LayoutManager {

	private ComponetsManager componetsManager;
	
	//设置大炮底座位置
	public void setCannonBottomLayout(){
		componetsManager.getBottom().setLayout_x(layout_x);
		componetsManager.getBottom().setLayout_y(layout_y);
	}
	//设置大炮位置
	//设置计时器位置
	public void setBottomTimeLayout(){
		componetsManager.getBottomTime().setLayout_x(layout_x);
		componetsManager.getBottomTime().setLayout_y(layout_y);
	}
	//设置金币显示位置
	public void setBottomGoldLayout(){
		componetsManager.getBottomGold().setLayout_x(layout_x);
		componetsManager.getBottomGold().setLayout_y(layout_y);
	}
	
	//设置FPS、当前时间等位置
}
