/**
 * 
 */
package crud;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;  
/**
 * @author TIJUANA
 *
 */
public class CRUD_Test {
 //https://chillyfacts.com/java-mysql-create-read-update-delete-crud-project/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUD_Test objtest = new CRUD_Test();
		objtest.read_data();
	}
	
	
	
    private BufferedImage image;
	 String [] imgVec = new String[] {"GHS01.png","GHS02.png","GHS03.png",
			  "GHS04.png","GHS05.png","GHS06.png",
			  "GHS07.png","GHS08.png","GHS09.png"};
	JFrame f;
	// Table 
    JTable j; 
    
    String [] property = new String[] {"Physical","Health","Environmental"};
    
  //  JLabel jLabelTest = new JLabel();
	CRUD_Test() {
		f = new JFrame();// creating instance of JFrame

		 try {                
	          image = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/GHS01.png"));
	       } catch (IOException ex) {
	            ex.printStackTrace();
	       }
	 
		/* final JTextField tf=new JTextField();  
		    tf.setBounds(50,50, 150,20);  
		
		
		JButton b = new JButton("click");// creating instance of JButton
		b.setBounds(130, 100, 100, 40);

		
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            tf.setText("no value in string");  
	    	        }  
	    	    });
		*/
		

		 
		 
		ArrayList<String[]> rows = read_data();
		System.out.println("size --> "+ rows.size());
		String [][] data = new String[rows.size()][rows.get(0).length];
		int s =0;
	//	BufferedImage imageTest;
		for (String[] strings : rows) {
		//	System.out.println(strings.length);
				System.out.println("----");	
				for (int i =0; i< strings.length; i++) {
					System.out.println(strings[i]);
					
					if (i == 8) {
						for (int j =0; j < imgVec.length; j++) {
							if (strings[i].contains(imgVec[j])) {
								System.out.println("IMG -> "+imgVec[j]);
							/*	try {
									imageTest = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/"+imgVec[j].toString()));
								    Image newImage = imageTest.getScaledInstance(80,80, Image.SCALE_DEFAULT);
								    ImageIcon imageIcon = new ImageIcon(newImage);
							         jLabelTest = new JLabel();
							         jLabelTest.setIcon(imageIcon);
							         jLabelTest.setBounds(10, 60, 80, 80);
								    f.add(jLabelTest);
								
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}*/
							}
						}
					//	System.out.println( strings[i] );
						
					}
					
					data[s][i] = strings[i];
				}
				
				s++;
			}
		
		
		
	/*	String[][] data = { 
	            { "Kundan Kumar Jha", "4031", "CSE" }, 
	            { "Anand Jha", "6014", "IT" } 
	        }; 
	  */
	        // Column Names 
	    String[] columnNames = { "subs_ID", "subs_HDS", "subs_PARTNO", "subs_NAME", "physprop_name", "bottletype_name", "unit_name", "subs_quant", "subs_ghs", "area_name" ,"pictogram","property" }; 
	    
        // Initializing the JTable 
        j = new JTable(data, columnNames); 
        j.setBounds(100, 40, 800, 300); 
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
	    sp.setBounds(100, 400,  800, 180);
	    
	    
	    Image newImage = image.getScaledInstance(80,80, Image.SCALE_DEFAULT);
	    ImageIcon imageIcon = new ImageIcon(newImage);
	  //  imageIcon.setImageObserver(this);
	   
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        jLabel.setBounds(10, 10, 80, 80);
	 //   f.add(jLabel);
	    f.add(sp); 
	 //   f.add(b);// adding button in JFrame
	//	f.add(tf);
		f.setSize(1000, 700);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
		
	}
	
	
   /* @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }*/
	
	
	public ArrayList<String[]> read_data() {
		ArrayList<String[]> rows = new ArrayList<String[]>();
		String [] vec = null;
		DB_Connection obj_DB_Connection=new DB_Connection();
		
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String query="select p.subs_ID, p.subs_HDS, p.subs_PARTNO, p.subs_NAME, a.physprop_name, b.bottletype_name, c.unit_name, p.subs_quant, p.subs_ghs, d.area_name\r\n" + 
					"from substance_tbl as p join physprop_tbl as a on p.`physprop_tblID`=a.physprop_id \r\n" + 
					"join bottletype_tbl as b on p.`bottletype_tblID`=b.bottletype_id join unit_tbl as c on p.`unit_tblID` = c.unit_id\r\n" + 
					"join area_tbl as d on p.`area_tblID` = d.area_id";
			ps=connection.prepareStatement(query);
			//ps.setString(1, sl_no);
		//	System.out.println(ps);
			rs=ps.executeQuery();
			
	/*		System.out.println(" subs_ID \t  subs_HDS \t  subs_PARTNO \t  subs_NAME \t  physprop_name \t  "
					+ "bottletype_name \t  unit_name \t subs_quant \t subs_ghs \t area_name"); */
			
			while(rs.next()){
				vec = new String[12];
		/*	System.out.println("\t   "+rs.getString("subs_ID") +
				" \t   "+rs.getString("subs_HDS") + 
				"  \t "+rs.getString("subs_PARTNO") +
				"  \t "+rs.getString("subs_NAME") +
				"  \t "+rs.getString("physprop_name") +
				"  \t "+rs.getString("bottletype_name")+
				"  \t "+rs.getString("unit_name") + 
				"  \t "+rs.getString("subs_quant") +
				"  \t "+rs.getString("subs_ghs") +
				"  \t "+rs.getString("area_name")
					 ); */
			vec[0] = rs.getString("subs_ID");
			vec[1] = rs.getString("subs_HDS");
			vec[2] = rs.getString("subs_PARTNO");
			vec[3] = rs.getString("subs_NAME");
			vec[4] = rs.getString("physprop_name");
			vec[5] = rs.getString("bottletype_name");
			vec[6] = rs.getString("unit_name");
			vec[7] = rs.getString("subs_quant");
			vec[8] = rs.getString("subs_ghs");
			vec[10] = "";
			vec[11] = "";
			System.out.println("");
		//	BufferedImage image = null;
			
			for (int j =0; j < imgVec.length; j++) {
				if (vec[8].contains(imgVec[j])) {
					System.out.println("IMG ----------------------> "+imgVec[j]);
					//image = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/"+imgVec[j].toString()));
					vec[10] =vec[10]+ imgVec[j] +",";
					
				}
			}
			
			 String[] values = vec[10].split(",");
			 
			 System.out.println("VALUES ---> "+ values);
			 for (int j =0; j < values.length; j++) {
				 System.out.println(values[j]);
			 }
			 
				for (int j =0; j < property.length; j++) {
					if (vec[8].contains(property[j])) {
						System.out.println("PROP ----------------------> "+property[j]);
						//image = ImageIO.read(new File("C:/Project2019/MYSQL_CRUD/src/images/"+imgVec[j].toString()));
						vec[11] =vec[11]+ property[j] +",";
						
					}
				}
			 
			 
			vec[9] = rs.getString("area_name");
			
			rows.add(vec);
		//	System.out.println("---------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return rows;
	}
	


}
