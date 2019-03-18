package Practice2;
//Person��
public class Person { 
	private float sleepTime;
	private String eatFood;
	private boolean beatDouDou;
	
	public Person() {
		// �޲ι��췽��
		sleepTime = 7.5F; //����ֵΪС������Ҫ��F
		eatFood = "rice";
		beatDouDou = false;
	}
	
	public Person(float sleepTime, String eatFood, boolean beatDouDou) {
		//�вι��췽��
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
