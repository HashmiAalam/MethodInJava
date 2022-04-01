 // method calling with arguments in realtime project level
 // In realtime projects methods are Accepecting objects as arguments
 public class Test {
	public static void main(String[] args){      
		 //to call sampleInstanceMethod we need object of class Test
         Test t= new Test();
         //to call sampleInstanceMethod also we need objects of class Employee and X 
         Employee employee= new Employee();
         X x= new X();
         t.sampleInstanceMethod(employee,x);
        //to call sampleStaticMethod we do not need object but we need objects of class Student and Y
        Student student= new Student();
        Y y= new Y();
        Test.sampleStaticMethod(student,y);		
	}
		void sampleInstanceMethod(Employee e,X x){
			System.out.println("Hi Employee and x objects");
		}
		static void sampleStaticMethod(Student s,Y y){
			System.out.println("Hi Student and y objects");
		}
}

class Employee{}
class Student{}
class X{}
class Y{}
