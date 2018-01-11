import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    
	Polymorph(int x, int y, int width, int height){
	   	 this.x = x;
	   	 this.y = y;
	   	 this.width = width;
	   	 this.height = height;
	    }
    
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

    public int getX() {
    		return x;
    }
    
    public int getY() {
    		return y;
    }
    
    public void setX(int x) {
    		this.x = x;
    }
    
    public void setY(int y) {
    		this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
