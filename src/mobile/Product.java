/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

import java.awt.Image;
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.Timer;


//import mobile.Product.selectPro.myTableCellRenderer;


/**
 *
 * @author PC
 */
public class Product extends javax.swing.JFrame {

    public static Object addTableHeader;

   
    
String Path=null;
    
    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
          showDate();
       showTime();
    }
    String selectedImagePath ;
         Connection conn=null;
        ResultSet rs=null;
  
     Statement stmt =null;
        
    
PreparedStatement st;

  void showDate() {

Date d =new Date();

SimpleDateFormat s=new SimpleDateFormat( "yyyy/MM/dd");  
       D.setText(s.format(d));
    }
    void showTime() {
new Timer (0,new ActionListener()
{
public void actionPerformed (ActionEvent e){

Date d =new Date();

SimpleDateFormat s= new SimpleDateFormat ("HH:mm:ss ");
T.setText(s.format(d));
}
}
).start();
    }   

    private Product(Object[][] rows, String[] colnams) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
 



    public void selectPro() {
            try{ 
                conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");
            
            stmt = conn.createStatement();
            
             
            rs =stmt.executeQuery("select*from product1"); 
          tbl.setModel(DbUtils.resultSetToTableModel(rs)); 
       
         
 }catch (SQLException ex){
                 ex.printStackTrace();
            }
     
     }          
           
     

     
   /* public void populateJtable() {

contactquery cq =new contactquery();
ArrayList <contact> ctlist =cq.contactList ();
String[]colnams={"Id,Name,Brand,Processor,Display,Camera,Size,Image,Technology,Internal,Ram,Price"};
     Object[][] rows =new Object[ctlist.size()][12];
     for(int i=0;i<ctlist.size();i++)
     {
         rows[i][0]=ctlist.get(i).t1();
         rows[i][1]=ctlist.get(i).t2();
         rows[i][2]=ctlist.get(i).t3();
         rows[i][3]=ctlist.get(i).t4();
         rows[i][4]=ctlist.get(i).t5();
         rows[i][5]=ctlist.get(i).t6();
         rows[i][6]=ctlist.get(i).t7();

         ImageIcon pic= new ImageIcon(new ImageIcon(ctlist.jLabel7()).getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH ));
         rows[i][7]=pic;
         rows[i][8]=ctlist.get(i).t8();
         rows[i][9]=ctlist.get(i).t9();
         rows[i][10]=ctlist.get(i).t10();
         rows[i][11]=ctlist.get(i).t11();
         
     }
     Product md= new Product(rows,colnams);
     tbl.setModel((TableModel) md);
     }*/
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mobile Shop Mangement System");

        D.setBackground(new java.awt.Color(0, 0, 102));
        D.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setText("Date");
        D.setName("D"); // NOI18N
        D.setOpaque(true);

        T.setBackground(new java.awt.Color(0, 0, 102));
        T.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        T.setForeground(new java.awt.Color(255, 255, 255));
        T.setText("Time");
        T.setOpaque(true);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/back.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/pu.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(D)
                    .addComponent(T))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(D)
                            .addGap(28, 28, 28)
                            .addComponent(T))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/sts.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/prs.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/pos.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/pt.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Point of sale");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Stock");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Product");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Purchase");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(31, 31, 31)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(36, 36, 36)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(38, 38, 38)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("\nProduct Id");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Brand");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 390, -1, -1));
        jPanel3.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, 30));
        jPanel3.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 30));
        jPanel3.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 200, 29));
        jPanel3.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, 29));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/delete.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 50, 54));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Add Image");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 125, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ram");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Internal Storage");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Processor");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Size");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 418, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Disply");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 281, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Technology");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 202, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Camera");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel7.setOpaque(true);
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1, 155, 110));
        jPanel3.add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 210, 30));
        jPanel3.add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 210, 30));

        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        jPanel3.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 210, 30));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/up.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 55, 54));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/add.jpg"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 54, 54));
        jPanel3.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, 30));
        jPanel3.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 30));

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel3.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 200, 30));

        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        jPanel3.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 210, 30));
        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 570, -1, -1));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Brand", "Processor", "Display", "Camera", "Size", "Image", "Techonology", "Internal_s", "Ram", "Price"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setHeaderValue("Id");
            tbl.getColumnModel().getColumn(1).setHeaderValue("Name");
            tbl.getColumnModel().getColumn(2).setHeaderValue("Brand");
            tbl.getColumnModel().getColumn(3).setHeaderValue("Processor");
            tbl.getColumnModel().getColumn(4).setHeaderValue("Display");
            tbl.getColumnModel().getColumn(5).setHeaderValue("Camera");
            tbl.getColumnModel().getColumn(6).setHeaderValue("Size");
            tbl.getColumnModel().getColumn(7).setHeaderValue("Image");
            tbl.getColumnModel().getColumn(8).setHeaderValue("Techonology");
            tbl.getColumnModel().getColumn(9).setHeaderValue("Internal_s");
            tbl.getColumnModel().getColumn(10).setHeaderValue("Ram");
            tbl.getColumnModel().getColumn(11).setHeaderValue("Price");
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 930, 370));

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(988, 988, 988)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        dispose();
        Stock s1=new Stock();
        s1.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        Pos po=new Pos();
        po.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dispose();
        Purchase pr= new Purchase();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");

            PreparedStatement st =  (PreparedStatement)conn.prepareStatement("insert into product1(Id,Name,Brand,Processor,Display,Camera,Size,Image,Technology,Internal,Ram,Price)Values(?,?,?,?,?,?,?,?,?,?,?,?)");
            // jLabel7 j1=new jLabel7();
            InputStream i;
            i = new FileInputStream (new File(Path));

            st.setInt(1, Integer.valueOf(t1.getText()));
            st.setString (2, t2.getText());
            st.setString(3,t3.getText());
            st.setString(4,t4.getText());
            st.setString(5, t5.getText());
            st.setString(6,t6.getText());
            st.setString(7,t7.getText());
            st.setBlob(8,i);
            st.setString(9,t12.getText());
            st.setString(10,t9.getText());
            st.setString(11,t10.getText());
            st.setString(12,t11.getText());

            //st.setString(5, Catch.getSelectedItem().toString());
            int rs= st.executeUpdate();
            //if(rs.next())

            JOptionPane.showMessageDialog(this,"Product Successfully Added");

            //dispose();
            //ProductView pv= new ProductView();
            //pv.setVisible(true);
