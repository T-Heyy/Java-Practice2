package Practice2;

import java.util.Scanner;

public class Rabbit {
	private String name;
	private int id;
	
	public Rabbit(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void eat() {
		System.out.println("The name of the rabbit is: " + name);
		System.out.println("The id of the rabbit is:" + id);
	}
	
	
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Please input the name of the rabbit: ");
		String name = scanner1.next();
		int id = 0;
		System.out.print("Please input the id of the rabbit: ");
		id = scanner1.nextInt();
		while (id == 0) {
			System.out.print("Error,id != 0. Please reinput the id of the rabbit: ");
			id = scanner1.nextInt();
		}
		Rabbit rabbit1 = new Rabbit(name, id);
		rabbit1.eat();
		scanner1.close();
	}
	
}
