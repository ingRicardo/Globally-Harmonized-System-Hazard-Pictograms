/**
 * 
 */
package crud;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author TIJUANA
 *
 */
public class Crud_SQP {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 new Crud_SQP();
	}
	JFrame f;
    JTable j; 
    
    
    
	public Crud_SQP() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		f = new JFrame();// creating instance of JFrame
		

		BufferedImage imageGHS01,imageGHS02,imageGHS03,imageGHS04,imageGHS05,imageGHS06,imageGHS07,imageGHS08,imageGHS09;
		
		imageGHS01 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS01.png"));
		Image newImage = imageGHS01.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIcon = new ImageIcon(newImage);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabel = new JLabel();
	    jLabel.setIcon(imageIcon);
	    jLabel.setBounds(10, 10, 80, 80);
	    f.add(jLabel);
	    
	    JLabel jLabelGHS01 = new JLabel();
	    jLabelGHS01.setBounds(28, 60, 80, 80);
	    jLabelGHS01.setText("GHS01");
	    
	    f.add(jLabelGHS01);
	    
	    
	    //---
		imageGHS02 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS02.png"));
		Image newImageGHS02 = imageGHS02.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS02 = new ImageIcon(newImageGHS02);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS02 = new JLabel();
	    jLabelGHS02.setIcon(imageIconGHS02);
	    jLabelGHS02.setBounds(10, 120, 80, 80);
	    f.add(jLabelGHS02);
	    
	    JLabel jLabelGHS02l = new JLabel();
	    jLabelGHS02l.setBounds(28, 170, 80, 80);
	    jLabelGHS02l.setText("GHS02");
	    
	    f.add(jLabelGHS02l);
	    //---
		 
	    
	    //---
		imageGHS03 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS03.png"));
		Image newImageGHS03 = imageGHS03.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS03 = new ImageIcon(newImageGHS03);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS03 = new JLabel();
	    jLabelGHS03.setIcon(imageIconGHS03);
	    jLabelGHS03.setBounds(10, 230, 80, 80);
	    f.add(jLabelGHS03);
	    
	    JLabel jLabelGHS03l = new JLabel();
	    jLabelGHS03l.setBounds(28, 280, 80, 80);
	    jLabelGHS03l.setText("GHS03");
	    
	    f.add(jLabelGHS03l);
	    //---
	    
	    
	    //---
		imageGHS04 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS04.png"));
		Image newImageGHS04 = imageGHS04.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS04 = new ImageIcon(newImageGHS04);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS04 = new JLabel();
	    jLabelGHS04.setIcon(imageIconGHS04);
	    jLabelGHS04.setBounds(10, 340, 80, 80);
	    f.add(jLabelGHS04);
	    
	    JLabel jLabelGHS04l = new JLabel();
	    jLabelGHS04l.setBounds(28, 390, 80, 80);
	    jLabelGHS04l.setText("GHS04");
	    
	    f.add(jLabelGHS04l);
	    //---
	    
	    
	    //---
		imageGHS05 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS05.png"));
		Image newImageGHS05 = imageGHS05.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS05 = new ImageIcon(newImageGHS05);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS05 = new JLabel();
	    jLabelGHS05.setIcon(imageIconGHS05);
	    jLabelGHS05.setBounds(1030, 10, 80, 80);
	    f.add(jLabelGHS05);
	    
	    JLabel jLabelGHS05l = new JLabel();
	    jLabelGHS05l.setBounds(1050, 60, 80, 80);
	    jLabelGHS05l.setText("GHS05");
	    
	    f.add(jLabelGHS05l);
	    //---
	    
	    
	    
	    //---
		imageGHS06 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS06.png"));
		Image newImageGHS06 = imageGHS06.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS06 = new ImageIcon(newImageGHS06);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS06 = new JLabel();
	    jLabelGHS06.setIcon(imageIconGHS06);
	    jLabelGHS06.setBounds(1030, 120, 80, 80);
	    f.add(jLabelGHS06);
	    
	    JLabel jLabelGHS06l = new JLabel();
	    jLabelGHS06l.setBounds(1050, 170, 80, 80);
	    jLabelGHS06l.setText("GHS06");
	    
	    f.add(jLabelGHS06l);
	    //---
	    
	    
	    //---
		imageGHS07 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS07.png"));
		Image newImageGHS07 = imageGHS07.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS07 = new ImageIcon(newImageGHS07);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS07 = new JLabel();
	    jLabelGHS07.setIcon(imageIconGHS07);
	    jLabelGHS07.setBounds(1030, 230, 80, 80);
	    f.add(jLabelGHS07);
	    
	    JLabel jLabelGHS07l = new JLabel();
	    jLabelGHS07l.setBounds(1050, 280, 80, 80);
	    jLabelGHS07l.setText("GHS07");
	    
	    f.add(jLabelGHS07l);
	    //---
	    
	    
	    
	    //---
		imageGHS08 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS08.png"));
		Image newImageGHS08 = imageGHS08.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS08 = new ImageIcon(newImageGHS08);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS08 = new JLabel();
	    jLabelGHS08.setIcon(imageIconGHS08);
	    jLabelGHS08.setBounds(1030, 340, 80, 80);
	    f.add(jLabelGHS08);
	    
	    JLabel jLabelGHS08l = new JLabel();
	    jLabelGHS08l.setBounds(1050, 390, 80, 80);
	    jLabelGHS08l.setText("GHS08");
	    
	    f.add(jLabelGHS08l);
	    //---

	    
	    
	    //---
		imageGHS09 = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS09.png"));
		Image newImageGHS09 = imageGHS09.getScaledInstance(80,80, Image.SCALE_DEFAULT);
		ImageIcon imageIconGHS09 = new ImageIcon(newImageGHS09);
		 //  imageIcon.setImageObserver(this);
		   
	    JLabel jLabelGHS09 = new JLabel();
	    jLabelGHS09.setIcon(imageIconGHS09);
	    jLabelGHS09.setBounds(1030, 450, 80, 80);
	    f.add(jLabelGHS09);
	    
	    JLabel jLabelGHS09l = new JLabel();
	    jLabelGHS09l.setBounds(1050, 500, 80, 80);
	    jLabelGHS09l.setText("GHS09");
	    
	    f.add(jLabelGHS09l);
	    //---
	    
	    
	    
        JLabel jLabelHDS = new JLabel();
        jLabelHDS.setBounds(150, 10, 80, 80);
        jLabelHDS.setText("HDS");
		final JTextField tfHDS=new JTextField();  
		tfHDS.setBounds(150,60, 150,20); 
		
        JLabel jLabelPARTNO = new JLabel();
        jLabelPARTNO.setBounds(350, 10, 80, 80);
        jLabelPARTNO.setText("PART NO.");
		final JTextField tfPARTNO=new JTextField();  
		tfPARTNO.setBounds(350,60, 150,20); 
		
		
        JLabel jLabelNAME = new JLabel();
        jLabelNAME.setBounds(550, 10, 80, 80);
        jLabelNAME.setText("SUBS NAME");
		final JTextField tfNAME=new JTextField();  
		tfNAME.setBounds(550,60, 150,20); 
		
	//----	
		
        JLabel jLabelPHYSPRO = new JLabel();
        jLabelPHYSPRO.setBounds(150, 110, 180, 80);
        jLabelPHYSPRO.setText("PHYSICAL PROPERTY");
		final JTextField tfPHYSPRO=new JTextField();  
		tfPHYSPRO.setBounds(150,160, 150,20); 
		
        JLabel jLabelBOTYPE = new JLabel();
        jLabelBOTYPE.setBounds(350, 110, 80, 80);
        jLabelBOTYPE.setText("BOTTLE TYPE");
		final JTextField tfBOTYPE=new JTextField();  
		tfBOTYPE.setBounds(350,160, 150,20); 
		
		
        JLabel jLabelUNIT = new JLabel();
        jLabelUNIT.setBounds(550, 110, 80, 80);
        jLabelUNIT.setText("UNIT");
		final JTextField tfUNIT=new JTextField();  
		tfUNIT.setBounds(550,160, 150,20); 
		
	//---
		
        JLabel jLabelQTY = new JLabel();
        jLabelQTY.setBounds(150, 210, 80, 80);
        jLabelQTY.setText("QUANTITY");
		final JTextField tfQTY=new JTextField();  
		tfQTY.setBounds(150,260, 150,20); 
		
       JLabel jLabelGHSPIC = new JLabel();
       jLabelGHSPIC.setBounds(350, 210, 80, 80);
       jLabelGHSPIC.setText("GHS PICTO.");
		final JTextField tfGHSPIC=new JTextField();  
		tfGHSPIC.setBounds(350,260, 150,20); 
		
		 
        JLabel jLabelGHSPROP = new JLabel();
        jLabelGHSPROP.setBounds(550, 210, 80, 80);
        jLabelGHSPROP.setText("GHS PROP.");
		final JTextField tfGHSPROP=new JTextField();  
		tfGHSPROP.setBounds(550,260, 150,20); 
		
	//---	
        JLabel jLabelAREA = new JLabel();
        jLabelAREA.setBounds(150, 310, 80, 80);
        jLabelAREA.setText("AREA");
		final JTextField tfAREA=new JTextField();  
		tfAREA.setBounds(150,360, 150,20); 
		
		
        JLabel jLabeSearchGHS = new JLabel();
        jLabeSearchGHS.setBounds(350, 310, 80, 80);
        jLabeSearchGHS.setText("Search GHS");
		final JTextField tfSearchGHS=new JTextField();  
		tfSearchGHS.setBounds(350,360, 150,20); 
		
		
		
		
		f.add(jLabeSearchGHS);
		f.add(tfSearchGHS);
		
		
		JButton GHS = new JButton("GHS Search");// creating instance of JButton
		GHS.setBounds(550,360, 150,20);
		
		GHS.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		
	    		
	    		System.out.println(" GHS -> "+tfSearchGHS.getText());
	    		//search_by_GHS(tfSearchGHS.getText());
	    		showDataBySearch(tfSearchGHS.getText());
	    	}
	    	
	    	
		});
		
		f.add(GHS);
		
		JButton b = new JButton("Save");// creating instance of JButton
		b.setBounds(800, 50, 100, 40);
		
		
		//---
		JButton d = new JButton("Delete");// creating instance of JButton
		d.setBounds(800, 180, 100, 40);
		
        JLabel jLabelDELid = new JLabel();
        jLabelDELid.setBounds(800, 110, 80, 80);
        jLabelDELid.setText("ID");
		final JTextField tfDELid=new JTextField();  
		tfDELid.setBounds(850,150, 80,20); 
		
		
		JButton test = new JButton("Get Values");// creating instance of JButton
		test.setBounds(800, 250, 100, 40);
		
		
		
		test.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		
	    		read_data_TXT(tfDELid.getText() ,tfHDS,tfPARTNO,tfNAME,tfPHYSPRO,tfBOTYPE,tfUNIT,tfQTY,tfGHSPIC,tfGHSPROP,tfAREA);
	    		showData(tfDELid.getText());
	    	}
	    	
	    	
		});
		
		
		
		
		JButton x = new JButton("x");// creating instance of JButton
		x.setBounds(930, 50, 50, 20);
		
		
		x.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		
	    		
				 
				tfHDS.setText("");
				tfPARTNO.setText("");
				tfNAME.setText("");
				tfPHYSPRO.setText("");
				tfBOTYPE.setText("");
				tfUNIT.setText("");
				tfQTY.setText("");
				tfGHSPIC.setText("");
				tfGHSPROP.setText("");
				tfAREA.setText("");
				tfDELid.setText("");
	    		
	    	}
	    	
	    	
		});
		
		
		JButton update = new JButton("Update");// creating instance of JButton
		update.setBounds(800, 320, 100, 40);
		
		
		
		update.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		//read_data_TXT(tfDELid ,tfHDS,tfPARTNO,tfNAME,tfPHYSPRO,tfBOTYPE,tfUNIT,tfQTY,tfGHSPIC,tfGHSPROP,tfAREA);
	    		if (!"".equals(tfDELid.getText())  )
	    			update_data(tfDELid.getText(), tfHDS.getText(), tfPARTNO.getText(), tfNAME.getText(), tfPHYSPRO.getText(), tfBOTYPE.getText(), tfUNIT.getText(), tfQTY.getText(), tfGHSPIC.getText(), tfGHSPROP.getText(), tfAREA.getText());
	    	}
	    	
	    	
		});
		
		
		
		//--
		b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		//tfHDS.setText("no value in string");  	    	            
	    	           // jLabel.setText(tfHDS.getText());
	    				System.out.println(tfHDS.getText());
	    			
	    				if (  !"".equals(tfHDS.getText())  &&  !"".equals(tfPARTNO.getText()) && 
	    						!"".equals(tfNAME.getText())  &&  !"".equals(tfPHYSPRO.getText()) && 
	    						!"".equals(tfBOTYPE.getText())  &&  !"".equals(tfUNIT.getText()) &&
	    						!"".equals(tfQTY.getText())  &&  !"".equals(tfGHSPIC.getText()) &&
	    						!"".equals(tfGHSPROP.getText())  &&  !"".equals(tfAREA.getText())
	    						) {
	    					create_data(tfHDS.getText(), tfPARTNO.getText(), tfNAME.getText(), 
	    							tfPHYSPRO.getText(), tfBOTYPE.getText(), tfUNIT.getText(), 
	    							tfQTY.getText(), tfGHSPIC.getText(),
		    						tfGHSPROP.getText(), tfAREA.getText());
	    				}
	    				
	    				
	    				// read_data();
	    				 
	    				tfHDS.setText("");
	    				tfPARTNO.setText("");
	    				tfNAME.setText("");
	    				tfPHYSPRO.setText("");
	    				tfBOTYPE.setText("");
	    				tfUNIT.setText("");
	    				tfQTY.setText("");
	    				tfGHSPIC.setText("");
	    				tfGHSPROP.setText("");
	    				tfAREA.setText("");
	    				tfDELid.setText("");
	    				
	    				 showData(tfDELid.getText());
	    				 
	    				 
	    	        }  
	    	    });
		
		
		d.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){ 
	    		delete_data(tfDELid.getText());
	    		
				tfHDS.setText("");
				tfPARTNO.setText("");
				tfNAME.setText("");
				tfPHYSPRO.setText("");
				tfBOTYPE.setText("");
				tfUNIT.setText("");
				tfQTY.setText("");
				tfGHSPIC.setText("");
				tfGHSPROP.setText("");
				tfAREA.setText("");
				tfDELid.setText("");
	    		
	    		read_data("");
	        }  
	    });
		f.add(x);
		
		f.add(update);
				
	    f.add(b);// adding button in JFrame
	    
	    f.add(test);
	    
	    f.add(d);
	    f.add(jLabelDELid);
	    f.add(tfDELid);
	    
	    
		f.add(tfHDS);
		f.add(jLabelHDS);
		
		f.add(tfPARTNO);
		f.add(jLabelPARTNO);
		

		f.add(tfNAME);
		f.add(jLabelNAME);
		

		f.add(tfPHYSPRO);
		f.add(jLabelPHYSPRO);
		
		f.add(tfBOTYPE);
		f.add(jLabelBOTYPE);
		
		f.add(tfUNIT);
		f.add(jLabelUNIT);
		
		f.add(jLabelQTY);
		f.add(tfQTY);
		
		
		f.add(jLabelGHSPIC);
		f.add(tfGHSPIC);
		
		f.add(jLabelGHSPROP);
		f.add(tfGHSPROP);
		
		f.add(jLabelAREA);
		f.add(tfAREA);
		
		f.setSize(1200, 700);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
			
		

	}
	
	
	public void showData(String id) {
		ArrayList<String[]> rows;
	
		
		System.out.println("id -------> "+ id);
		rows = read_data( id);
		
		System.out.println("size --> "+ rows.size());
		
		
		String [][] data ;
		
		
		if (rows.size() == 0)
			data = new String[0][0];
		else 
			data = new String[rows.size()][rows.get(0).length];
			
		int s =0;

		for (String[] strings : rows) {

				System.out.println("----");	
				for (int i =0; i< strings.length; i++) {
					System.out.println(strings[i]);
								
					data[s][i] = strings[i];
				}
				
				s++;
			}
		
		String[] columnNames = { "subs_ID", "subs_HDS", "subs_PARTNO", "subs_NAME", "physprop_name", "bottletype_name", "unit_name", "subs_quant"   ,"pictogram","property" ,"area_name" };
		
        j = new JTable(data, columnNames); 
        j.setBounds(150, 40, 800, 300); 
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
	    sp.setBounds(150, 400,  800, 180);
	    f.add(sp); 
	}

	
	public void showDataBySearch(String ghs) {
		ArrayList<String[]> rows;
	
		
		System.out.println("ghs -------> "+ ghs);
		rows = search_by_GHS( ghs);
		
		System.out.println("size --> "+ rows.size());
		
		
		String [][] data ;
		
		
		if (rows.size() == 0)
			data = new String[0][0];
		else 
			data = new String[rows.size()][rows.get(0).length];
			
		int s =0;

		for (String[] strings : rows) {

				System.out.println("----");	
				for (int i =0; i< strings.length; i++) {
					System.out.println(strings[i]);
								
					data[s][i] = strings[i];
				}
				
				s++;
			}
		
		String[] columnNames = { "subs_ID", "subs_HDS", "subs_PARTNO", "subs_NAME", "physprop_name", "bottletype_name", "unit_name", "subs_quant"   ,"pictogram","property" ,"area_name" };
		
        j = new JTable(data, columnNames); 
        j.setBounds(150, 40, 800, 300); 
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
	    sp.setBounds(150, 400,  800, 180);
	    f.add(sp); 
	}
	
	
	public void create_data(String subs_HDS,String subs_PARTNO,String subs_NAME, String subs_PHYSPROP, String subs_BOTTLETYPE, String subs_UNIT,
			String subs_QTY,String subs_GHS_PICTO,String subs_GHS_PROPE, String subs_AREA){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="insert into chem_substance (subs_HDS,subs_PARTNO,subs_NAME,subs_PHYSPROP,subs_BOTTLETYPE,subs_UNIT,subs_QTY,subs_GHS_PICTO,subs_GHS_PROPE, subs_AREA) values (?,?,?,?,?,?,?,?,?,?)";
			ps=connection.prepareStatement(query);
			ps.setString(1, subs_HDS);
			ps.setString(2, subs_PARTNO);
			ps.setString(3, subs_NAME);
			ps.setString(4, subs_PHYSPROP);
			ps.setString(5, subs_BOTTLETYPE);
			ps.setString(6, subs_UNIT);
			if (subs_QTY.length()>0)
				ps.setInt(7,  Integer.parseInt( subs_QTY));
			else
				ps.setInt(7,  0);	
			ps.setString(8, subs_GHS_PICTO);
			ps.setString(9, subs_GHS_PROPE);
			ps.setString(10, subs_AREA);
		
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String[]>  read_data(String id){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String [] vec = null;
		ArrayList<String[]> rows = new ArrayList<String[]>();
		try {
			String query="";

			
		
			if  (id == ""|| id.length() == 0 || "".equals(id)) {
				 query="select * from chem_substance";
				 
				 System.out.println("query --> "+ query);
			}else {
				 query="select * from chem_substance where subs_ID=?";
				
				 System.out.println("query --> "+ query);
			}
			
			ps=connection.prepareStatement(query);
			
			if  (id == ""|| id.length() == 0 || "".equals(id)) {
				System.out.println("**NEW**");
				
				
			}else {
				System.out.println(" **exists ID ** " +id);
				ps.setInt(1, Integer.parseInt(id));
			}
			
			
		
			
			
			
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
				vec = new String[11];
			System.out.println("subs_ID -"+rs.getString("subs_ID"));
			System.out.println("subs_HDS -"+rs.getString("subs_HDS"));
			System.out.println("subs_PARTNO -"+rs.getString("subs_PARTNO"));
			System.out.println("subs_NAME -"+rs.getString("subs_NAME"));
			System.out.println("subs_PHYSPROP -"+rs.getString("subs_PHYSPROP"));
			System.out.println("subs_BOTTLETYPE -"+rs.getString("subs_BOTTLETYPE"));
			System.out.println("subs_UNIT -"+rs.getString("subs_UNIT"));
			System.out.println("subs_QTY -"+rs.getString("subs_QTY"));
			System.out.println("subs_GHS_PICTO -"+rs.getString("subs_GHS_PICTO"));
			System.out.println("subs_GHS_PROPE -"+rs.getString("subs_GHS_PROPE"));
			System.out.println("subs_AREA -"+rs.getString("subs_AREA"));
			System.out.println("---------------");
			
			vec[0] = rs.getString("subs_ID");
			vec[1] = rs.getString("subs_HDS");
			vec[2] = rs.getString("subs_PARTNO");
			vec[3] = rs.getString("subs_NAME");
			vec[4] = rs.getString("subs_PHYSPROP");
			vec[5] = rs.getString("subs_BOTTLETYPE");
			vec[6] = rs.getString("subs_UNIT");
			vec[7] = rs.getString("subs_QTY");
			vec[8] = rs.getString("subs_GHS_PICTO");
			vec[9] = rs.getString("subs_GHS_PROPE");
			vec[10] = rs.getString("subs_AREA");
			
			rows.add(vec);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return rows;
	}

	public void delete_data(String sl_no){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="delete from chem_substance where subs_ID=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, sl_no);
			System.out.println(ps);
			ps.executeUpdate();
			System.out.println("**record deleted**");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void read_data_TXT(String tfDELidtxt,JTextField subs_HDS, JTextField tfPARTNO, JTextField tfNAME,
			JTextField tfPHYSPRO, JTextField tfBOTTLETYPE, JTextField tfUNIT, 
			JTextField tfQTY, JTextField tfGHSPIC, JTextField tfGHSPROP , JTextField tfAREA){
		
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		int id =0;
		
		if (tfDELidtxt.length() > 0)
			id = Integer.parseInt(tfDELidtxt);
		
		System.out.println("id -> "+ id);
		String query ="";
		try {
			if (id > 0) {
				query="select * from chem_substance where subs_ID=?";
				ps=connection.prepareStatement(query);
				ps.setInt(1, id);
			}else {
				query="select * from chem_substance";
				ps=connection.prepareStatement(query);
			}
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
				
				if (id > 0) {
				//	tfDELidtxt
					subs_HDS.setText(rs.getString("subs_HDS"));
					tfPARTNO.setText(rs.getString("subs_PARTNO"));
					tfNAME.setText(rs.getString("subs_NAME"));
					tfPHYSPRO.setText(rs.getString("subs_PHYSPROP"));
					tfBOTTLETYPE.setText(rs.getString("subs_BOTTLETYPE"));
					tfUNIT.setText(rs.getString("subs_UNIT"));
					tfQTY.setText(rs.getString("subs_QTY"));
					tfGHSPIC.setText(rs.getString("subs_GHS_PICTO"));
					tfGHSPROP.setText(rs.getString("subs_GHS_PROPE"));
					tfAREA.setText(rs.getString("subs_AREA"));
				}
				
				System.out.println("subs_ID -"+rs.getInt("subs_ID"));								
				System.out.println("subs_HDS -"+rs.getString("subs_HDS"));								
				System.out.println("subs_PARTNO -"+rs.getString("subs_PARTNO"));								
				System.out.println("subs_NAME -"+rs.getString("subs_NAME"));						
				System.out.println("subs_PHYSPROP -"+rs.getString("subs_PHYSPROP"));							
				System.out.println("subs_BOTTLETYPE -"+rs.getString("subs_BOTTLETYPE"));								
				System.out.println("subs_UNIT -"+rs.getString("subs_UNIT"));								
				System.out.println("subs_QTY -"+rs.getString("subs_QTY"));								
				System.out.println("subs_GHS_PICTO -"+rs.getString("subs_GHS_PICTO"));												
				System.out.println("subs_GHS_PROPE -"+rs.getString("subs_GHS_PROPE"));								
				System.out.println("subs_AREA -"+rs.getString("subs_AREA"));
				
				
			System.out.println("---------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void update_data(String subs_ID ,String subs_HDS,String subs_PARTNO,String subs_NAME,
							String subs_PHYSPROP ,String subs_BOTTLETYPE,String subs_UNIT,String subs_QTY,
							String subs_GHS_PICTO ,String subs_GHS_PROPE,String subs_AREA){
		
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="update chem_substance set subs_HDS=?,subs_PARTNO=?,subs_NAME=? ,subs_PHYSPROP=? ,subs_BOTTLETYPE=? ,subs_UNIT=?, subs_QTY=? , subs_GHS_PICTO=? , subs_GHS_PROPE=?, subs_AREA=? where subs_ID=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, subs_HDS);
			ps.setString(2, subs_PARTNO);
			ps.setString(3, subs_NAME);
			ps.setString(4, subs_PHYSPROP);
			ps.setString(5, subs_BOTTLETYPE);
			ps.setString(6, subs_UNIT);
			ps.setString(7, subs_QTY);
			ps.setString(8, subs_GHS_PICTO);
			ps.setString(9, subs_GHS_PROPE);
			ps.setString(10, subs_AREA);
			ps.setString(11, subs_ID);
			
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public ArrayList<String[]> search_by_GHS(String ghs) {
		ArrayList<String[]> rows = new ArrayList<String[]>();
		String [] vec = null;
		DB_Connection obj_DB_Connection=new DB_Connection();
		
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String query="select * from chem_substance where subs_GHS_PICTO LIKE '%"+ghs+"%'";
			ps=connection.prepareStatement(query);

			rs=ps.executeQuery();
						
			while(rs.next()){
				vec = new String[11];

				vec[0] = rs.getString("subs_ID");
				vec[1] = rs.getString("subs_HDS");
				vec[2] = rs.getString("subs_PARTNO");
				vec[3] = rs.getString("subs_NAME");
				vec[4] = rs.getString("subs_PHYSPROP");
				vec[5] = rs.getString("subs_BOTTLETYPE");
				vec[6] = rs.getString("subs_UNIT");
				vec[7] = rs.getString("subs_QTY");
				vec[8] = rs.getString("subs_GHS_PICTO");
				vec[9] = rs.getString("subs_GHS_PROPE");
				vec[10] = rs.getString("subs_AREA");
			
				
				System.out.println("subs_ID -"+rs.getInt("subs_ID"));								
				System.out.println("subs_HDS -"+rs.getString("subs_HDS"));								
				System.out.println("subs_PARTNO -"+rs.getString("subs_PARTNO"));								
				System.out.println("subs_NAME -"+rs.getString("subs_NAME"));						
				System.out.println("subs_PHYSPROP -"+rs.getString("subs_PHYSPROP"));							
				System.out.println("subs_BOTTLETYPE -"+rs.getString("subs_BOTTLETYPE"));								
				System.out.println("subs_UNIT -"+rs.getString("subs_UNIT"));								
				System.out.println("subs_QTY -"+rs.getString("subs_QTY"));								
				System.out.println("subs_GHS_PICTO -"+rs.getString("subs_GHS_PICTO"));												
				System.out.println("subs_GHS_PROPE -"+rs.getString("subs_GHS_PROPE"));								
				System.out.println("subs_AREA -"+rs.getString("subs_AREA"));
				
				
			System.out.println("---------------");	
				
			
		

						
			rows.add(vec);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return rows;
	}
	
}
