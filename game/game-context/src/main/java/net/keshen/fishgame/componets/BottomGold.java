package net.keshen.fishgame.componets;

import net.keshen.base.basecomponet.Componet;
import net.keshen.base.graphics.Bitmap;
import net.keshen.base.graphics.Matrix;

/**
 * 金币底座
 * @author shenke
 * @date 2016-3-9 下午1:42:44
 */
public class BottomGold extends Componet{

	
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
