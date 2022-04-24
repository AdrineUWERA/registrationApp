// indicates the package under which the class is 
package inheritanceScenario;

// a Main class to create instances of the classes
public class Main {
	public static void main(String[] args) {
		// creates an instance of the ComputerScienceStudent class
		ComputerScienceStudent CsStudent1 = new ComputerScienceStudent("Adrine", "CS", 2, "adrineUwera");
		
		// adds languages a student is learning using learnLanguage method of the ComputerScienceStudent class
		CsStudent1.learnLanguage("Java");
		CsStudent1.learnLanguage("Python");
		
		// gets all the languages a student learned using getAllLanguage method of the ComputerScienceStudent
		// class
		CsStudent1.getAllLanguages();
		
		// shows that a student is doing revision of the Programming subject using revise method of the Student
		// class. ComputerScienceStudent is able to use methods of the Student class because it extends the
		// Student class
		CsStudent1.revise("Programming");
		
		//adds projects the student is working on using buildPorject method of the ComputerScienceStudent class
		CsStudent1.buildProject("Calculator");
		CsStudent1.buildProject("ALU registration application");
		
		// gets all project a student worked on so far using the getAll Projects method of the 
		// ComputerScienceStudent class
		CsStudent1.getAllProjects();
		
		// shows that a student is taking an exam using the takesExam method of the Student class
		CsStudent1.takesExam("Computer Architecture");
		
		// gives and adds the student grades for the exam using the getExamGrade method of the Student class
		CsStudent1.getExamGrade(18);
		
		// shows that a student is taking an exam using the takesExam method of the Student class
		CsStudent1.takesExam("Data Structures and algorithm");
		
		// gives and adds the student grades for the exam using the getExamGrade method of the Student class
		CsStudent1.getExamGrade(16);
		
		// prints the overall grade of the student the getGrades method of the Student class
		System.out.println("Overall grade: " + CsStudent1.getGrade());
		
		// determines if the student gets promoted by comparing his/ her grade with the required grade of 25
		// using the getsPrpmoted method of the Student class
		CsStudent1.getsPromoted(25);
		
		// prints what year the student gets promoted to
		System.out.println(CsStudent1.getStudentName() + " is promoted to year " + CsStudent1.getYearOfStudy());
	}
	
}
