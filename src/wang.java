import java.util.*;
/**
 * 
 * ֻ����������һ�µģ���Ҫ����
 * @author ����΢
 * @version 1.0
 */
public class wang {
	/*
	 * ����һ���������
	 * @param args ϵͳ�����ı���
	 * @return û�з���ֵ
	 */
	public static void main(String[] args){
		
	}
}
abstract class person{
	static final String NAME="w";
	int age;
	abstract void eat();
}
	//abstract void drink();

 class teather extends person{
	void eat(){
		System.out.println("������ʦ���ҿ��Գ���");
	}
	void teach(){
		
	}
}

	class student extends person{
	void eat(){
		System.out.println("����ѧ������ֻ�ܳ�ʺ");
	}
	void learn(){
		
	}
	}

