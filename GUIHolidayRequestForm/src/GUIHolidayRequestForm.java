import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class GUIHolidayRequestForm {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textFieldJob;
	private JTextField textFieldHolidaysRequested;
	private JTable table;
	private int incrementID = 1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIHolidayRequestForm window = new GUIHolidayRequestForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIHolidayRequestForm() {
		initialize();
	}


	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(54, 22, 36, 13);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String name = textFieldName.getText();
				
			}
		});
		textFieldName.setBounds(22, 34, 96, 19);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String surname = textFieldName.getText();
			}
		});
		textFieldSurname.setBounds(141, 34, 96, 19);
		frame.getContentPane().add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setBounds(261, 34, 96, 19);
		frame.getContentPane().add(textFieldAge);
		textFieldAge.setColumns(10);
		
		JButton btnNewButton = new JButton("Request Holidays");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {incrementID, textFieldName.getText(),
						textFieldSurname.getText(),
						Integer.parseInt(textFieldAge.getText()),
						textFieldJob.getText(),
						textFieldHolidaysRequested.getText()
						});
				incrementID += 1;
			}
		});
		btnNewButton.setBounds(340, 98, 125, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(367, 452, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Surname");
		lblNewLabel_1.setBounds(166, 22, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(283, 22, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Job");
		lblNewLabel_3.setBounds(410, 22, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textFieldJob = new JTextField();
		textFieldJob.setText("");
		textFieldJob.setBounds(377, 34, 96, 19);
		frame.getContentPane().add(textFieldJob);
		textFieldJob.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Requested Days (Give number)");
		lblNewLabel_4.setBounds(502, 22, 148, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("List of Approved Holidays");
		lblNewLabel_5.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(316, 226, 203, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		textFieldHolidaysRequested = new JTextField();
		textFieldHolidaysRequested.setBounds(502, 34, 148, 19);
		frame.getContentPane().add(textFieldHolidaysRequested);
		textFieldHolidaysRequested.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 265, 749, 178);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.getTableHeader().setReorderingAllowed(false);
		table.setDragEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			// Needs to be an employee Object that consists of Name, surname, age, job, requested holidays, holidays remaining
			// Later implement Unique ID for each employee that automatically increments when new employee is added using the jbutton
			new String[] {"Employee ID", "Name", "Surname", "Age", "Job", "Requested Holidays", "Holidays Remaining"}
		));
		scrollPane.setViewportView(table);
		
		
	}
}
