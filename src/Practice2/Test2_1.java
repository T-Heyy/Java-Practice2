package Practice2;
//测试函数

public class Test2_1 {
	public static void main (String[] args) {
		System.out.println("person1(调用Person类无参构造方法)");
		Person person1 = new Person();
		person1.getter();
		
		System.out.println("person2(调用Person类有参构造方法)");
		Person person2 = new Person(8.1F, "noodles", true);
		person2.getter();
		
		System.out.println("person2(调用Person类的sleep,eat,beatDouDou方法)");
		person2.beatDouDou(false);
		person2.eat("cookies");
		person2.sleep(7.1F);
		person2.getter();
		
		System.out.println("monkey1(调用Monkey类无参构造方法)");
		Monkey monkey1 = new Monkey();
		monkey1.getter();
		
		System.out.println("monkey2(调用Monkey类有参构造方法)");
		Monkey monkey2 = new Monkey(13.2, 5.2);
		monkey2.getter();
		
		System.out.println("monkey2(调用Monkey类climb,jump方法)");
		monkey2.climb(16.7);
		monkey2.jump(3.2);
		monkey2.getter();
	}
}
