package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.ShoppingCartModel;
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

public class ShoppingCartView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lblcreated;
	private JTextField tfcreated;
	private JLabel lblaccount;
	private JTextField tfaccount;
	private JLabel lbllineitem;
	private JTextField tflineitem;
	private JLabel lblwebuser;
	private JTextField tfwebuser;
	private JPanel contentPane;
	private JTable tblShoppingCart;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<ShoppingCartModel> shoppingcartLst = new ArrayList();
	
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
		tabbedPane.addTab("ShoppingCart", null, panel, null);
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
		tblShoppingCart = new JTable();
		
		tblShoppingCart.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"created",
				"account",
				"lineitem",
				"webuser",
			}
		));
		scrollPane.setViewportView(tblShoppingCart);
		lblcreated = new JLabel("created:");
		lblcreated.setBounds(, , , );
		panel.add(lblcreated);
		
		tfcreated = new JTextField();
		tfcreated.setBounds(, , , );
		panel.add(tfcreated);
		tfcreated.setColumns(10);
		lblaccount = new JLabel("account:");
		lblaccount.setBounds(, , , );
		panel.add(lblaccount);
		
		tfaccount = new JTextField();
		tfaccount.setBounds(, , , );
		panel.add(tfaccount);
		tfaccount.setColumns(10);
		lbllineitem = new JLabel("lineitem:");
		lbllineitem.setBounds(, , , );
		panel.add(lbllineitem);
		
		tflineitem = new JTextField();
		tflineitem.setBounds(, , , );
		panel.add(tflineitem);
		tflineitem.setColumns(10);
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
				Date created = tfcreated.getText();
				Account account = tfaccount.getText();
				LineItem lineitem = tflineitem.getText();
				WebUser webuser = tfwebuser.getText();
				ShoppingCartModel shoppingcart = new ShoppingCartModel(Date created, Account account, LineItem lineitem, WebUser webuser);
				ShoppingCartController.insert(shoppingcart);
				showShoppingCart();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblShoppingCart.getSelectedRow();
				if (selectedIndex >= 0) {
					ShoppingCartModel shoppingcart = shoppingcartLst.get(selectedIndex);
					ShoppingCartController.delete(shoppingcart.getId());
					showShoppingCart();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfcreated.setText("");
				tfaccount.setText("");
				tflineitem.setText("");
				tfwebuser.setText("");
			}
		});
	}
	public ShoppingCartView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblShoppingCart.getModel();
		showShoppingCart();
	}
	
	private void showShoppingCart() {
		shoppingcartLst = ShoppingCartController.findAll();
		
		tableModel.setRowCount(0);
		
		shoppingcartLst.forEach((shoppingcart) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, shoppingcart.getCreated(), shoppingcart.getAccount(), shoppingcart.getLineitem(), shoppingcart.getWebuser()
		});
	}
	*/
}

