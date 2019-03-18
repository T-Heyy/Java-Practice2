package Practice2;
//Monkey类
public class Monkey { 
	private double climbMeter;
	private double jumpMeter;
	
	public Monkey() {
		// 无参构造方法
		climbMeter = 12.3;
		jumpMeter = 4.2;
	}
	
	public Monkey(double climbMeter, double jumpMeter) {
		//有参构造方法
		this.climbMeter = climbMeter;
		this.jumpMeter = jumpMeter;
	}
	
	public void climb(double climbMeter) {
		this.climbMeter = climbMeter;
		System.out.println("Monkey climbs for: " + this.climbMeter + " meters.");
	}
	
	public void jump(double jumpMeter) {
		this.jumpMeter = jumpMeter;
		System.out.println("Monkey jumps for: " + this.jumpMeter + " meters.");
	}
	
	public void getter() {
		System.out.println("Monkey climbs for: " + climbMeter + " meters.");
		System.out.println("Monkey jumps for: " + jumpMeter + " meters.");
		System.out.println();
	}
}