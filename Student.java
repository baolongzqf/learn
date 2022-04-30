/**
 * 学生类
 * @author zhao qf
 *
 */
public class Student {
	public String name;//
	public int age;
	public String course;//课程
	public String interest;
	
	/**
	 * 显示学生个人信息
	 */
	public void showInfo(){
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("课程：" + course);
		System.out.println("兴趣：" + interest);
	}

}
