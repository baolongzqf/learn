
public class Person3 {
	/**
	 * ������ķ�ʽ�����ݿɱ�����Ĳ���
	 * @param arges
	 */
	public void printInfo(String[] args){
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
	/**
	 * ��Java�е�...�����ݿɱ�����Ĳ���
	 * ���û�в������Բ���
	 * ����...������Դ���0���������
	 * ����ж���������ɱ�Ĳ���һ��Ҫ�������
	 * @param args
	 */
	public void printInfo1(String... args){
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}

}
