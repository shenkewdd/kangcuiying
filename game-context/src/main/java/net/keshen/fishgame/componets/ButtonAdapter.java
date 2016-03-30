package net.keshen.fishgame.componets;

import net.keshen.base.OnClickListener;
import net.keshen.base.basecomponet.Button;
import net.keshen.base.basecomponet.Componet;
import net.keshen.base.graphics.Bitmap;
import net.keshen.base.graphics.Matrix;

/**
 * @author shenke
 * @date 2016-3-8 上午8:39:52
 */
public class ButtonAdapter extends Componet implements Button{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1193460655074138315L;

	private boolean enable = true;
	
	private OnClickListener onClickListener;
	
	public ButtonAdapter(){
		
	}
	
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

	public boolean isEnable() {
		return enable;
	}
	
	public void onClick() {
		if(onClickListener!=null){
			onClickListener.onClick();
		}
	}

	public void addOnClickListener(OnClickListener listener) {
		if(listener instanceof OnClickListener){
			this.onClickListener = listener;
		}
	}
	
}
