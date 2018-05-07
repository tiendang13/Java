package demoStudentMVCModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		StudentView theView = new StudentView();
		StudentModel theModel = new StudentModel();
		StudentModel.ConnectToData();
		theView.setVisible(true);
		StudentController theController = new StudentController(theView, theModel);
	}

}
