// method return type is current class than we can use 'this' keyword
public class Test {
	public static void main(String[] args){   
	Test t= new Test();
	t.sampleTestMethod1();
    Test t1=t.sampleTestMethod2();
	Employee e=t.sampleEmployeeMethod();
	}
	Test sampleTestMethod1(){
		System.out.println("I am in sampleTestMethod having return type Test");
		return new Test();    //this method returns current class object
	}
	//or
	Test sampleTestMethod2(){
		System.out.println("I am in sampleTestMethod having return type Test");
		return this;  //'this' keyword represents current class object
	}
    Employee sampleEmployeeMethod(){
    System.out.println("I am in sampleEmployeeMethod having return type Employee");
		return new Employee();
	}		
}
class Employee{}