package question1;

public class Person {
	
	protected String name,
		address,
		phoneNumber,
		emailAddress;
	
	public Person(String a, String b, String c, String d) {
		this.name = a;
		this.address = b;
		this.phoneNumber = c;
		this.emailAddress = d;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + name;
	}

}

class Student extends Person {

	private final eClassStatus classStatus;

	public Student(String a, String b, String c, String d, eClassStatus e) {
		super(a,b,c,d);
		this.classStatus = e;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + name;
	}
	
}

class Employee extends Person {
	
	private String office;
	private double salary;
	private myDate dateHired;
	
	public Employee(String a, String b, String c, String d, String e, double f, myDate g) {
		super(a, b, c, d);
		this.office = e;
		this.salary = f;
		this.dateHired = g;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + name;
	}

}

class Faculty extends Employee {
	
	private int officeHours;
	private int rank;
	
	public Faculty(String a, String b, String c, String d, String e, double f,
			myDate g, int h, int i) {
		super(a, b, c, d, e, f, g);
		this.officeHours = h;
		this.rank = i;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + name;
	}
	
}

class Staff extends Employee {

	private String title;
	
	public Staff(String a, String b, String c, String d, String e, double f,
			myDate g, String h) {
		super(a, b, c, d, e, f, g);
		this.title = h;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + name;
	}
}