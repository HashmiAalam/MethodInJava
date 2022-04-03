 // method calling with arguments(local variable) 
  public class Test {
	 int a=10,b=20;    //instance variable
	public static void main(String[] args){   
	//to call add method we need object
	Test t=new Test();
	t.add(100,200);    //we need to pass arguments to call add method
	}
	void add(int x, int y){     //x and y are called local variable
	System.out.println(a+b);
	System.out.println(x+y);
	}
	
}

