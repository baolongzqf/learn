/**
 * �������
 * @author zhao qf
 *
 */
public class Animal {
	String name;
	int eye;
	int legs;
	
	/**
	 * ��������ʳ��
	 * @param food
	 */
	public void eat(String food){
		System.out.println("���ֶ����ʳ����: " + food);
	}
	/**
	 * ������ƶ���ʽ
	 * @param moveType�ƶ���ʽ
	 */
	public void move(String moveType){
		System.out.println("���ֶ�����ƶ���ʽ��: " + moveType);
	}

}
