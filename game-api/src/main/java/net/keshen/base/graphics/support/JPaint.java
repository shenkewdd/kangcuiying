package net.keshen.base.graphics.support;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import net.keshen.base.basecomponet.GameConstant;
import net.keshen.base.graphics.Paint;
import net.keshen.logger.Logger;
import net.keshen.logger.LoggerManager;

/**
 * @author shenke
 * @date 2016-3-29 下午1:36:19
 */
public class JPaint implements Paint{

	private static final Logger logger = LoggerManager.getLogger(JPaint.class);
	
	Graphics2D graphics;
	
	public JPaint(BufferedImage canvas) {
		this.graphics = (Graphics2D) canvas.getGraphics();
	}
	
	public Graphics2D getGraphics(){
		return this.graphics;
	}
	
	public void setTypeface(Object obj) {
		if(obj instanceof Font){
			graphics.setFont((Font)obj);
			logger.debug("字体设置成功:"+((Font)obj).getFontName());
		}
	}

	public void setAntiAlias(boolean tf) {
		if(tf){
			RenderingHints renderQuality = graphics.getRenderingHints();
			if(renderQuality==null){
				renderQuality = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				graphics.setRenderingHints(renderQuality);
			}
			else{
				renderQuality.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
				graphics.setRenderingHints(renderQuality);
			}
			//侧重画质
			if(GameConstant.isQuality()){
				//TODO
			}
			renderQuality.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			renderQuality.put(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
			renderQuality.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			renderQuality.put(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		}
	}

	public void setFilterBitmap(boolean tf) {
		
	}

	public void setDither(boolean tf) {
		if(tf){
			RenderingHints renderQuality = graphics.getRenderingHints();
			if(renderQuality==null){
				renderQuality = new RenderingHints(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
				graphics.setRenderingHints(renderQuality);
			}
			else{
				renderQuality.put(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
				graphics.setRenderingHints(renderQuality);
			}
			
		}
		
	}

	public void setTextSize(int size) {
		graphics.setFont(graphics.getFont().deriveFont(size));
	}

	public void setColor(int rgb) {
		graphics.setColor(new Color(rgb));
	}

	public void setColor(Color color) {
		graphics.setColor(color);
	}
}
