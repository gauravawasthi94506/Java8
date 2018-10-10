package Java8Features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ConsumerExample {
	
	public static void main(String args[]){
		
		List<Employee> lst=new ArrayList();
		lst.add(new Employee("First",10));
		lst.add(new Employee("Second",20));
		lst.add(new Employee("Third",30));
		lst.add(new Employee("Fourth",40));
		lst.add(new Employee("Fifth",50));
		
		Predicate<Employee> pre=p1-> p1.age>20;
		
		Function<Employee,String> fn=e1-> {
			int age=e1.age;
			String grade="";
			if(age==10) grade="Childish";
			else if(age>40) grade="old";
			else grade="matured";
			return grade;
		};
		
		Consumer<Employee> c=s2->{
			System.out.println("Name is "+s2.name+" age is "+s2.age + "grade is"+fn.apply(s2));	
		};
		
		
		for(Employee emp:lst){
			if(pre.test(emp)){
				c.accept(emp);		
			}
		}
	}
	
}
