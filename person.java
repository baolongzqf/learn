/**
 * 人
 * @author zhao qf
 *
 */
public class person {
     //属性，成员变量
	String name;//姓名，默认是null
	int age;//年龄，默认是0
	
	//行为，方法
	/**
	 * 打印姓名
	 */
	
	
	public void showName(){//方法命名，首个单词小写，其他首字母大写。
		System.out.println("姓名:" + name);
		
	}
	/**
	 * 获取年龄
	 * @return
	 */
	public int getAge(){
		return age;
	}	
	
}
