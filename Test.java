// method return type
public class Test {
	
	public static void main(String[] args){   
	Test t= new Test();
	t.sampleVoidMethod(10);  //this method do not return value
	int a=t.sampleIntMethod();   //this method return int value and we can hold return value
	System.out.println(a);
	//calling static method
	float f=Test.sampleFloatMethod();
	System.out.println(f);
	Employee e=t.sampleEmployeeMethod();
	
	}
	void sampleVoidMethod(int a){
		System.out.println("I am in sampleMethod having return type void and int argument a = "+a);
	}
	int sampleIntMethod(){
		System.out.println("I am in sampleIntMethod having return type int");
		return 10;
	}
	static float sampleFloatMethod(){
	System.out.println("I am in sampleFloatMethod having return type float");
		return 10.5f;
	}
    Employee sampleEmployeeMethod(){
    System.out.println("I am in sampleEmployeeMethod having return type Employee");
		return new Employee();
	}		
}
class Employee{}