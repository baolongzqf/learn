
public class Person3 {
	/**
	 * 用数组的方式来传递可变个数的参数
	 * @param arges
	 */
	public void printInfo(String[] args){
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
	/**
	 * 用Java中的...来传递可变个数的参数
	 * 如果没有参数可以不填
	 * 这种...代表可以传递0到多个参数
	 * 如果有多个参数，可变的参数一定要放在最后。
	 * @param args
	 */
	public void printInfo1(String... args){
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}

}
