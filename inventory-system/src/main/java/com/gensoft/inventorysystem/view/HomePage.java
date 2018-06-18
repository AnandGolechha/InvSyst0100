package com.gensoft.inventorysystem.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;

public class HomePage {

	private JFrame frame;

	private String IMAGE_PATH="C:\\Users\\Jarves\\git\\InvSyst0100-1\\inventory-system\\Icon\\";
	
	private String TEXT_FONT="Comic Sans MS";
	
	private int MENU_ITEM_TEXT_FONT_STYLE=0;
	
	private int MENU_ITEM_TEXT_FONT_SIZE=17;
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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 700, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu fileMenu = new JMenu("");
		fileMenu.setFont(new Font(TEXT_FONT,MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		fileMenu.setBackground(Color.BLUE);
		fileMenu.setIcon(new ImageIcon(IMAGE_PATH+"drop-down1.png"));
		menuBar.add(fileMenu);
		
		JMenuItem fileMenuItem = new JMenuItem("New");
		fileMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		fileMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"new-file.jpg"));
		fileMenu.add(fileMenuItem);
		
		JMenuItem openMenuItem = new JMenuItem("Open");
		openMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		openMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"open-file.jpg"));
		fileMenu.add(openMenuItem);
		
		JMenuItem openFromServerMenuItem = new JMenuItem("Open From Server");
		openFromServerMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		openFromServerMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"open-file-server.jpg"));
		fileMenu.add(openFromServerMenuItem);
		
		JMenuItem loginMenuItem = new JMenuItem("Login");
		loginMenuItem.setFont(new Font(TEXT_FONT, MENU_ITEM_TEXT_FONT_STYLE, MENU_ITEM_TEXT_FONT_SIZE));
		loginMenuItem.setIcon(new ImageIcon(IMAGE_PATH+"login.jpg"));
		fileMenu.add(loginMenuItem);
	}

}
