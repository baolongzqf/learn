import java.util.Scanner;


public class Test2 {
         public static void main(String[] args){
        	/* double x=7;
        	 double y=Math.sqrt(x);
        	 System.out.println(y);*/
        	 
        	 /*String greeting="Hello";
        	 String s = greeting.substring(3, 5);
        	 System.out.println(s);*/
        	 
        	 /*String all =String.join("/","S","M","L");
        	 System.out.println(all);*/
        	 
        	 /*String greeting = "Hello";
        	 "Hello".equals(greeting);*/
        	 
        	 /*String greeting = "Hello222  wwww";
        	 int n = greeting.length();
        	 System.out.println(n);*/
        	 
        	 /*Scanner in = new Scanner(System.in);
        	 System.out.print("What is your name");
        	 String name = in.nextLine();
        	 
        	 System.out.print("How old are you?");
        	 int age = in.nextInt();
        	 
        	 System.out.println("Hello," + name + ". Next year , you will be" + (age+1));   比较后面学*/
        	 
        	 /*int x =13;
        	 String name = "Ads";
        	 System.out.printf("Hello, %s.Next year, you will be %d",name,x);*/
        	 
        	 //System.out.printf("%s %tB %<$te, %<$tY", "Due date:", new Date());错
        	 //使用指定格式打出日期
        	 
        	 
        	 /*int i = 2;
        	 int k = i > 1 ? 2 : 3;
        	 System.out.println(k);*/
        	 //三元（目）运算符，先判断true或是false，true就输出前项，false就输出后相
        	 
        	int[] a = new int[30];
        	for (int i=0; i<30; i++)
        		a[i]=i;
        	
        	for (int element : a)
        		System.out.print(a[element]);
        	
        	 
         }
}
