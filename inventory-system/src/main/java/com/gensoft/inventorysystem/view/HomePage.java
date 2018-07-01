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
import java.awt.Cursor;
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
import javax.swing.JSlider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * This class is used for home page design.
 * @author Kaushik Udavant
 *
 */
public class HomePage {

	private static final JMenuItem JButton = null;

	private JFrame frame;

	private String IMAGE_PATH="C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\";
	
	private String HOME_BUTTON_IMAGE_PATH="C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\Home Menu Icon";
	
	private String REPORTS_BUTTON_IMAGE_PATH="C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\reports icon";
	
	private String OTHERS_BUTTON_IMAGE_PATH="C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\others icon";

	
	private String TEXT_FONT="Comic Sans MS";
	
	private int MENU_ITEM_TEXT_FONT_STYLE=0;
	
	private int MENU_ITEM_TEXT_FONT_SIZE=17;
	
	private int BUTTON_TEXT_FONT_STYLE=0;
	
	private int BUTTON_TEXT_FONT_SIZE=17;
	
	private int HOME_BUTTON_HIEGHT=50;
	
	private int HOME_BUTTON_WIDTH=50;
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
		
		JMenu showFilesMenu = new JMenu("");
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
		/*final JPopupMenu popupMenu = new JPopupMenu();
		addPopup(homePanel, popupMenu);
		popupMenu.setLabel("");
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Notification");
		mntmNewMenuItem.setBackground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("GST Extract");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		popupMenu.add(mntmNewMenuItem_1);*/
		
		
		
