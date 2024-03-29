package Practice2;

public class Practice2_1 {
	public static class Person { //must be static 在Java中，类中的静态方法不能直接调用动态方法
		private float sleepTime;
		private String eatFood;
		private boolean beatDouDou;
		
		public Person() {
			// 无参构造方法
			sleepTime = 7.5F; //所赋值为小数，需要加F
			eatFood = "rice";
			beatDouDou = false;
		}
		
		public Person(float sleepTime, String eatFood, boolean beatDouDou) {
			//有参构造方法
			this.sleepTime = sleepTime;
			this.eatFood = eatFood;
			this.beatDouDou = beatDouDou;
		}	
		
		public void sleep(float sleepTime) {
			this.sleepTime = sleepTime;
			System.out.println("Person sleep for " + this.sleepTime + " hours.");
		}
		
		public void eat(String eatFood) {
			this.eatFood = eatFood;
			System.out.println("Person eat " + this.eatFood + ".");
		}
		
		public void beatDouDou(boolean beatDouDou) {
			this.beatDouDou = beatDouDou;
			System.out.println("Person beatDouDou: " + this.beatDouDou);
		}
		
		public void getter() {
			System.out.println("Person sleep for " + sleepTime + " hours.");
			System.out.println("Person eat " + eatFood + ".");
			System.out.println("Person beatDouDou: " + beatDouDou);
			System.out.println();
		}
	}
	
	public static class Monkey { //must be static
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
}


