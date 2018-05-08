package demoStudentMVCModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class StudentController {
	private StudentView theView;
	private StudentModel theModel;
	private ResultSet result = null;
	
	public StudentController(StudentView theView, StudentModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addShowAllListener(new ShowAllListener());
		this.theView.addSearchListener(new SearchListener());
	}
	class SearchListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			result = theModel.getSearchingData(theView.getID());
			try {
				while(result.next()){
					String[] student = new String[6];
					for(int i = 0; i < 6; i++){
						student[i] = result.getString(i + 1);
					}
					theView.addRowToTable(student);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	class ShowAllListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			result = theModel.getData();
			try {
				while(result.next()){
					String[] student = new String[6];
					for(int i = 0; i < 6; i++){
						student[i] = result.getString(i + 1);
					}
					theView.addRowToTable(student);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}

	}
}
