package com.gensoft.inventorysystem.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.Box;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JPopupMenu;

/**
 * This class is used for home page design.
 * @author Kaushik Udavant
 *
 */
public class HomePage {

	private static final JMenuItem JButton = null;

	private JFrame frame;

	private String IMAGE_PATH="C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\";
	
	private String TEXT_FONT="Comic Sans MS";
	
	private int MENU_ITEM_TEXT_FONT_STYLE=0;
	
	private int MENU_ITEM_TEXT_FONT_SIZE=17;
	
	private int BUTTON_TEXT_FONT_STYLE=0;
	
	private int BUTTON_TEXT_FONT_SIZE=17;
	JTabbedPane homeTabbedPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1900, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JMenuBar homeMenuBar = new JMenuBar();
		panel.add(homeMenuBar, BorderLayout.NORTH);
		homeMenuBar.setBorderPainted(false);
		
		JMenu showFilesMenu = new JMenu("sdcnsjkvnsdns");
		showFilesMenu.setBackground(Color.BLUE);
		showFilesMenu.setForeground(Color.BLUE);
		
		showFilesMenu.setIcon(new ImageIcon(IMAGE_PATH+"drop-down1.png"));
		homeMenuBar.add(showFilesMenu);
		showFilesMenu.setHorizontalAlignment(SwingConstants.CENTER);
		
