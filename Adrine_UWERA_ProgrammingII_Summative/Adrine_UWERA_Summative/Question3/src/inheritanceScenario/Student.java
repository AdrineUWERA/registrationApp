// indicates the package under which the class is 
package inheritanceScenario;

//imports ArrayList class from java.util
import java.util.ArrayList;


//a class for student that will be inherited by subclasses
public class Student {
	
	// declares a variable to store the student's full name.
	// has protected access because it's part of personal information, hence maintaining security.
	protected String studentName;
	
	// declares a variable yo store student's major
	String major;
	
	// declares a variable yo store student's year of study
	int yearOfStudy;
	
	// creates an array that stores all the subject taken by the student
	// used an arrayList because the number of subjects will keep increasing
	ArrayList<String> subjects = new ArrayList<String>();
	
	// initializes a variable that will track student's grades
	double grades = 0;
	
	// constructor for the Student class to initiate the student's properties. Will allow pass in arguments 
	//when creating an object of the Student class
	public Student(String name, String major, int year) {
		this.studentName = name;
		this.major = major;
		this.yearOfStudy = year;
	}
	
	// a method to add a subject a student is taking to the subjects array list
	public void takesSubject(String subject) {
		// appends the specific subject to the subjects array list
		subjects.add(subject);
	}
	
	// a method to retrieve all the subject a student is taking, that are stored in the subject array list
	public void getAllSubjects() {
		// initializes a string to be used when displaying the subjects
		String allSubj = studentName + "takes";
		
		//loops through each of the subjects in the subjects array list and concatenate each to the 
		// allSubj string
		for (String subj: subjects) {
			allSubj = allSubj.concat(" " + subj + ",");
		}
		
		// prints the string with all the subject a student is taking
		System.out.println(allSubj);
	}
	
	// a method showing that a student is revising a specific subject as one of the activities a student does
	public void revise(String subject) {
		System.out.println(studentName + " is revising " + subject);
	}
	
	// a method showing that a student is taking an exam of a specific subject 
	public void takesExam(String subject) {
		System.out.println(studentName + " is taking a " + subject + " exam");
	}
	
	// a method to calculate the grade of a student after another grade is released
	public double getExamGrade(int grade) {
		return this.grades += grade;
	}
	
	// a method to promote a student by comparing his/her grade with the required grade	
	public void getsPromoted(double requiredScore) {
		// checks if the student passed
		if (this.grades > requiredScore) {
			// displays a message to indicate that the student got promoted
			System.out.println("Got promoted");
			// increments the year of study by 1 because the student got promoted
			this.yearOfStudy += 1;
		}
		
		// otherwise if a student failed
		else {
			// displays a message that the student wasn't promoted
			System.out.println("Not promoted");
		}
		
	}
	
	// getter method for the grades
	public double getGrade() {
		return this.grades;
	}
	
	// a setter method for the grades
	// this method can be used when a teacher wants to correct student's grade maybe after he/ she claimed
	public void setGrade(double newGrade) {
		// sets the student's grade to a new grade
		this.grades = newGrade;
	} 
	
	// getter method for the student's name	
	public String getStudentName() {
		return studentName;
	}

	//  a setter method for the studentName
	// this can used when the student's name was initially incorrectly written and needs to be changed
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// getter method for the major a student is pursuing
	public String getMajor() {
		return major;
	}
	
	//  a setter method for the major a student is pursuing
	// this method can be used when a student decides to switch majors
	public void setMajor(String major) {
		this.major = major;
	}

	// getter method for the year of study the student is in
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	//  a setter method for the year of study
	// this method can be used when the year was incorrectly set
	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

}
