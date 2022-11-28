package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.OrderModel;
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

public class OrderView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lblnumber;
	private JTextField tfnumber;
	private JLabel lblordered;
	private JTextField tfordered;
	private JLabel lblshipped;
	private JTextField tfshipped;
	private JLabel lblship_to;
	private JTextField tfship_to;
	private JLabel lblstatus;
	private JTextField tfstatus;
	private JLabel lbltotal;
	private JTextField tftotal;
	private JLabel lblpayment;
	private JTextField tfpayment;
	private JLabel lblaccount;
	private JTextField tfaccount;
	private JLabel lbllineitem;
	private JTextField tflineitem;
	private JPanel contentPane;
	private JTable tblOrder;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<OrderModel> orderLst = new ArrayList();
	
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
		tabbedPane.addTab("Order", null, panel, null);
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
		tblOrder = new JTable();
		
		tblOrder.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"number",
				"ordered",
				"shipped",
				"ship_to",
				"status",
				"total",
				"payment",
				"account",
				"lineitem",
			}
		));
		scrollPane.setViewportView(tblOrder);
		lblnumber = new JLabel("number:");
		lblnumber.setBounds(, , , );
		panel.add(lblnumber);
		
		tfnumber = new JTextField();
		tfnumber.setBounds(, , , );
		panel.add(tfnumber);
		tfnumber.setColumns(10);
		lblordered = new JLabel("ordered:");
		lblordered.setBounds(, , , );
		panel.add(lblordered);
		
		tfordered = new JTextField();
		tfordered.setBounds(, , , );
		panel.add(tfordered);
		tfordered.setColumns(10);
		lblshipped = new JLabel("shipped:");
		lblshipped.setBounds(, , , );
		panel.add(lblshipped);
		
		tfshipped = new JTextField();
		tfshipped.setBounds(, , , );
		panel.add(tfshipped);
		tfshipped.setColumns(10);
		lblship_to = new JLabel("ship_to:");
		lblship_to.setBounds(, , , );
		panel.add(lblship_to);
		
		tfship_to = new JTextField();
		tfship_to.setBounds(, , , );
		panel.add(tfship_to);
		tfship_to.setColumns(10);
		lblstatus = new JLabel("status:");
		lblstatus.setBounds(, , , );
		panel.add(lblstatus);
		
		tfstatus = new JTextField();
		tfstatus.setBounds(, , , );
		panel.add(tfstatus);
		tfstatus.setColumns(10);
		lbltotal = new JLabel("total:");
		lbltotal.setBounds(, , , );
		panel.add(lbltotal);
		
		tftotal = new JTextField();
		tftotal.setBounds(, , , );
		panel.add(tftotal);
		tftotal.setColumns(10);
		lblpayment = new JLabel("payment:");
		lblpayment.setBounds(, , , );
		panel.add(lblpayment);
		
		tfpayment = new JTextField();
		tfpayment.setBounds(, , , );
		panel.add(tfpayment);
		tfpayment.setColumns(10);
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

	}
	/*private void addEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = tfnumber.getText();
				Date ordered = tfordered.getText();
				Date shipped = tfshipped.getText();
				Address ship_to = tfship_to.getText();
				OrderStatus status = tfstatus.getText();
				Real total = tftotal.getText();
				Payment payment = tfpayment.getText();
				Account account = tfaccount.getText();
				LineItem lineitem = tflineitem.getText();
				OrderModel order = new OrderModel(String number, Date ordered, Date shipped, Address ship_to, OrderStatus status, Real total, Payment payment, Account account, LineItem lineitem);
				OrderController.insert(order);
				showOrder();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblOrder.getSelectedRow();
				if (selectedIndex >= 0) {
					OrderModel order = orderLst.get(selectedIndex);
					OrderController.delete(order.getId());
					showOrder();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfnumber.setText("");
				tfordered.setText("");
				tfshipped.setText("");
				tfship_to.setText("");
				tfstatus.setText("");
				tftotal.setText("");
				tfpayment.setText("");
				tfaccount.setText("");
				tflineitem.setText("");
			}
		});
	}
	public OrderView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblOrder.getModel();
		showOrder();
	}
	
	private void showOrder() {
		orderLst = OrderController.findAll();
		
		tableModel.setRowCount(0);
		
		orderLst.forEach((order) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, order.getNumber(), order.getOrdered(), order.getShipped(), order.getShip_to(), order.getStatus(), order.getTotal(), order.getPayment(), order.getAccount(), order.getLineitem()
		});
	}
	*/
}

