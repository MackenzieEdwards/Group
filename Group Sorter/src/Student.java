public class Student
{
private String firstName;
private String lastName;
private double score;
private int groupNumber;

public Student(String fN, String lN, double sc, int gN)
	{
	firstName = fN;
	lastName = lN;
	score = sc;
	groupNumber = gN;
	}

public double getStudentGrade()
	{
	return score;
	}

public String getFirstName()
	{
	return firstName;
	}

public String getLastName()
	{
	return lastName;
	}	

public int getGroupNumber()
	{
	return groupNumber;
	}
}