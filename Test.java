// method return type is interge/number:- it will check for local first then search for instance variable
public class Test {
	int a=100;
	public static void main(String[] args){   
	Test t= new Test();
	int a=t.sampleMethod();
	System.out.println("method return value= "+a);
	}
	int sampleMethod(){
		System.out.println("This is a sampleMethod");
		return a;
	}
}