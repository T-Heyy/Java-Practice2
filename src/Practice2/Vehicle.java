package Practice2;


public class Vehicle {
	private int speed;
	private int size;
	
	public void move() {
		System.out.println("The Vehicle is moving!");
		System.out.println("The speed of the vehicle is: " + speed + " km/h.");
		System.out.println("The size of the vehicle is: " + size + " m^3.");
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void speedUp() {
		speed += 100;
	}
	
	public void speedDown() {
		speed -= 50;
	}


	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		//ͨ��������ʼ��speed��size
		vehicle1.setSpeed(150);
		vehicle1.setSize(90);
		vehicle1.move();
		//���ü��ټ��ٷ����ı��ٶ�
		vehicle1.speedUp();
		vehicle1.speedDown();
		vehicle1.move();
	}	
}