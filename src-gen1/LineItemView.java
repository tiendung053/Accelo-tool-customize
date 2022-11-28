package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.LineItemModel;
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

public class LineItemView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lblquantity;
	private JTextField tfquantity;
	private JLabel lblprice;
	private JTextField tfprice;
	private JLabel lblorder;
	private JTextField tforder;
	private JLabel lblshoppingcart;
	private JTextField tfshoppingcart;
	private JLabel lblproduct;
	private JTextField tfproduct;
	private JPanel contentPane;
	private JTable tblLineItem;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<LineItemModel> lineitemLst = new ArrayList();
	
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
		tabbedPane.addTab("LineItem", null, panel, null);
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
		tblLineItem = new JTable();
		
		tblLineItem.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"quantity",
				"price",
				"order",
				"shoppingcart",
				"product",
			}
		));
		scrollPane.setViewportView(tblLineItem);
		lblquantity = new JLabel("quantity:");
		lblquantity.setBounds(, , , );
		panel.add(lblquantity);
		
		tfquantity = new JTextField();
		tfquantity.setBounds(, , , );
		panel.add(tfquantity);
		tfquantity.setColumns(10);
		lblprice = new JLabel("price:");
		lblprice.setBounds(, , , );
		panel.add(lblprice);
		
		tfprice = new JTextField();
		tfprice.setBounds(, , , );
		panel.add(tfprice);
		tfprice.setColumns(10);
		lblorder = new JLabel("order:");
		lblorder.setBounds(, , , );
		panel.add(lblorder);
		
		tforder = new JTextField();
		tforder.setBounds(, , , );
		panel.add(tforder);
		tforder.setColumns(10);
		lblshoppingcart = new JLabel("shoppingcart:");
		lblshoppingcart.setBounds(, , , );
		panel.add(lblshoppingcart);
		
		tfshoppingcart = new JTextField();
		tfshoppingcart.setBounds(, , , );
		panel.add(tfshoppingcart);
		tfshoppingcart.setColumns(10);
		lblproduct = new JLabel("product:");
		lblproduct.setBounds(, , , );
		panel.add(lblproduct);
		
		tfproduct = new JTextField();
		tfproduct.setBounds(, , , );
		panel.add(tfproduct);
		tfproduct.setColumns(10);

	}
	/*private void addEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantity = tfquantity.getText();
				Price price = tfprice.getText();
				Order order = tforder.getText();
				ShoppingCart shoppingcart = tfshoppingcart.getText();
				Product product = tfproduct.getText();
				LineItemModel lineitem = new LineItemModel(int quantity, Price price, Order order, ShoppingCart shoppingcart, Product product);
				LineItemController.insert(lineitem);
				showLineItem();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblLineItem.getSelectedRow();
				if (selectedIndex >= 0) {
					LineItemModel lineitem = lineitemLst.get(selectedIndex);
					LineItemController.delete(lineitem.getId());
					showLineItem();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfquantity.setText("");
				tfprice.setText("");
				tforder.setText("");
				tfshoppingcart.setText("");
				tfproduct.setText("");
			}
		});
	}
	public LineItemView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblLineItem.getModel();
		showLineItem();
	}
	
	private void showLineItem() {
		lineitemLst = LineItemController.findAll();
		
		tableModel.setRowCount(0);
		
		lineitemLst.forEach((lineitem) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, lineitem.getQuantity(), lineitem.getPrice(), lineitem.getOrder(), lineitem.getShoppingcart(), lineitem.getProduct()
		});
	}
	*/
}

