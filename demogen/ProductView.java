package hnue.it.shoppingonline;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import hnue.it.shoppingonline.ProductModel;
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

public class ProductView extends JFrame {
	DefaultTableModel tableModel;
	private JLabel lblid;
	private JTextField tfid;
	private JLabel lblname;
	private JTextField tfname;
	private JLabel lblsupplier;
	private JTextField tfsupplier;
	private JLabel lbllineitem;
	private JTextField tflineitem;
	private JPanel contentPane;
	private JTable tblProduct;
	private JButton btnAdd;
	private JButton btnDelete; 
	private JButton btnReset;

	ArrayList<ProductModel> productLst = new ArrayList();
	
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
		tabbedPane.addTab("Product", null, panel, null);
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
		tblProduct = new JTable();
		
		tblProduct.setModel(new DefaultTableModel(
			new Object[][]  {
				{null, null, null, null, null},
			},
			new String[] {
				"id",
				"name",
				"supplier",
				"lineitem",
			}
		));
		scrollPane.setViewportView(tblProduct);
		lblid = new JLabel("id:");
		lblid.setBounds(, , , );
		panel.add(lblid);
		
		tfid = new JTextField();
		tfid.setBounds(, , , );
		panel.add(tfid);
		tfid.setColumns(10);
		lblname = new JLabel("name:");
		lblname.setBounds(, , , );
		panel.add(lblname);
		
		tfname = new JTextField();
		tfname.setBounds(, , , );
		panel.add(tfname);
		tfname.setColumns(10);
		lblsupplier = new JLabel("supplier:");
		lblsupplier.setBounds(, , , );
		panel.add(lblsupplier);
		
		tfsupplier = new JTextField();
		tfsupplier.setBounds(, , , );
		panel.add(tfsupplier);
		tfsupplier.setColumns(10);
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
				String id = tfid.getText();
				String name = tfname.getText();
				Supplier supplier = tfsupplier.getText();
				LineItem lineitem = tflineitem.getText();
				ProductModel product = new ProductModel(String id, String name, Supplier supplier, LineItem lineitem);
				ProductController.insert(product);
				showProduct();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = tblProduct.getSelectedRow();
				if (selectedIndex >= 0) {
					ProductModel product = productLst.get(selectedIndex);
					ProductController.delete(product.getId());
					showProduct();
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfid.setText("");
				tfname.setText("");
				tfsupplier.setText("");
				tflineitem.setText("");
			}
		});
	}
	public ProductView() {
		initComponents();
		addEvents();
		tableModel = (DefaultTableModel) tblProduct.getModel();
		showProduct();
	}
	
	private void showProduct() {
		productLst = ProductController.findAll();
		
		tableModel.setRowCount(0);
		
		productLst.forEach((product) -> {
			tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, product.getId(), product.getName(), product.getSupplier(), product.getLineitem()
		});
	}
	*/
}

