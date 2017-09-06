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
		long start=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<1000;i++){
			sum+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println(end+";"+start);
		System.out.println(end-start);
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
		System.out.println("我是老师，我可以吃人");
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

