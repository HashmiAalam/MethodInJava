 // method calling with arguments
 public class Test {
	public static void main(String[] args){      
	Test t= new Test();
	 t.sampleMethod(12,'z',"alam");   //sampleMethod is accepting arguments of type int, char and String
	 Test.sampleStaticMethod((byte)5,60.5f, 30.4);    //sampleStaticMethod is accepting arguments of type byte, float, double
	 // if we pass like Test.sampleStaticMethod((5,60.5f); -> it will through error like  incompatible types: possible lossy conversion from int to byte
	 //The Java language requires you to use a (byte) cast when you assign an int-valued expression to a byte.
	  }
	  void sampleMethod(int a,char ch,String s){   
	  System.out.println("Hi instance method with arguments");
      System.out.println(a);
      System.out.println(ch);
      System.out.println(s);	  
	}
	static void sampleStaticMethod(byte b, float f,double d){
		System.out.println("Hi static method with arguments");
       System.out.println(b);
       System.out.println(f);
       System.out.println(d);	   
	}		
}
