package iambread.hi.bye.display;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import iambread.hi.bye.input.*;
import iambread.hi.bye.listeners.*;
import iambread.hi.bye.helper.*;

public class Display extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static JTextField tf;
	private JButton btn;
	private JLabel lbl1;
	private JLabel lbl3;
	private JPanel panel;
	private static JButton editor;
	private JComboBox<String> box;
	Color dark_grey = new Color(76, 85, 91);
	
	public static String userHomeFolder = System.getProperty("user.home");
	public static String[] filename = {userHomeFolder + "/Hoe-jar-res/peeples", userHomeFolder + "/Hoe-jar-res/custom"};
	public static String[] name1 = {"Default", "Custom"};
	public static String[] name2 = {"Custom", "Default"};
	public static Scanner fileScanner;
	public static File settings = new File(userHomeFolder + "/Hoe-jar-res/settings.txt");

	public static Set<String> hashbrowns;
	public static ArrayList<String> temp;
	public static ArrayList<String> peeple;
	public static ArrayList<String> numbers;
	public static ArrayList<Integer> mood;
	
	public static String txt;
	public static String SassFactor;
	public static boolean chfl = false;
	
	public static Actions ac = new Actions();
	static FileEditorWindow few = new FileEditorWindow();
	static Keyboard keyboard = new Keyboard();

	public Display(String title) {
		super(title);
		panel = new GraphicsDisplay();
		
		lbl1 = new JLabel("Name: ");
		lbl1.setForeground(dark_grey);
		panel.add(lbl1);
		
		tf = new JTextField("", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		tf.addKeyListener(keyboard);
		panel.add(tf);
		
		btn = new JButton("Submit");
		btn.addActionListener(this);
		panel.add(btn);
		
		lbl3 = new JLabel("Choose a library:");
		lbl3.setForeground(dark_grey);
		panel.add(lbl3);
		
		editor = new JButton("Open Editor");
		editor.addActionListener(this);
		
		if(LoadSettings.filechosen == 0) {
			box = new JComboBox<String>(name1);
		} else {
			box = new JComboBox<String>(name2);
		}
	
		box.addItemListener(
			new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					if(event.getStateChange() == ItemEvent.SELECTED) {
						if(box.getSelectedIndex() == LoadSettings.filechosen) {
							BoxListener.boxListener();
							if (LoadSettings.filechosen == 1) {
								panel.add(editor);
								lbl3.setText("Choose a Library:");
							} else {
								panel.remove(editor);
								FileEditorWindow.few.dispose();
								lbl3.setText("Choose a Library:");
							}
						} else if (box.getSelectedIndex() != LoadSettings.filechosen) {
							BoxListener.boxListener();
							if (LoadSettings.filechosen == 1) {
								panel.add(editor);
								lbl3.setText("Choose a Library:");
							} else {
								panel.remove(editor);
								FileEditorWindow.few.dispose();
								lbl3.setText("Choose a Library:");
							}
						}
					}}});
		panel.add(box);		
		
		if (LoadSettings.filechosen == 1) {
			panel.add(editor);
			lbl3.setText("Choose a Library:");
		}
		
		add(panel);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) ac.onClick(tf);		
		if(e.getSource() == editor) few.onClick();
	}
	
}