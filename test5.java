
public class test5 {
	public static void main(String[] args){
		//ʵ����person�࣬����Person����
		
//		person person = new person();//����һ��person���͵ı�����������Ϊperson
//		//�����һ��personӦ�ô�дP�������ڴ���person���ʱ������Сд�������Ժ󴴽���Ӧ������ĸ��д��
//		person.name = "����";//��person��name��ֵ
//		person.showName();//����ķ����ĵ��ã���person������
//		int i = person.getAge();//�з���ֵ�ķ������ڵ���֮��ͻ���һ��ֵ������return��ֵ
//		System.out.println(i);
//		
//		person.age = 11;//��person��age��ֵ
//		int a = person.getAge();
//		System.out.println(a);
//		
//		//ʵ����Animal
//		
//		Animal ani = new Animal();
//		ani.eat("��");
		
		
//		Student stu = new Student();
//		stu.name = "xiaoming";
//		stu.age = 12;
//		stu.course = "yuwen";
//		stu.interest = "lanqiu";
//		stu.showInfo();
		
//		test5 s1 = new test5();
//		int are = s1.ggg(2, 3);
//		System.out.println(are);
		
		Person2 p =new Person2();
		p.name = "luxi";
		p.age = 11;
		p.sex = 1;
		
		int a = p.addAge(2);
		System.out.println(a);
		
	}

	public int ggg(int x,int y){
		return x * y;
	}
}
