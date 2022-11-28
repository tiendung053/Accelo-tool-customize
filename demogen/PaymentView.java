package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.PaymentModel;
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

public class PaymentView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lblid;
	private JTextField tfid;
	private JLabel lblpaid;
	private JTextField tfpaid;
	private JLabel lbltotal;
	private JTextField tftotal;
	private JLabel lbldetails;
	private JTextField tfdetails;
	private JLabel lblaccount;
	private JTextField tfaccount;
	private JLabel lblorder;
	private JTextField tforder;
	private JPanel contentPane;
	private JTable tblPayment;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<PaymentModel> paymentLst = new ArrayList();
	
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
		tabbedPane.addTab("Payment", null, panel, null);
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
		tblPayment = new JTable();
		
		tblPayment.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"id",
				"paid",
				"total",
				"details",
				"account",
				"order",
			}
		));
		scrollPane.setViewportView(tblPayment);
		lblid = new JLabel("id:");
		lblid.setBounds(, , , );
		panel.add(lblid);
		
		tfid = new JTextField();
		tfid.setBounds(, , , );
		panel.add(tfid);
		tfid.setColumns(10);
		lblpaid = new JLabel("paid:");
		lblpaid.setBounds(, , , );
		panel.add(lblpaid);
		
		tfpaid = new JTextField();
		tfpaid.setBounds(, , , );
		panel.add(tfpaid);
		tfpaid.setColumns(10);
		lbltotal = new JLabel("total:");
		lbltotal.setBounds(, , , );
		panel.add(lbltotal);
		
		tftotal = new JTextField();
		tftotal.setBounds(, , , );
		panel.add(tftotal);
		tftotal.setColumns(10);
		lbldetails = new JLabel("details:");
		lbldetails.setBounds(, , , );
		panel.add(lbldetails);
		
		tfdetails = new JTextField();
		tfdetails.setBounds(, , , );
		panel.add(tfdetails);
		tfdetails.setColumns(10);
		lblaccount = new JLabel("account:");
		lblaccount.setBounds(, , , );
		panel.add(lblaccount);
		
		tfaccount = new JTextField();
		tfaccount.setBounds(, , , );
		panel.add(tfaccount);
		tfaccount.setColumns(10);
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
				Date paid = tfpaid.getText();
				Real total = tftotal.getText();
				String details = tfdetails.getText();
				Account account = tfaccount.getText();
				Order order = tforder.getText();
				PaymentModel payment = new PaymentModel(String id, Date paid, Real total, String details, Account account, Order order);
				PaymentController.insert(payment);
				showPayment();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblPayment.getSelectedRow();
				if (selectedIndex >= 0) {
					PaymentModel payment = paymentLst.get(selectedIndex);
					PaymentController.delete(payment.getId());
					showPayment();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfid.setText("");
				tfpaid.setText("");
				tftotal.setText("");
				tfdetails.setText("");
				tfaccount.setText("");
				tforder.setText("");
			}
		});
	}
	public PaymentView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblPayment.getModel();
		showPayment();
	}
	
	private void showPayment() {
		paymentLst = PaymentController.findAll();
		
		tableModel.setRowCount(0);
		
		paymentLst.forEach((payment) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, payment.getId(), payment.getPaid(), payment.getTotal(), payment.getDetails(), payment.getAccount(), payment.getOrder()
		});
	}
	*/
}

