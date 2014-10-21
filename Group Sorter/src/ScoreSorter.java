import java.util.Comparator;
public class ScoreSorter implements Comparator<Student>
	{
	public int compare(Student s1, Student s2)
		{
		if(s1.getStudentGrade()<s2.getStudentGrade())
			return 1;
		else 
			return -1; 
		}
	}