		JPanel homeButtonPanel = new JPanel();
		homeButtonPanel.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) homeButtonPanel.getLayout();
		flowLayout.setHgap(0);
		homeButtonPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Home", TitledBorder.CENTER, TitledBorder.BOTTOM, null, SystemColor.desktop));
		homeButtonPanel.setFont(new Font(TEXT_FONT,MENU_ITEM_TEXT_FONT_STYLE,MENU_ITEM_TEXT_FONT_SIZE));
		homeButtonPanel.setOpaque(true);	
		
		homePanel.add(homeButtonPanel);
		
		JButton homeButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\home.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		homeButtonPanel.add(homeButton);

		
		JPanel purchasePanel = new JPanel();
		purchasePanel.setBackground(Color.WHITE);
		purchasePanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Purchase", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		homePanel.add(purchasePanel);
		
		JButton purchaseButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\purchase.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		purchasePanel.add(purchaseButton);
		
		JPanel salePanel = new JPanel();
		salePanel.setBackground(Color.WHITE);
		salePanel.setBorder(new TitledBorder(null, "Sale", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(salePanel);
		
		JButton saleButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\sale.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		salePanel.add(saleButton);
		
		JPanel voucherPanel = new JPanel();
		voucherPanel.setBackground(Color.WHITE);
		voucherPanel.setBorder(new TitledBorder(null, "Voucher", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(voucherPanel);
		
		JButton voucherButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\voucher.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		voucherPanel.add(voucherButton);
		
		JPanel inventoryPanel = new JPanel();
		inventoryPanel.setBackground(Color.WHITE);
		inventoryPanel.setBorder(new TitledBorder(null, "inventory", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(inventoryPanel);
		
		JButton stockJournalButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\stock-journal.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		inventoryPanel.add(stockJournalButton);
		
		JButton stockVerificationButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\stock-verification.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		stockVerificationButton.setBackground(Color.WHITE);
		inventoryPanel.add(stockVerificationButton);
		
	 
		JButton productDetailsButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\product-details.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		productDetailsButton.setBackground(Color.WHITE);
		inventoryPanel.add(productDetailsButton);
		
		JPanel buttonSpliterPanel = new JPanel();
		inventoryPanel.add(buttonSpliterPanel);
		buttonSpliterPanel.setLayout(new GridLayout(0, 1, 5, 0));
		
		
		JButton groupDetailsButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\group-details.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, 30, java.awt.Image.SCALE_SMOOTH)));
		groupDetailsButton.setBackground(Color.WHITE);
		buttonSpliterPanel.add(groupDetailsButton);
		
		JButton unitDetailsButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\unit-details.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, 30, java.awt.Image.SCALE_SMOOTH)));
		buttonSpliterPanel.add(unitDetailsButton);
		
		JPanel accountPanel = new JPanel();
		accountPanel.setBackground(Color.WHITE);
		accountPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Account", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		homePanel.add(accountPanel);
		
		
		JButton suppliersButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\suppliers.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		accountPanel.add(suppliersButton);
		
		JButton customersButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\customers.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		accountPanel.add(customersButton);
		
		
		JButton accountsButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\accounts.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		accountsButton.setBackground(Color.WHITE);
		
		accountPanel.add(accountsButton);
		
		
		
		JButton brokersButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\broker.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		accountPanel.add(brokersButton);
		
		
		JButton coupenButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\coupen.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		
		accountPanel.add(coupenButton);
		
		JPanel estimationPanel = new JPanel();
		estimationPanel.setBackground(Color.WHITE);
		estimationPanel.setBorder(new TitledBorder(null, "Others", TitledBorder.CENTER, TitledBorder.BOTTOM, null, null));
		homePanel.add(estimationPanel);
		

		JButton estimationButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\estimation.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		estimationPanel.add(estimationButton);
		
		JPanel settingPanel = new JPanel();
		settingPanel.setBackground(Color.WHITE);
		settingPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Settings", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		homePanel.add(settingPanel);
		
	
		JButton settingButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\settings.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		settingPanel.add(settingButton);
		
		
		JButton aboutAppButton = new JButton(new ImageIcon(((new ImageIcon(HOME_BUTTON_IMAGE_PATH+"\\about-app.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
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
		
		JPanel centralPurchasePanel = new JPanel();
		frame.getContentPane().add(centralPurchasePanel, BorderLayout.CENTER);
		
		taskInternalFrame.setVisible(true);
				
		reportsTabPanel();
	}
private void reportsTabPanel() {
		
		JPanel reportsPanel = new JPanel();
		reportsPanel.setBackground(Color.WHITE);
		homeTabbedPane.addTab("Reports", null, reportsPanel, null);
		
		JPanel inventoryPanel = new JPanel();
		inventoryPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Inventory", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		inventoryPanel.setBackground(Color.WHITE);
		reportsPanel.add(inventoryPanel);
		
		
		JButton stockBookButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\stock-book.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		inventoryPanel.add(stockBookButton);
		stockBookButton.setBackground(Color.WHITE);
		stockBookButton.setOpaque(true);
		
				
		JButton InvoiceButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\invoice.png")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		inventoryPanel.add(InvoiceButton);
		InvoiceButton.setBackground(Color.WHITE);
		InvoiceButton.setOpaque(true);
		
		JPanel Inventory = new JPanel();
		Inventory.setBackground(Color.WHITE);
		inventoryPanel.add(Inventory);
		Inventory.setLayout(new GridLayout(0, 1, 5, 5));
		
		
		JButton MonthlyButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\monthly.jfif")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		MonthlyButton.setText("Monthly");
		Inventory.add(MonthlyButton);
		MonthlyButton.setBackground(Color.WHITE);
		MonthlyButton.setOpaque(true);
		
		
		JButton Summary = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\summary.png")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		Summary.setText("Summary");
		Inventory.add(Summary);
		Summary.setBackground(Color.WHITE);
		Summary.setOpaque(true);
		
		
		JButton expiryAgingButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\expiry-aging.jfif")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		expiryAgingButton.setText("Expiry Aging");
		Inventory.add(expiryAgingButton);
		expiryAgingButton.setBackground(Color.WHITE);
		expiryAgingButton.setOpaque(true);
		
		
		JButton stockJournalButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\stock-journal.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		inventoryPanel.add(stockJournalButton);
		expiryAgingButton.setBackground(Color.WHITE);
		expiryAgingButton.setOpaque(true);
		
		JPanel Accountpanel = new JPanel();
		Accountpanel.setBorder(new TitledBorder(null, "Accounts", TitledBorder.CENTER, TitledBorder.BOTTOM, null, Color.BLACK));
		Accountpanel.setBackground(Color.WHITE);
		reportsPanel.add(Accountpanel);
		Accountpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton generalLedgerButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\general-ledger.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT,HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		Accountpanel.add(generalLedgerButton);
		generalLedgerButton.setBackground(Color.WHITE);
		generalLedgerButton.setOpaque(true);
		
		JPanel panel = new JPanel();
		Accountpanel.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		JButton taxReportButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\tax-report.png")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		panel.add(taxReportButton);
		taxReportButton.setText("Tax Report");
		taxReportButton.setBackground(Color.WHITE);
		taxReportButton.setOpaque(true);
		
		
		JButton trialBalanceButtton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\trial-balance.png")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		panel.add(trialBalanceButtton);
		trialBalanceButtton.setText("Trial Balance ");
		trialBalanceButtton.setBackground(Color.WHITE);
		trialBalanceButtton.setOpaque(true);
		
		
		JButton dueBillsButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\due-bills.jfif")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		panel.add(dueBillsButton);
		dueBillsButton.setText("Due Bills");
		dueBillsButton.setBackground(Color.WHITE);
		dueBillsButton.setOpaque(true);
		
		JPanel panel_1 = new JPanel();
		Accountpanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		JButton profitLossButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\profit-loss.jfif")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		panel_1.add(profitLossButton);
		profitLossButton.setText("Profit & Loss");
		profitLossButton.setBackground(Color.WHITE);
		profitLossButton.setOpaque(true);
		
		
		JButton brokerageReportButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\brokerage-report.png")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		panel_1.add(brokerageReportButton);
		brokerageReportButton.setText("Brokerage Report");
		brokerageReportButton.setBackground(Color.WHITE);
		brokerageReportButton.setOpaque(true);
		
		
		JButton balanceSheetButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\balance-sheet.jfif")).getImage()).getScaledInstance(15, 25, java.awt.Image.SCALE_SMOOTH)));
		panel_1.add(balanceSheetButton);
		balanceSheetButton.setText("Balance Sheet");
		balanceSheetButton.setBackground(Color.WHITE);
		balanceSheetButton.setOpaque(true);
	
		
		JPanel otherspanel = new JPanel();
		otherspanel.setBorder(new TitledBorder(null, "Others", TitledBorder.CENTER, TitledBorder.BOTTOM, null, Color.BLACK));
		otherspanel.setBackground(Color.WHITE);
		reportsPanel.add(otherspanel);
		FlowLayout fl_otherspanel = new FlowLayout(FlowLayout.CENTER, 5, 5);
		fl_otherspanel.setAlignOnBaseline(true);
		otherspanel.setLayout(fl_otherspanel);
		
		
		JButton analyzeButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\Analyze.jpg")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		otherspanel.add(analyzeButton);
		analyzeButton.setBackground(Color.WHITE);
		analyzeButton.setOpaque(true);
		
		
		JButton others = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\others.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT, HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		otherspanel.add(others);
		others.setBackground(Color.WHITE);
		others.setOpaque(true);
		
		
		JButton barcodeLabelButton = new JButton(new ImageIcon(((new ImageIcon(REPORTS_BUTTON_IMAGE_PATH+"\\barcode.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT,HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		otherspanel.add(barcodeLabelButton);
		barcodeLabelButton.setBackground(Color.WHITE);
		barcodeLabelButton.setOpaque(true);
		
		JPanel panel_2 = new JPanel();
		otherspanel.add(panel_2);
		
		JPopupMenu otherspopupMenu = new JPopupMenu();
		panel_2.add(otherspopupMenu);
		otherspopupMenu.setBackground(Color.WHITE);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Counter Sales Report");
		panel_2.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Estimation Report");
		panel_2.add(mntmNewMenuItem_1);
		
		
		JPanel Other = new JPanel();
		reportsPanel.add(Other);
		Other.setLayout(new GridLayout(3, 1, 5, 5));
		
		othersTabPanel();
		}
	
	private void othersTabPanel(){
		
		
		JPanel othersPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) othersPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		othersPanel.setBackground(Color.WHITE);
		homeTabbedPane.addTab("Others", null, othersPanel, null);
		
		JPanel securitySettingspanel = new JPanel();
		securitySettingspanel.setBorder(new TitledBorder(null, "Security Settings", TitledBorder.CENTER, TitledBorder.BOTTOM, null, Color.BLACK));
		securitySettingspanel.setBackground(Color.WHITE);
		othersPanel.add(securitySettingspanel);
		securitySettingspanel.setLayout(new GridLayout(1, 2, 5, 5));
		
		
		JButton usersButton = new JButton(new ImageIcon(((new ImageIcon(OTHERS_BUTTON_IMAGE_PATH+"\\users.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT,HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		securitySettingspanel.add(usersButton);
		usersButton.setBackground(Color.WHITE);
		usersButton.setOpaque(true);
		
		
		
		JButton changePasswordButton = new JButton(new ImageIcon(((new ImageIcon(OTHERS_BUTTON_IMAGE_PATH+"\\password-change.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT,HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		securitySettingspanel.add(changePasswordButton);
		usersButton.setBackground(Color.WHITE);
		usersButton.setOpaque(true);
		
		JPanel otherspanel = new JPanel();
		otherspanel.setBackground(Color.WHITE);
		otherspanel.setBorder(new TitledBorder(null, "Others", TitledBorder.CENTER, TitledBorder.BOTTOM, null, Color.BLACK));
		othersPanel.add(otherspanel);
		otherspanel.setLayout(new GridLayout(1, 2, 5, 5));
		
		
		JButton languageButton = new JButton(new ImageIcon(((new ImageIcon(OTHERS_BUTTON_IMAGE_PATH+"\\language.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT,HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		otherspanel.add(languageButton);
		languageButton.setBackground(Color.WHITE);
		languageButton.setOpaque(true);
		
		
		JButton themeButton = new JButton(new ImageIcon(((new ImageIcon(OTHERS_BUTTON_IMAGE_PATH+"\\theme.jfif")).getImage()).getScaledInstance(HOME_BUTTON_HIEGHT,HOME_BUTTON_WIDTH, java.awt.Image.SCALE_SMOOTH)));
		themeButton.setHorizontalAlignment(SwingConstants.LEFT);
		otherspanel.add(themeButton);
		themeButton.setBackground(Color.WHITE);
		themeButton.setOpaque(true);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
