
public class Student 
{
	private String name;
	private int studentID;
	private int credits;
	private double gpa;

public Student(String firstName, String lastName, int studentID) 
{
	
	this.name = firstName+" "+lastName;
	this.studentID = studentID;
	this.credits = 0;
	this.gpa = 0;
}

public String getName() 
{
	return name;
}

public void setName(String firstName, String lastName) 
{
	this.name = firstName +" "+ lastName;
}

public int getStudentID() 
{
	return studentID;
}

public void setStudentID(int studentID)
{
	this.studentID = studentID;
}

public int getCredits()
{
	return credits;
}

public void setCredits(int credits) 
{
	this.credits = credits;
}

public double getGPA() 
{
	return gpa;
}

public void setGPA(double gpa)
{
	this.gpa = gpa;
}

public String getClassStanding()
{
	if(this.credits < 30)
	{
		return "Freshman";
	}
	else if((this.credits >= 30) && (this.credits < 60))
	{
		return "Sophomore";
	}
	else if((this.credits >= 60) && (this.credits < 90))
	{
		return "Junior";
	}
	else if(this.credits>=90)
		return "Senior";
	else return "Not in any class";
}

public void submitGrade(double g , int credits)
{
	double qualityscore = g*credits;
	this.gpa = (qualityscore + (this.gpa*this.credits))/(this.credits + credits);
	this.gpa = Math.round(this.gpa*1000d)/1000d;
	this.credits += credits;
}

public double computeTuition()
{
	// 15 credits = 200000 tuition
	// 1 credit = 20000/15;
	
	double tuition =1;
	int a = credits%15;
	int c = credits-a;
	int credits  = this.getCredits();
	if(credits % 15==0)
	{
		tuition = 20000.0 * (credits / 15);
	}
	
		else tuition = (20000.0 * (c / 15)) + (a * 1333.33);
	return  tuition;
	
}

public Student(String name, int studentID, double gpa, int credits) 
{
	this.name = name;
	this.studentID = studentID;
	this.gpa = gpa;
	this.credits = credits;
	
}

public Student createLegacy(Student s, Student ss)
{
	String name = s.getName()+" "+ss.getName();
	int Id = s.getStudentID()+ss.getStudentID();
	double gpa  = (s.gpa+ss.gpa)/2.0;
	int credits = 0;
	if(s.getCredits()>ss.getCredits()) credits = s.getCredits();
	else credits = ss.getCredits();
	Student sss = new Student(name, Id, gpa, credits);
	return sss;	
}

public String toString() 
{
	return "name=" + name + ", studentID=" + studentID;
}

}
