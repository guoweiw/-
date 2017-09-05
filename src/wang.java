import java.util.*;
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
		System.out.println("ff".equals("ff"));
	}
}
class person{
	String name="haha";
	int age;
	void eat(){
		System.out.println("我可以吃饭");
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
		System.out.println("我是学生，我只能吃屎");
	}
	void learn(){
		
	}
}
