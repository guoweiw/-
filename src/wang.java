
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
		teather t=new teather();
		t.name="sb";
		t.age=18;
		t.eat();
	}
}
interface eat{
	 void eat();
}
interface speak extends eat{
	 void speak();
}
	//abstract void drink();
class person{
	String name;
	int age;
	private String gender;
}

 class teather extends person implements  speak{
	public void eat(){
		System.out.println("����"+this.name+"�ҵ�������"+age);
	}
	 public void speak(){
		//System.out.println("����"+this.name+"�ҵ�������"+age);
	 };
}


