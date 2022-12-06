package Java;

public class Employee {

	
	String Name;
	int Empid;
	String Dep;
    String OFIICENAME;
    int salary;
    
    
    public Employee(String name,int Empid,String Dep,String OFIICENAME,int salary) {
    	Name=name;
    	this.Empid=Empid;
    	this.Dep=Dep;
    	this.salary=salary;
    	this.OFIICENAME=OFIICENAME;
    	
    }

	
	public void getDetailsOfEmpl() {
		System.out.println(this.Name+" "+this.Empid+" "+this.Dep+" "+this.OFIICENAME);
	}
	
	public void getSalaryOfEmployee() {
		System.out.println(this.salary);
	}

	public static void main(String[] args) {

		Employee emp=new Employee("sai",1001,"Testing","sadup",50000);
		emp.getDetailsOfEmpl();
		emp.getSalaryOfEmployee();

		Employee emp1=new Employee("kumar",1002,"Testing","sadup",10000);
		emp1.getDetailsOfEmpl();
		emp1.getSalaryOfEmployee();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

