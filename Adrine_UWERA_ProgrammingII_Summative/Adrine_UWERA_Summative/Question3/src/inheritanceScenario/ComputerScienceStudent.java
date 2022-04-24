// indicates the package under which the class is 
package inheritanceScenario;

// imports ArrayList class from java.util
import java.util.ArrayList;

// a class for computer science students that inherits the Student class
public class ComputerScienceStudent extends Student{
	
	// a variable to store the student's GitHub name.
	// has protected access because it's part of personal information, hence maintaining security.
	protected String gitHubUserName;
	
	// creates an array that stores all the languages studied by the student
	// used an arrayList because the number of languages will keep increasing as a student learn
	ArrayList<String> languages = new ArrayList<String>();
	
	// creates an array that stores all the project worked on by the student
	// used an arrayList because the number of projects will keep increasing as a student gets to work on 
	// more projects
	ArrayList<String> projects = new ArrayList<String>();
	
	// constructor for the ComputerSciecneStudent class to initiate the student's properties. Will allow pass 
	// in arguments when creating an object of the ComputerSciecneStudent class
	public ComputerScienceStudent(String name, String major, int year, String gitHubUserName) {
		// inherits properties of the Student class
		super(name, major, year);
		
		// sets the student's github username as the one passed in as an argument
		this.gitHubUserName = gitHubUserName;
	}
	
	// a method to add a language a student is learning to the languages array list
	public void learnLanguage(String langauage) {
		// appends the specific language passed in as an argument to the languages array list
		languages.add(langauage);
	}
	
	// a method to add a project a student is working on to the projects array list
	public void buildProject(String title) {
		// appends the specific project to the projects array list
		projects.add(title);
	}
	
	// a method to retrieve all the languages a student is learned, that are stored in the languages array list
	public void getAllLanguages() {
		// initializes a string to be used when displaying the languages a student learned
		String allLang = studentName + " knows";
		
		//loops through each of the languages in the language array list and concatenate each to the 
		//allLang string
		for (String lang: languages) {
			allLang = allLang.concat(" " + lang + ",");
		}
		
		// prints the string with all the languages a student learned
		System.out.println(allLang);
	}
	
	public void getAllProjects() {
		// initializes a string to be used when displaying the projects a student worked on
		String allProj = studentName + " built";
		
		//loops through each of the subjects in the projects array list and concatenate each to the 
		// allProj string
		for (String proj: projects) {
			allProj = allProj.concat(" " + proj + ",");
		}
		
		// prints the string with all the projects a student worked on
		System.out.println(allProj);
	}

	// getter method for the student's github username
	public String getGitHubUserName() {
		return gitHubUserName;
	}
	
	// setter method for the student's github username
	public void setGitHubUserName(String gitHubUserName) {
		// sets the github username to a new username
		this.gitHubUserName = gitHubUserName;
	}

}
