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
		System.out.println("ff".equals("ff"));
	}
}
class person{
	String name="haha";
	int age;
	void eat(){
		System.out.println("�ҿ��ԳԷ�");
	}
}

class teather extends person{
	void eat(){
		System.out.println(name);
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
