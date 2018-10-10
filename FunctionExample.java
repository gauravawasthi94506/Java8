package Java8Features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
	String name;
	int age;
	Employee1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
}


public class FunctionExample {
	
	public static void main(String args[]){
		
		List<Employee1> lst=new ArrayList();
		lst.add(new Employee1("First",10));
		lst.add(new Employee1("Second",20));
		lst.add(new Employee1("Third",30));
		lst.add(new Employee1("Fourth",40));
		lst.add(new Employee1("Fifth",50));
		Predicate<Employee1> pre=p1-> p1.age>20;
		
		Function<Employee1,String> fn=e1-> {
			int age=e1.age;
			String grade="";
			if(age==10) grade="Childish";
			else if(age>40) grade="old";
			else grade="matured";
			return grade;
		};
		
		for(Employee1 emp:lst){
			if(pre.test(emp)){
				System.out.println("Name is "+emp.name+" age is "+emp.age + "grade is"+fn.apply(emp));			
			}
		}
	}
	
}
