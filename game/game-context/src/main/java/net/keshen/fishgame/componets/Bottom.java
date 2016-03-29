package net.keshen.fishgame.componets;

import net.keshen.base.basecomponet.Componet;
import net.keshen.base.graphics.Bitmap;
import net.keshen.base.graphics.Matrix;

/**
 * 大炮底座
 * @author shenke
 * @date 2016-3-9 下午1:32:16
 */
public class Bottom extends Componet{
	
	
	public Matrix getPicMatrix() {
		return getMatrix();
	}

	
	public Bitmap getCurrentPic() {
		return super.bg;
	}

	
	public int getPicWidth() {
		return getCurrentPic().getWidth();
	}

	
	public int getPicHeight() {
		return getCurrentPic().getHeight();
	}

}
