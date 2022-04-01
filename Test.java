 // method calling 
 public class Test {
	public static void main(String[] args){      
	Test t= new Test();
	 t.sampleMethod();   //instance method memory allocated when object is created so we can access these methods via object only e.g. it get called by 't'
	 Test.sampleStaticMethod();    //static method memory allocated with class loading so we can access static method via class
	  }
	  void sampleMethod(){   
	  System.out.println("Hi instance method");   
	}
	static void sampleStaticMethod(){
		System.out.println("Hi static method"); 
	}		
}
