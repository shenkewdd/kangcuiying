package net.keshen.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

import net.keshen.base.graphics.Bitmap;

/**
 * 图片工具类
 * @author shenke
 *
 */
public final class ImageUtils {

	public static final String BG_PATH = "bg/";
	
	public static final String TEST_PATH = "testimage/";
	/**
	 * 旋转图片，源图片本身并不会旋转
	 * @param image 源图片
	 * @param angle 旋转的角度
	 * @return 旋转之后的图片(新的)
	 */
	public static final BufferedImage rotateImage(BufferedImage image,double angle){
		int w = image.getWidth();
		int h = image.getHeight();
		BufferedImage bImage = new BufferedImage(w, h,BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2d = bImage.createGraphics();
		g2d.rotate(angle,w/2,h/2);
		g2d.drawImage(image,0, 0, null);
		g2d.dispose();

		return bImage;
	}
	
	public static final BufferedImage change(){
		
		return null;
	}
	
	public static Bitmap getImage(String name){
//		try {
//			return new Bitmap(ImageIO.read(new FileImageInputStream(new File(PropertiesUtils.getImageMap().get(name)))));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return null;
	}
}
