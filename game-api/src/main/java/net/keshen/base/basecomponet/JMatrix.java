package net.keshen.base.basecomponet;

import java.awt.geom.AffineTransform;

import net.keshen.base.graphics.Matrix;

/**
 * @author shenke
 * @date 2016年2月23日下午9:28:02
 * @version 1.0
 */
public class JMatrix implements Matrix{

	private AffineTransform transForm = new AffineTransform();
	
	
	public void setTranslate(int x, int y) {
		transForm.setToTranslation(x, y);
	}

	
	public void reset() {

	}

	
	public void setRotate(double x, double y, double angle) {
		transForm.setToRotation(angle, x, y);
	}

	
	public void setScale(double x, double y) {
		transForm.setToScale(x, y);
	}

	public AffineTransform getTransForm() {
		return transForm;
	}
	
	
}
