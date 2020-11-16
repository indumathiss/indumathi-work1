package Interface_Program;
import java.util.*;
interface A{
	void add(int a,int b);
}
interface B{
	void sub(int a,int b);
}
public class Interface_program implements A,B {

	public void add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Substraction:"+(a-b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_program ip=new Interface_program();
		ip.add(5,2);
		ip.sub(5,2);
	}

}
