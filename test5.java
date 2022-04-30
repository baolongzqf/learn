
public class test5 {
	public static void main(String[] args){
		//实例化person类，创建Person对象
		
//		person person = new person();//声明一个person类型的变量，变量名为person
//		//这里第一个person应用大写P，由于在创建person类的时候用了小写，所以以后创建类应该首字母大写。
//		person.name = "张三";//给person的name赋值
//		person.showName();//对象的方法的调用，在person的类里
//		int i = person.getAge();//有返回值的方法，在调用之后就会有一个值，就是return的值
//		System.out.println(i);
//		
//		person.age = 11;//给person的age赋值
//		int a = person.getAge();
//		System.out.println(a);
//		
//		//实例化Animal
//		
//		Animal ani = new Animal();
//		ani.eat("菜");
		
		
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
