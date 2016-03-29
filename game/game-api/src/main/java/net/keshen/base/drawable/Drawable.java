package net.keshen.base.drawable;

import net.keshen.base.graphics.Bitmap;
import net.keshen.base.graphics.Canvas;
import net.keshen.base.graphics.Matrix;
import net.keshen.base.graphics.Paint;

/**
 * @author shenke
 * @date 2016年2月21日下午12:21:11
 * @version 1.0
 */
public interface Drawable {

	/**
	 * 获取矩阵
	 * @return
	 */
	public Matrix getPicMatrix();
	
	/**
	 * 获取当前的图片
	 * @return
	 */
	public Bitmap getCurrentPic();
	
	/**
	 * 获取图片的宽度
	 * @return
	 */
	public int getPicWidth();
	
	/**
	 * 获取图片的高度
	 * @return
	 */
	public int getPicHeight();
	
	/**
	 * 绘制图片的回调函数
	 * @param canvas
	 * @param paint
	 */
	public void onDraw(Canvas canvas,Paint paint);
	
	/**
	 * 获取当前组件的名字
	 * @return
	 */
	public String getDrawableName();
	
	/**
	 * 设置改组件或者运动物体的名字
	 * @param name
	 */
	public void setDrawableName(String name);
}
