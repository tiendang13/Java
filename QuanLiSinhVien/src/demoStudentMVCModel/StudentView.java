package demoStudentMVCModel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentView extends JFrame{
    private JLabel lblTitle = new JLabel("Student Information");
	private JLabel lblSearch = new JLabel("Name");
	private JTextField txtSearch = new JTextField(20);
	private JButton btnSearch = new JButton("Search");
	private JButton btnShowAll = new JButton("Show All");
	private String colTitle[] ={"ID", "Name", "Student Code", "Average Score", "Adress", "Date of Birth"}; 
	

	public StudentView(){
        this.add(createMainPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
        setLocationRelativeTo(null);
	}
	
	 private JPanel createMainPanel() {
         JPanel panel = new JPanel(new BorderLayout());
         panel.add(createTitlePanel(), BorderLayout.PAGE_START);
         panel.add(createTablePanel(), BorderLayout.CENTER);
         panel.add(createButtonPanel(), BorderLayout.PAGE_END);
         return panel;
	 }
	 
	private JPanel createTitlePanel(){
		JPanel panel = new JPanel();
        panel.add(lblTitle);
        return panel;
	}
	private JScrollPane createTablePanel(){
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(colTitle);
		JTable tblInfo = new JTable(model);
		JScrollPane sp = new JScrollPane(tblInfo);
		return sp;
	}
	
	private JPanel createButtonPanel(){
		JPanel panel = new JPanel();
		panel.add(lblSearch);
		panel.add(txtSearch);
		panel.add(btnSearch);
		panel.add(btnShowAll);
		return panel;
	}
	
	public String getName(){
		return txtSearch.getText().trim();
	}
	
	public void addSearchListener(ActionListener actionListener){
		btnSearch.addActionListener(actionListener);
	}
	
	public void addShowAllListener(ActionListener actionListener){
		btnShowAll.addActionListener(actionListener);
	}
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}

