package Practice2;
//Person类
public class Person { 
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
