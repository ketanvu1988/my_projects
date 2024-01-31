package billing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.CardLayout;

public class billing extends JFrame {

	private JPanel contentPane;
	private JTextField cnametext;
	private JTextField cnameMobno;
	private JTextField cemailtext;
	private JTextField origin;
	private JTextField destination;
	private JTextField via;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billing frame = new billing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		contentPane.add(panel, "name_705970011584800");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel name = new JLabel("Billing System");
		name.setFont(new Font("Tahoma", Font.BOLD, 17));
		name.setBackground(new Color(255, 128, 64));
		contentPane.add(name, "name_705970019790200");
		
		JLabel cname = new JLabel("Name");
		contentPane.add(cname, "name_705970027823500");
		
		cnametext = new JTextField();
		contentPane.add(cnametext, "name_705970036097600");
		cnametext.setColumns(10);
		
		JLabel cmob_no = new JLabel("Mobile No.");
		contentPane.add(cmob_no, "name_705970048581100");
		
		cnameMobno = new JTextField();
		contentPane.add(cnameMobno, "name_705970057117900");
		cnameMobno.setColumns(10);
		
		JLabel cAddress = new JLabel("Address");
		contentPane.add(cAddress, "name_705970065377800");
		
		JTextArea caddresstext = new JTextArea();
		contentPane.add(caddresstext, "name_705970073327000");
		
		JLabel lblNewLabel = new JLabel("Email");
		contentPane.add(lblNewLabel, "name_705970086630400");
		
		cemailtext = new JTextField();
		cemailtext.setColumns(10);
		contentPane.add(cemailtext, "name_705970099617000");
		
		JLabel lblOrigin = new JLabel("Origin");
		contentPane.add(lblOrigin, "name_705970112666300");
		
		origin = new JTextField();
		contentPane.add(origin, "name_705970125490400");
		origin.setColumns(10);
		
		JLabel lblDestination = new JLabel("Destination");
		contentPane.add(lblDestination, "name_705970138491200");
		
		destination = new JTextField();
		destination.setColumns(10);
		contentPane.add(destination, "name_705970151218600");
		
		JLabel lblVia = new JLabel("via");
		contentPane.add(lblVia, "name_705970163512100");
		
		via = new JTextField();
		via.setColumns(10);
		contentPane.add(via, "name_705970176070600");
		
		JLabel lblNewLabel_1 = new JLabel("Start Date");
		contentPane.add(lblNewLabel_1, "name_705970188670200");
		
		textField = new JTextField();
		textField.setColumns(10);
		contentPane.add(textField, "name_705970200952500");
		
		JLabel lblNewLabel_1_1 = new JLabel("End Date");
		contentPane.add(lblNewLabel_1_1, "name_705970213699500");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		contentPane.add(textField_1, "name_705970225826800");
		
		JLabel lblNewLabel_1_2 = new JLabel("Start Time");
		contentPane.add(lblNewLabel_1_2, "name_705970238147800");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2, "name_705970250765700");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("End Time");
		contentPane.add(lblNewLabel_1_2_1, "name_705970263562800");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3, "name_705970276325500");
		
		JLabel lblNewLabel_2 = new JLabel("Seat Capacity");
		contentPane.add(lblNewLabel_2, "name_705970288883200");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		contentPane.add(textField_4, "name_705970297404100");
		
		JLabel lblNewLabel_2_1 = new JLabel("Toll Tax");
		contentPane.add(lblNewLabel_2_1, "name_705970306512200");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		contentPane.add(textField_5, "name_705970316196600");
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Driver Charges");
		contentPane.add(lblNewLabel_2_1_1, "name_705970325923500");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		contentPane.add(textField_6, "name_705970335765000");
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Total Payment");
		contentPane.add(lblNewLabel_2_1_1_1, "name_705970345284400");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		contentPane.add(textField_7, "name_705970354926500");
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Adv. Payment");
		contentPane.add(lblNewLabel_2_1_1_1_1, "name_705970364462200");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		contentPane.add(textField_8, "name_705970374008600");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_705970383617900");
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Rem. Payment");
		contentPane.add(lblNewLabel_2_1_1_1_1_1, "name_705970392360400");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		contentPane.add(textField_9, "name_705970401020300");

		jai shree ram
	}
}
