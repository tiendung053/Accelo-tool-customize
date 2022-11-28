package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.CustomerModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;

public class CustomerView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lblid;
	private JTextField tfid;
	private JLabel lbladdress;
	private JTextField tfaddress;
	private JLabel lblphone;
	private JTextField tfphone;
	private JLabel lblemail;
	private JTextField tfemail;
	private JLabel lblaccount;
	private JTextField tfaccount;
	private JLabel lblwebuser;
	private JTextField tfwebuser;
	private JPanel contentPane;
	private JTable tblCustomer;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<CustomerModel> customerLst = new ArrayList();
	
	/**
	 * Create the frame.
	 */
	public void initComponents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 606);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Customer", null, panel, null);
		panel.setLayout(null);
		
		btnAdd = new JButton("ADD");
		btnAdd.setBounds(15, 11, 89, 23);
		panel.add(btnAdd);
		
		btnDelete = new JButton("DELETE");
		
		btnDelete.setBounds(330, 11, 89, 23);
		panel.add(btnDelete);

		btnReset = new JButton("Reset");
		btnReset.setBounds(170, 11, 89, 23);
		panel.add(btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 274, 429, 293);
		panel.add(scrollPane);
		tblCustomer = new JTable();
		
		tblCustomer.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"id",
				"address",
				"phone",
				"email",
				"account",
				"webuser",
			}
		));
		scrollPane.setViewportView(tblCustomer);
		lblid = new JLabel("id:");
		lblid.setBounds(, , , );
		panel.add(lblid);
		
		tfid = new JTextField();
		tfid.setBounds(, , , );
		panel.add(tfid);
		tfid.setColumns(10);
		lbladdress = new JLabel("address:");
		lbladdress.setBounds(, , , );
		panel.add(lbladdress);
		
		tfaddress = new JTextField();
		tfaddress.setBounds(, , , );
		panel.add(tfaddress);
		tfaddress.setColumns(10);
		lblphone = new JLabel("phone:");
		lblphone.setBounds(, , , );
		panel.add(lblphone);
		
		tfphone = new JTextField();
		tfphone.setBounds(, , , );
		panel.add(tfphone);
		tfphone.setColumns(10);
		lblemail = new JLabel("email:");
		lblemail.setBounds(, , , );
		panel.add(lblemail);
		
		tfemail = new JTextField();
		tfemail.setBounds(, , , );
		panel.add(tfemail);
		tfemail.setColumns(10);
		lblaccount = new JLabel("account:");
		lblaccount.setBounds(, , , );
		panel.add(lblaccount);
		
		tfaccount = new JTextField();
		tfaccount.setBounds(, , , );
		panel.add(tfaccount);
		tfaccount.setColumns(10);
		lblwebuser = new JLabel("webuser:");
		lblwebuser.setBounds(, , , );
		panel.add(lblwebuser);
		
		tfwebuser = new JTextField();
		tfwebuser.setBounds(, , , );
		panel.add(tfwebuser);
		tfwebuser.setColumns(10);

	}
	/*private void addEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfid.getText();
				Address address = tfaddress.getText();
				Phone phone = tfphone.getText();
				String email = tfemail.getText();
				Account account = tfaccount.getText();
				WebUser webuser = tfwebuser.getText();
				CustomerModel customer = new CustomerModel(String id, Address address, Phone phone, String email, Account account, WebUser webuser);
				CustomerController.insert(customer);
				showCustomer();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblCustomer.getSelectedRow();
				if (selectedIndex >= 0) {
					CustomerModel customer = customerLst.get(selectedIndex);
					CustomerController.delete(customer.getId());
					showCustomer();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfid.setText("");
				tfaddress.setText("");
				tfphone.setText("");
				tfemail.setText("");
				tfaccount.setText("");
				tfwebuser.setText("");
			}
		});
	}
	public CustomerView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblCustomer.getModel();
		showCustomer();
	}
	
	private void showCustomer() {
		customerLst = CustomerController.findAll();
		
		tableModel.setRowCount(0);
		
		customerLst.forEach((customer) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, customer.getId(), customer.getAddress(), customer.getPhone(), customer.getEmail(), customer.getAccount(), customer.getWebuser()
		});
	}
	*/
}

