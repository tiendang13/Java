package demoStudentMVCModel;

public class StudentController {
	private StudentView theView;
	private StudentModel theModel;
	
	public StudentController(StudentView theView, StudentModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
	}
	
	
}
