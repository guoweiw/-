
import java.util.*;
import demo.*;
/**
 * 
 * 只是用来测试一下的，不要紧张
 * @author 王国微
 * @version 1.0
 */
public class wang {
	/*
	 * 这是一个程序入口
	 * @param args 系统传给的变量
	 * @return 没有返回值
	 */
	public static void main(String[] args){
		zhou z=new zhou();
		z.dr();
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
	protected String name;
	int age;
	private String gender;
}

 class teather extends person implements  speak{
	public void eat(){
		System.out.println("我是"+this.name+"我的年龄是"+age);
	}
	 public void speak(){
		//System.out.println("我是"+this.name+"我的年龄是"+age);
	 };
}


