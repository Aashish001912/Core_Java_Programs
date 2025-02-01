package EducationInstitute;

public class Main 
{
	public static void main(String[] args) throws InterruptedException 
	{
	Course c[]= {new Course(101,"java",3000),new Course(102,"phython", 2500),new Course(103,"dotnet", 2000)};
	Offer f[]= {new Offer("Special discount: get20% off all course"),new Offer("Limited time offer: Enroll in any two courses and get one course free!")};
	
	EducationInstitute e=new EducationInstitute(c, f);
	Student s1=new Student("Virat", e);
	Student s2=new Student("Dhoni", e);
	
	Thread t1=new Thread() {
		
		public void run()
		{
			s1.viewCourseAndFees();
			s1.viewOffers();
			s1.enrollInCourse(102);
		}
	};
    Thread t2=new Thread() {
		
		public void run()
		{
			s2.viewCourseAndFees();
			s2.viewOffers();
			s2.enrollInCourse(101);
		}
	};
	t1.start();
	t1.join();
	System.err.println("_________________________________________");
	t2.start();
	}
}
