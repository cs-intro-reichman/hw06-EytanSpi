import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * Morphs image into a grayscled version of itself
 */
public class Editor4 {

	public static void main (String[] args) {
		String picture = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(picture);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}
