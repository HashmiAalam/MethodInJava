// method return type is interge/number:- first priority goes to local variable
public class Test {
	int a=100;
	public static void main(String[] args){   
	Test t= new Test();
	int a=t.sampleMethod(10);
	System.out.println("method return value= "+a);
	}
	int sampleMethod(int a){
		System.out.println("This is a sampleMethod");
		return a;
	}
}