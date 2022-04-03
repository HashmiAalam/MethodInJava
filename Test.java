 // method calling with arguments(local variable) v/s instance variable
//local variables having first priority 
  public class Test {
	 int a=10,b=20;    //instance variable
	public static void main(String[] args){   
	//to call add method we need object
	Test t=new Test();
	t.add(100,200);    //we need to pass arguments to call add method
	}
	void add(int a, int b){     //a and b are called local variable
	System.out.println(a+b);   //whenever there is common name in variables local variables get first priority
	System.out.println(a+b);
	}
	
}

