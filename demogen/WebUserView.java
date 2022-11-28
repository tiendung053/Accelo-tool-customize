package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.WebUserModel;
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

public class WebUserView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lbllogin;
	private JTextField tflogin;
	private JLabel lblpassword;
	private JTextField tfpassword;
	private JLabel lblstate;
	private JTextField tfstate;
	private JLabel lblcustomer;
	private JTextField tfcustomer;
	private JLabel lblshoppingcart;
	private JTextField tfshoppingcart;
	private JPanel contentPane;
	private JTable tblWebUser;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<WebUserModel> webuserLst = new ArrayList();
	
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
		tabbedPane.addTab("WebUser", null, panel, null);
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
		tblWebUser = new JTable();
		
		tblWebUser.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"login",
				"password",
				"state",
				"customer",
				"shoppingcart",
			}
		));
		scrollPane.setViewportView(tblWebUser);
		lbllogin = new JLabel("login:");
		lbllogin.setBounds(, , , );
		panel.add(lbllogin);
		
		tflogin = new JTextField();
		tflogin.setBounds(, , , );
		panel.add(tflogin);
		tflogin.setColumns(10);
		lblpassword = new JLabel("password:");
		lblpassword.setBounds(, , , );
		panel.add(lblpassword);
		
		tfpassword = new JTextField();
		tfpassword.setBounds(, , , );
		panel.add(tfpassword);
		tfpassword.setColumns(10);
		lblstate = new JLabel("state:");
		lblstate.setBounds(, , , );
		panel.add(lblstate);
		
		tfstate = new JTextField();
		tfstate.setBounds(, , , );
		panel.add(tfstate);
		tfstate.setColumns(10);
		lblcustomer = new JLabel("customer:");
		lblcustomer.setBounds(, , , );
		panel.add(lblcustomer);
		
		tfcustomer = new JTextField();
		tfcustomer.setBounds(, , , );
		panel.add(tfcustomer);
		tfcustomer.setColumns(10);
		lblshoppingcart = new JLabel("shoppingcart:");
		lblshoppingcart.setBounds(, , , );
		panel.add(lblshoppingcart);
		
		tfshoppingcart = new JTextField();
		tfshoppingcart.setBounds(, , , );
		panel.add(tfshoppingcart);
		tfshoppingcart.setColumns(10);

	}
	/*private void addEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = tflogin.getText();
				String password = tfpassword.getText();
				UserState state = tfstate.getText();
				Customer customer = tfcustomer.getText();
				ShoppingCart shoppingcart = tfshoppingcart.getText();
				WebUserModel webuser = new WebUserModel(String login, String password, UserState state, Customer customer, ShoppingCart shoppingcart);
				WebUserController.insert(webuser);
				showWebUser();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblWebUser.getSelectedRow();
				if (selectedIndex >= 0) {
					WebUserModel webuser = webuserLst.get(selectedIndex);
					WebUserController.delete(webuser.getId());
					showWebUser();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tflogin.setText("");
				tfpassword.setText("");
				tfstate.setText("");
				tfcustomer.setText("");
				tfshoppingcart.setText("");
			}
		});
	}
	public WebUserView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblWebUser.getModel();
		showWebUser();
	}
	
	private void showWebUser() {
		webuserLst = WebUserController.findAll();
		
		tableModel.setRowCount(0);
		
		webuserLst.forEach((webuser) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, webuser.getLogin(), webuser.getPassword(), webuser.getState(), webuser.getCustomer(), webuser.getShoppingcart()
		});
	}
	*/
}

