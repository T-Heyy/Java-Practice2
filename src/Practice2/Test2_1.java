package Practice2;
//���Ժ���

public class Test2_1 {
	public static void main (String[] args) {
		System.out.println("person1(����Person���޲ι��췽��)");
		Person person1 = new Person();
		person1.getter();
		
		System.out.println("person2(����Person���вι��췽��)");
		Person person2 = new Person(8.1F, "noodles", true);
		person2.getter();
		
		System.out.println("person2(����Person���sleep,eat,beatDouDou����)");
		person2.beatDouDou(false);
		person2.eat("cookies");
		person2.sleep(7.1F);
		person2.getter();
		
		System.out.println("monkey1(����Monkey���޲ι��췽��)");
		Monkey monkey1 = new Monkey();
		monkey1.getter();
		
		System.out.println("monkey2(����Monkey���вι��췽��)");
		Monkey monkey2 = new Monkey(13.2, 5.2);
		monkey2.getter();
		
		System.out.println("monkey2(����Monkey��climb,jump����)");
		monkey2.climb(16.7);
		monkey2.jump(3.2);
		monkey2.getter();
	}
}
