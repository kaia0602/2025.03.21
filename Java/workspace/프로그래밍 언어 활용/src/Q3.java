
class Point {
    protected int x;
	protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move() {
		
	} void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point{
	
	String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}


	public void setColor(String color) {
		this.color = color;
	}



	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.println(color + "색으로 " + "("  + getX() + ", " + getY() + ")");
	}
}

public class Q3 {

	public static void main(String[] args) {
		
	    ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
	    cp.setPoint(10, 20);
	    cp.setColor("GREEN");
	    cp.show();

	}

}
