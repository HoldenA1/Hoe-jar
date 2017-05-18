package iambread.hi.bye.display;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import iambread.hi.bye.input.*;
import iambread.hi.bye.*;

public class FileEditorWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField name;
	private JTextField level;
	private JButton add;
	private JLabel namelbl;
	private JLabel levellbl;
	private JPanel panel = new JPanel();
	public static FileEditorWindow few = new FileEditorWindow();
	
	public FileEditorWindow() {
		super("Editor");
		
		namelbl = new JLabel("Set Name: ");
		namelbl.setForeground(Color.black);
		panel.add(namelbl);
		
		name = new JTextField("", 25);
		name.setFont(new Font("Serif", Font.PLAIN, 14));
		panel.add(name);
		
		levellbl = new JLabel("Set Level: ");
		levellbl.setForeground(Color.black);
		panel.add(levellbl);
		
		level = new JTextField("", 25);
		level.setFont(new Font("Serif", Font.PLAIN, 14));
		panel.add(level);
		
		add = new JButton("Add to Library");
		add.addActionListener(this);
		panel.add(add);
		
		this.add(panel);
	}

	public void onClick() {
		few.setSize(400, 300);
		few.setIconImage(Main.g.getImage());
		few.setLocationRelativeTo(null);
		few.setVisible(true);
		few.setResizable(false);
		few.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		few.addWindowListener(new WindowAdapter() {
	        @Override
	        public void windowClosing(WindowEvent event) {
	        	few.dispose();
	        }
	    });
	}	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {
			String sname = name.getText().toString().toLowerCase().trim();
			String slevel = level.getText().toString().toLowerCase().trim();
			if (sname != null && !sname.isEmpty() && slevel != null && !slevel.isEmpty()) {
				Display.mood.add(LoadData.randoms.nextInt(12));
				Display.peeple.add(sname);
				Display.numbers.add(slevel);
				String permname = sname.replaceAll(" ", ":");
				String permlevel = slevel.replaceAll(" ", ":");
				String bacon = permname.concat("/" + permlevel);
				Display.hashbrowns.add(bacon);
				name.setText("");
				level.setText("");
			}
		}
	}

}
