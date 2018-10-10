package Java8Features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	int age;
	Employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
}


public class PredicateExample {
	
	public static void main(String args[]){
		
		List<Employee> lst=new ArrayList();
		lst.add(new Employee("First",1));
		lst.add(new Employee("Second",2));
		lst.add(new Employee("Third",3));
		lst.add(new Employee("Fourth",4));
		lst.add(new Employee("Fifth",5));
		Predicate<Employee> e1= e2-> e2.age==3;
		for(Employee emp:lst){
			if(e1.test(emp))
			{
				System.out.println("Name is "+emp.name+" age is "+emp.age);
			}
		}
	}
	
}
