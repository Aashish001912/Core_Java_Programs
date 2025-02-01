package EducationInstitute;

public class Student
{
  String name;
  EducationInstitute institute;
  public Student(String name, EducationInstitute institute) 
  {
	super();
	this.name = name;
	this.institute = institute;
  }
  
  public void viewCourseAndFees()
  {
   for(Course c: institute.getCourse())
   {
	   System.out.println(c.getCourseId()+" : "+c.getCourseName()+" : "+c.getCourseFee());
   }
  }
  public void viewOffers()
  {
	  for(Offer f:institute.getOffer())
	  {
		  System.out.println(f.getOfferText());
	  }
  }
  public void enrollInCourse(int courseId)
  {
	  institute.enrollStudentInCourse(courseId, name);
  }
  
}
