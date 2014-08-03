package std.ep.game.elements.background;

public class Background {
	
	private double xCoord;
	private double yCoord;
	private double speed;
	private double count;
	
	public Background(double xCoord, double yCoord, double speed, double count) {
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.speed = speed;
		this.count = count;
	}
	
	public double getxCoord() {
		return xCoord;
	}
	
	public void setxCoord(double xCoord) {
		this.xCoord = xCoord;
	}
	
	public double getyCoord() {
		return yCoord;
	}
	
	public void setyCoord(double yCoord) {
		this.yCoord = yCoord;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public double getCount() {
		return count;
	}
	
	public void setCount(double count) {
		this.count = count;
	}
	
}
