					
public class Test8 {
	public static void swap(DataSwap ds1){
		ds1.a = 6;
		System.out.println("��swap�����У�ds1.a��ֵ�ǣ� " + ds1.a);
	}
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();
		System.out.println("�ڵ���swap����֮ǰds.a��ֵ�ǣ�" + ds.a);
		swap(ds);
		System.out.println("����swap����֮��ds.a��ֵ�ǣ�" + ds.a);
		
	}

}