//            selectPro();
            selectPro();
            
        } catch(Exception ex)
        {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (t1.getText().isEmpty()|| t2.getText().isEmpty()|| t3.getText().isEmpty()|| t4.getText().isEmpty()||t5.getText().isEmpty()|| t5.getText().isEmpty()){

            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{

            try{
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");

                String updateQuery ="UPDATE product1 SET Name=?,Brand=?,Processor=?,Display=?,Camera=?,Size=?,Image=?,Technology=?,Internal=?,Ram=?,Price=? WHERE Id=?";

                PreparedStatement st =  (PreparedStatement)conn.prepareStatement(updateQuery);
                InputStream i;
                i = new FileInputStream (new File(Path));
                st.setInt(12, Integer.valueOf(t1.getText()));
                st.setString (1, t2.getText());
                st.setString(2,t3.getText());
                st.setString(3,t4.getText());
                st.setString(4, t5.getText());
                st.setString(5,t6.getText());
                st.setString(6,t7.getText());
                st.setBlob(7,i);
                st.setString(8,t12.getText());
                st.setString(9,t9.getText());
                st.setString(10,t10.getText());
                st.setString(11,t11.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Successfully");
//                selectPro();
            }    catch (SQLException ex)
            {
                ex.printStackTrace();
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        /*    JFileChooser chooser = new JFileChooser();

        chooser.showOpenDialog (null);
        File f = chooser.getSelectedFile();

        String filename = f.getAbsolutePath();
        //txt filename.setText (filename);
        Image getAbsolutePath = null;

        ImageIcon icon= new ImageIcon (filename);

        Image image = icon.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);

        jLabel7.setIcon (icon);*/

        /*  JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory (new File (System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter ("IMAGE", "jpg", "gif","png");
        fileChooser.addChoosableFileFilter (filter);
        int result =fileChooser.showSaveDialog(null);
        if (result ==JFileChooser.APPROVE_OPTION) {
            File selectedFile  = fileChooser.getSelectedFile();
            String path =selectedFile.getAbsolutePath();
            Icon icon;
            jLabel7.setIcon(icon);
        }
        else {
            if(result == JFileChooser.CANCEL_OPTION) {
                System.out.println("No Data");
            }*/

            JFileChooser  browseImageFile= new JFileChooser ();

            FileNameExtensionFilter fnef =new FileNameExtensionFilter("IMAGE","PNG","JPG","JPEG");

            browseImageFile.addChoosableFileFilter (fnef);
            int showOpenDialogue = browseImageFile.showOpenDialog(null);

            if (showOpenDialogue== JFileChooser.APPROVE_OPTION){
                File selectedImageFile =browseImageFile.getSelectedFile();

                selectedImagePath = selectedImageFile.getAbsolutePath();
                JOptionPane.showMessageDialog(null, selectedImagePath);

                ImageIcon ii =new ImageIcon(selectedImagePath );
                Path=selectedImagePath;

                Image image =ii.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
                jLabel7.setIcon(new ImageIcon(image));

            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (t1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "enter the id of Product that to be Deleted");
        }

        else{

            try{

                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");

                String id = t1.getText();
                String Query= "DELETE FROM `product1` WHERE Id="+id;

                stmt=conn.createStatement ();
                stmt.executeUpdate(Query);

                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
//                selectPro();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel model =  (DefaultTableModel) tbl.getModel();
        int i =tbl.getSelectedRow();

t1.setText (model.getValueAt(i , 0).toString());
t2.setText(model.getValueAt(i , 1).toString());
t3.setText (model.getValueAt(i , 2).toString());
t4.setText (model.getValueAt(i , 2).toString());
t5.setText (model.getValueAt(i , 4).toString());
t6.setText (model.getValueAt(i , 5).toString());
t7.setText (model.getValueAt(i , 6).toString());
jLabel7.setText(model.getValueAt(i , 7).toString());
t12.setText (model.getValueAt(i , 8).toString());
t9.setText (model.getValueAt(i , 9).toString());
t10.setText (model.getValueAt(i , 10).toString());
t11.setText (model.getValueAt(i , 11).toString());
    }//GEN-LAST:event_tblMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D;
    private javax.swing.JLabel T;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t9;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables

   
    }

   
    

   
    
       

  

    

  

