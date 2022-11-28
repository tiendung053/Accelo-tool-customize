package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.AccountModel;
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

public class AccountView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lblid;
	private JTextField tfid;
	private JLabel lblbilling_address;
	private JTextField tfbilling_address;
	private JLabel lblis_closed;
	private JTextField tfis_closed;
	private JLabel lblopen;
	private JTextField tfopen;
	private JLabel lblclosed;
	private JTextField tfclosed;
	private JLabel lblcustomer;
	private JTextField tfcustomer;
	private JLabel lblpayment;
	private JTextField tfpayment;
	private JLabel lblshoppingcart;
	private JTextField tfshoppingcart;
	private JLabel lblorder;
	private JTextField tforder;
	private JPanel contentPane;
	private JTable tblAccount;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<AccountModel> accountLst = new ArrayList();
	
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
		tabbedPane.addTab("Account", null, panel, null);
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
		tblAccount = new JTable();
		
		tblAccount.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"id",
				"billing_address",
				"is_closed",
				"open",
				"closed",
				"customer",
				"payment",
				"shoppingcart",
				"order",
			}
		));
		scrollPane.setViewportView(tblAccount);
		lblid = new JLabel("id:");
		lblid.setBounds(, , , );
		panel.add(lblid);
		
		tfid = new JTextField();
		tfid.setBounds(, , , );
		panel.add(tfid);
		tfid.setColumns(10);
		lblbilling_address = new JLabel("billing_address:");
		lblbilling_address.setBounds(, , , );
		panel.add(lblbilling_address);
		
		tfbilling_address = new JTextField();
		tfbilling_address.setBounds(, , , );
		panel.add(tfbilling_address);
		tfbilling_address.setColumns(10);
		lblis_closed = new JLabel("is_closed:");
		lblis_closed.setBounds(, , , );
		panel.add(lblis_closed);
		
		tfis_closed = new JTextField();
		tfis_closed.setBounds(, , , );
		panel.add(tfis_closed);
		tfis_closed.setColumns(10);
		lblopen = new JLabel("open:");
		lblopen.setBounds(, , , );
		panel.add(lblopen);
		
		tfopen = new JTextField();
		tfopen.setBounds(, , , );
		panel.add(tfopen);
		tfopen.setColumns(10);
		lblclosed = new JLabel("closed:");
		lblclosed.setBounds(, , , );
		panel.add(lblclosed);
		
		tfclosed = new JTextField();
		tfclosed.setBounds(, , , );
		panel.add(tfclosed);
		tfclosed.setColumns(10);
		lblcustomer = new JLabel("customer:");
		lblcustomer.setBounds(, , , );
		panel.add(lblcustomer);
		
		tfcustomer = new JTextField();
		tfcustomer.setBounds(, , , );
		panel.add(tfcustomer);
		tfcustomer.setColumns(10);
		lblpayment = new JLabel("payment:");
		lblpayment.setBounds(, , , );
		panel.add(lblpayment);
		
		tfpayment = new JTextField();
		tfpayment.setBounds(, , , );
		panel.add(tfpayment);
		tfpayment.setColumns(10);
		lblshoppingcart = new JLabel("shoppingcart:");
		lblshoppingcart.setBounds(, , , );
		panel.add(lblshoppingcart);
		
		tfshoppingcart = new JTextField();
		tfshoppingcart.setBounds(, , , );
		panel.add(tfshoppingcart);
		tfshoppingcart.setColumns(10);
		lblorder = new JLabel("order:");
		lblorder.setBounds(, , , );
		panel.add(lblorder);
		
		tforder = new JTextField();
		tforder.setBounds(, , , );
		panel.add(tforder);
		tforder.setColumns(10);

	}
	/*private void addEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfid.getText();
				Address billing_address = tfbilling_address.getText();
				boolean is_closed = tfis_closed.getText();
				Date open = tfopen.getText();
				Date closed = tfclosed.getText();
				Customer customer = tfcustomer.getText();
				Payment payment = tfpayment.getText();
				ShoppingCart shoppingcart = tfshoppingcart.getText();
				Order order = tforder.getText();
				AccountModel account = new AccountModel(String id, Address billing_address, boolean is_closed, Date open, Date closed, Customer customer, Payment payment, ShoppingCart shoppingcart, Order order);
				AccountController.insert(account);
				showAccount();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblAccount.getSelectedRow();
				if (selectedIndex >= 0) {
					AccountModel account = accountLst.get(selectedIndex);
					AccountController.delete(account.getId());
					showAccount();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfid.setText("");
				tfbilling_address.setText("");
				tfis_closed.setText("");
				tfopen.setText("");
				tfclosed.setText("");
				tfcustomer.setText("");
				tfpayment.setText("");
				tfshoppingcart.setText("");
				tforder.setText("");
			}
		});
	}
	public AccountView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblAccount.getModel();
		showAccount();
	}
	
	private void showAccount() {
		accountLst = AccountController.findAll();
		
		tableModel.setRowCount(0);
		
		accountLst.forEach((account) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, account.getId(), account.getBilling_address(), account.getIs_closed(), account.getOpen(), account.getClosed(), account.getCustomer(), account.getPayment(), account.getShoppingcart(), account.getOrder()
		});
	}
	*/
}