		JMenuItem fileMenuItem = new JMenuItem("New");
		showFilesMenu.add(fileMenuItem);
		fileMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		fileMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"new-file.jpg"));
		
		JMenuItem openMenuItem = new JMenuItem("Open");
		showFilesMenu.add(openMenuItem);
		openMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		openMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"open-file.jpg"));
		
		JMenuItem openFromServerMenuItem = new JMenuItem("Open From Server");
		showFilesMenu.add(openFromServerMenuItem);
		openFromServerMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		openFromServerMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"open-file-server.jpg"));
		
		JMenuItem loginMenuItem = new JMenuItem("Login");
		showFilesMenu.add(loginMenuItem);
		loginMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		loginMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"login.jpg"));
		
		homeTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		homeTabbedPane.setBackground(Color.WHITE);
		homeTabbedPane.setToolTipText("Home");
		
		JPanel homePanel = new JPanel();
		homePanel.setBackground(Color.WHITE);
		homeTabbedPane.addTab("Home", null, homePanel, null);
		homeTabbedPane.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		homePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel homeButtonPanel = new JPanel();
		homeButtonPanel.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) homeButtonPanel.getLayout();
		flowLayout.setHgap(0);
		homeButtonPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Home", TitledBorder.CENTER, TitledBorder.BOTTOM, null, SystemColor.desktop));
		homeButtonPanel.setFont(new Font(TEXT_FONT,MENU_ITEM_TEXT_FONT_STYLE,MENU_ITEM_TEXT_FONT_SIZE));
		homeButtonPanel.setOpaque(true);	
		homePanel.add(homeButtonPanel);
		
		JButton homeButton = new JButton("");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		homeButton.setBackground(SystemColor.activeCaption);
		homeButtonPanel.add(homeButton);
		homeButton.setAlignmentY(2.0f);
		homeButton.setAlignmentX(2.0f);
		
		homeButton.setIcon(new ImageIcon("C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\home.png"));
		homeButton.setVerticalAlignment(SwingConstants.TOP);
		homeButton.setFont(new Font(TEXT_FONT, BUTTON_TEXT_FONT_STYLE,BUTTON_TEXT_FONT_SIZE ));
		
		JPanel purchasePanel = new JPanel();
		purchasePanel.setBackground(Color.WHITE);
		purchasePanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Purchase", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		homePanel.add(purchasePanel);
		
		JButton purchaseButton = new JButton("");
		purchasePanel.add(purchaseButton);
		purchaseButton.setAlignmentY(5.0f);
		purchaseButton.setAlignmentX(5.0f);
		purchaseButton.setIcon(new ImageIcon(IMAGE_PATH+"purchase.png"));
		
		JPanel salePanel = new JPanel();
		salePanel.setBorder(new TitledBorder(null, "Sale", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(salePanel);
		
		JButton saleButton = new JButton("Sale");
		saleButton.setIcon(new ImageIcon("C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\new-file.jpg"));
		salePanel.add(saleButton);
		
		JPanel voucherPanel = new JPanel();
		voucherPanel.setBorder(new TitledBorder(null, "Voucher", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(voucherPanel);
		
		JButton voucherButton = new JButton("Voucher");
		voucherPanel.add(voucherButton);
		
		JPanel inventoryPanel = new JPanel();
		inventoryPanel.setBorder(new TitledBorder(null, "inventory", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(inventoryPanel);
		
		JButton stockJournalButton = new JButton("Stock Journal");
		inventoryPanel.add(stockJournalButton);
		
		JButton stockVerificationButton = new JButton("Stock Verification");
		inventoryPanel.add(stockVerificationButton);
		
		JButton productDetailsButton = new JButton("Product Detail");
		inventoryPanel.add(productDetailsButton);
		
		JPanel buttonSpliterPanel = new JPanel();
		inventoryPanel.add(buttonSpliterPanel);
		buttonSpliterPanel.setLayout(new GridLayout(0, 1, 5, 8));
		
		JButton groupDetailsButton = new JButton("Grouo Details");
		buttonSpliterPanel.add(groupDetailsButton);
		
		JButton unitDetailsButton = new JButton("Unit Details");
		buttonSpliterPanel.add(unitDetailsButton);
		
		JPanel accountPanel = new JPanel();
		accountPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Account", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		homePanel.add(accountPanel);
		
		JButton suppliersButton = new JButton("Suppliers");
		accountPanel.add(suppliersButton);
		
		JButton customersButton = new JButton("Customers");
		accountPanel.add(customersButton);
		
		JButton accountsButton = new JButton("Accounts");
		accountPanel.add(accountsButton);
		
		JButton brokersButton = new JButton("Brokers");
		accountPanel.add(brokersButton);
		
		JButton coupenButton = new JButton("Coupen");
		accountPanel.add(coupenButton);
		
		JPanel estimationPanel = new JPanel();
		estimationPanel.setBorder(new TitledBorder(null, "Others", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(estimationPanel);
		
		JButton estimationButton = new JButton("Estimation");
		estimationPanel.add(estimationButton);
		
		JPanel settingPanel = new JPanel();
		settingPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Settings", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		homePanel.add(settingPanel);
		
		JButton settingButton = new JButton("Settings");
		settingPanel.add(settingButton);
		
		JPanel otherMenuPanel = new JPanel();
		settingPanel.add(otherMenuPanel);
		otherMenuPanel.setLayout(new GridLayout(0, 1, 5, 5));
		
		JButton notificationsButton = new JButton("Notifications");
		otherMenuPanel.add(notificationsButton);
		
		JButton gstExtractButton = new JButton("GST Extract");
		otherMenuPanel.add(gstExtractButton);
		
		JButton aboutAppButton = new JButton("About APP");
		settingPanel.add(aboutAppButton);
		panel.add(homeTabbedPane);
		
		JInternalFrame taskInternalFrame = new JInternalFrame("Tasks");
		taskInternalFrame.getContentPane().setBackground(SystemColor.controlLtHighlight);
		taskInternalFrame.setBackground(SystemColor.textHighlightText);
		//taskInternalFrame.setIcon(true);
		taskInternalFrame.setSize(200, 400);
		taskInternalFrame.setFrameIcon(new ImageIcon(IMAGE_PATH+"new-file.jpg"));
		frame.getContentPane().add(taskInternalFrame, BorderLayout.WEST);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(SystemColor.text);
		taskInternalFrame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"20-12-2018"}));
		panel_1.add(comboBox);
		panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{comboBox}));
		taskInternalFrame.setVisible(true);
				
		reportsTabPanel();
	}
private void reportsTabPanel() {
		
		JPanel reportsPanel = new JPanel();
		reportsPanel.setBackground(Color.WHITE);
		homeTabbedPane.addTab("Reports", null, reportsPanel, null);
		
		JButton stockBookButton = new JButton("Stock Book");
		stockBookButton.setIcon(new ImageIcon(IMAGE_PATH+"Stock Book.jpg"));
		reportsPanel.add(stockBookButton);
		
		JButton InvoiceButton = new JButton("Invoice");
		InvoiceButton.setIcon(new ImageIcon(IMAGE_PATH+"Invoice.png"));
		reportsPanel.add(InvoiceButton);
		
		JPanel Inventory = new JPanel();
		reportsPanel.add(Inventory);
		Inventory.setLayout(new GridLayout(0, 1, 5, 5));
		
		JButton MonthlyButton = new JButton("Monthly");
		MonthlyButton.setIcon(new ImageIcon(IMAGE_PATH+"Monthaly.jpg"));
		Inventory.add(MonthlyButton);
		
		JButton Summary = new JButton("Summary");
		Summary.setIcon(new ImageIcon(IMAGE_PATH+"Summary.png"));
		Inventory.add(Summary);
		
		JButton expiryAgingButton = new JButton("Expiry Aging");
		expiryAgingButton.setIcon(new ImageIcon(IMAGE_PATH+"ExpiryAging.jpg"));
		Inventory.add(expiryAgingButton);
		
		JButton stockJournalButton = new JButton("Stock Journal");
		stockJournalButton.setIcon(new ImageIcon(IMAGE_PATH+"Stock.png"));
		reportsPanel.add(stockJournalButton);
		
		JButton generalLedgerButton = new JButton("General Ledger");
		generalLedgerButton.setIcon(new ImageIcon(IMAGE_PATH+"GeneralLedger.jpg"));
		reportsPanel.add(generalLedgerButton);
		
		JPanel Account = new JPanel();
		reportsPanel.add(Account);
		Account.setLayout(new GridLayout(3, 2, 5, 5));
		
		JButton taxReportButton = new JButton("Tax Report");
		taxReportButton.setIcon(new ImageIcon(IMAGE_PATH+"TaxReport.jpg"));
		Account.add(taxReportButton);
		
		JButton trialBalanceButtton = new JButton("Trial Balance");
		trialBalanceButtton.setIcon(new ImageIcon(IMAGE_PATH+"BrokerageReport.png"));
		Account.add(trialBalanceButtton);
		
		JButton dueBillsButton = new JButton("Due BIlls");
		dueBillsButton.setIcon(new ImageIcon(IMAGE_PATH+"DueBills.jpg"));
		Account.add(dueBillsButton);
		
		JButton profitLossButton = new JButton("Profit & Loss");
		profitLossButton.setIcon(new ImageIcon(IMAGE_PATH+"ProfitLoss.jpg"));
		Account.add(profitLossButton);
		
		JButton brokerageReportButton = new JButton("Brokerage Report");
		brokerageReportButton.setIcon(new ImageIcon(IMAGE_PATH+"BrokerageReport.png"));
		Account.add(brokerageReportButton);
		
		JButton balanceSheetButton = new JButton("Balance Sheet");
		balanceSheetButton.setIcon(new ImageIcon(IMAGE_PATH+"BalanceSheet.jpg"));
		
		Account.add(balanceSheetButton);
		
		JButton barcodeLabelButton = new JButton("Barcode Button");
		barcodeLabelButton.setIcon(new ImageIcon(IMAGE_PATH+"BarcodeButton.jpg"));
		reportsPanel.add(barcodeLabelButton);
		
		JButton Analyze = new JButton("Analyze");
		Analyze.setIcon(new ImageIcon(IMAGE_PATH+"Analyze.jpg"));
		reportsPanel.add(Analyze);
		
		JPanel Other = new JPanel();
		reportsPanel.add(Other);
		Other.setLayout(new GridLayout(3, 1, 5, 5));
		
		JButton Others = new JButton("Others");
		Others.setIcon(new ImageIcon(IMAGE_PATH+"Others.jpg"));
		reportsPanel.add(Others);
		
		JButton counterSalesExtractButton = new JButton("Counetr Sales Extract");
		counterSalesExtractButton.setIcon(new ImageIcon(IMAGE_PATH+"ctrsalesreport.png"));
		reportsPanel.add(counterSalesExtractButton);
		
		JButton estimationReportButton = new JButton("Estimation Report");
		estimationReportButton.setIcon(new ImageIcon(IMAGE_PATH+"estimationreport.png"));
		reportsPanel.add(estimationReportButton);
		
		othersTabPanel();
		}
	
	private void othersTabPanel(){
		
		JPanel othersTabPanel = new JPanel();
		homeTabbedPane.addTab("Others", (Icon) null, othersTabPanel, null);
		othersTabPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JPanel securitySettingspanel = new JPanel();
		othersTabPanel.add(securitySettingspanel);
		securitySettingspanel.setLayout(new GridLayout(1, 2, 5, 5));
		
		JButton changePasswordButton = new JButton("Change Password ");
		changePasswordButton.setIcon(new ImageIcon(IMAGE_PATH+"changepass.jpg"));
		othersTabPanel.add(changePasswordButton);
		
		JButton usersButton = new JButton("Users");
		usersButton.setIcon(new ImageIcon(IMAGE_PATH+"users.jpg"));
		othersTabPanel.add(usersButton);
		
		JPanel otherspanel = new JPanel();
		othersTabPanel.add(otherspanel);
		otherspanel.setLayout(new GridLayout(1, 2, 5, 5));
		
		JButton languageButton = new JButton("Language");
		languageButton.setIcon(new ImageIcon(IMAGE_PATH+"languages.jpg"));
		otherspanel.add(languageButton);
		
		JButton themeButton = new JButton("Theme");
		themeButton.setIcon(new ImageIcon(IMAGE_PATH+"theme.jpg"));
		otherspanel.add(themeButton);
		
	}
}
