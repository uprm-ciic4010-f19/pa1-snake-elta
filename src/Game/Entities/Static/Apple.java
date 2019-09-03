package Game.Entities.Static;

import Main.Handler;
import java.awt.Color;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Apple {

    private Handler handler;

    public int xCoord;
    public int yCoord;
    public float live;
    public Color color;

    public Apple(Handler handler,int x, int y){
        this.handler=handler;
        this.xCoord=x;
        this.yCoord=y;
        this.live = 1.0f;
        this.color = new Color(255, 0, 0);
    }

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public float getLive() {
		return live;
	}

	public void setLive(float live) {
		this.live = live;
	}

	public Color getColor() {
		int r = (int)(this.color.getRed()*this.live);
		int g = (int)(this.color.getGreen()*this.live);
		int b = (int)(this.color.getBlue()*this.live);
		return new Color(r, g, b);
	}

	public void setColor(Color color) {
		this.color = color;
	}
    


}
