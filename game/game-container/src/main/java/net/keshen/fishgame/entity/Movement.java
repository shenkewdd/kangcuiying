package net.keshen.fishgame.entity;

import java.io.Serializable;

/**
 * 所有移动物体的抽象类
 * @author shenke
 *
 */
public interface Movement extends Serializable{

	/**
	 * 
	 */
	static final long serialVersionUID = -935145279645105774L;
	/**运动方向 上*/
	public static final String MOVE_DIRECTION_UP = "U";
	/**运动方向 下*/
	public static final String MOVE_DIRECTION_DOWN = "D";
	/**运动方向 左*/
	public static final String MOVE_DIRECTION_LEFT = "L" ;
	/**运动方向 右*/
	public static final String MOVE_DIRECTION_RIGHT = "R" ;
	/**运动方向 右上*/
	public static final String MOVE_DIRECTION_RU = "RU";
	/**运动方向 左上*/
	public static final String MOVE_DIRECTION_LU = "LU";
	/**运动方向 右下*/
	public static final String MOVE_DIRECTION_RD = "RD";
	/**运动方向 左下*/
	public static final String MOVE_DIRECTION_LD = "LD";
	
	
}
