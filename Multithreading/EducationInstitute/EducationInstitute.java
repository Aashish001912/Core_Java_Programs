package EducationInstitute;

public class EducationInstitute
{
	Course[] courses;
	Offer[] offer;
	public EducationInstitute(Course[] courses, Offer[] offer) 
	{
		super();
		this.courses = courses;
		this.offer = offer;
	}
	public Course[] getCourse() {
		return courses;
	}
	public void setCourse(Course[] course) {
		this.courses= course;
	}
	public Offer[] getOffer() {
		return offer;
	}
	public void setOffer(Offer[] offer) {
		this.offer = offer;
	}
	public void enrollStudentInCourse(int courseId,String studentName)
	{
		for(Course c:courses) 
		{
			if(c.getCourseId()==courseId)
			{
				System.out.println(studentName+" enrolled in coures :"+c.getCourseName());
			}
		}
		
	}
	
}
