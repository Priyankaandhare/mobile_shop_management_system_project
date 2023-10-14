/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import static mobile.Stock.conn;
import static mobile.Stock.rs;
import static mobile.Stock.stmt;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PC
 */
public class Pos extends javax.swing.JFrame {

    /**
     * Creates new form Pos
     */
    public Pos() {
        initComponents();
        
           showDate();
       showTime();
    }
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
   
      public void selectPos() {
            try{ 
                conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");
            
            stmt = conn.createStatement();
            
             
            rs =stmt.executeQuery("SELECT * FROM pos"); 
            DefaultTableModel model = (DefaultTableModel) Ps_tbl.getModel() ;
            Ps_tbl.setModel(DbUtils.resultSetToTableModel(rs)); 
            
            
            
            }catch (SQLException ex){
                 ex.printStackTrace();
            }
            }
      
      
public void Invoice(){
String total= t8.getText ();

String pay =t9.getText ();

String bal =t10.getText();

DefaultTableModel model =new DefaultTableModel();

model = (DefaultTableModel) Ps_tbl.getModel();

jTextArea1.setText (jTextArea1.getText()+ "*************************************************************\n");
jTextArea1.setText (jTextArea1.getText()+ "                         SALE RECEIPT                         \n");
jTextArea1.setText (jTextArea1.getText()+ "*************************************************************\n");
        
jTextArea1.setText (jTextArea1.getText()+"Customer Name :"+"\t");
int i = 0;
String cname = (String) model.getValueAt (i, 1);
jTextArea1.setText (jTextArea1.getText() + cname + "\n" ); 

jTextArea1.setText (jTextArea1.getText()+ "*************************************************************\n");
        
jTextArea1.setText (jTextArea1.getText()+"product:" + "\t" + "Price" +"\t"+"Quantity" + "\t"+ "Amount" +"\n");
for ( i = 0; i < model.getRowCount (); i++)
{
String pname = (String) model.getValueAt (i, 3);

String price =(String) model.getValueAt (i, 4); 
String amount= (String) model.getValueAt (i, 6);
String Quantity =(String) model.getValueAt (i, 5); 

jTextArea1.setText (jTextArea1.getText() + pname + "\t" + price +"\t"+Quantity+ "\t"+amount+ "\n" );

}

jTextArea1.setText (jTextArea1.getText() + "\n"); 

jTextArea1.setText (jTextArea1.getText()+ "*************************************************************\n");

jTextArea1.setText (jTextArea1.getText ()  + "Total:" + total + "\n");

jTextArea1.setText (jTextArea1.getText ()   + "Pay :" + pay + "\n");

jTextArea1.setText (jTextArea1.getText ()   + "Balance "+bal + "\n");

jTextArea1.setText (jTextArea1.getText () + "\n");

jTextArea1.setText (jTextArea1.getText()+ "*************************************************************\n");

jTextArea1.setText (jTextArea1.getText () +"\n");

jTextArea1.setText (jTextArea1.getText()+ "                  THANK YOU COME AGAIN....!                \n\n");

jTextArea1.setText (jTextArea1.getText()+ "*************************************************************\n");
String date=D.getText();
String time=T.getText();
     jTextArea1.setText (jTextArea1.getText()+"Date :"+date+"\t\t\t\t" +"Time:"+time);
     jTextArea1.setText (jTextArea1.getText () + "\n");
     jTextArea1.setText (jTextArea1.getText()+"Contact:"+"\t"+"MobileTech@001gmail.com"+"\n" );
     jTextArea1.setText (jTextArea1.getText()+"7356789034"+"\t"+"8975427595"+"\n" );
     
        }  
      

      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ps_tbl = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
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

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/back.jpg"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/pp.jpg"))); // NOI18N
        jLabel8.setText("\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(175, 175, 175)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(D)
                        .addGap(18, 18, 18)
                        .addComponent(T))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 13, 180, 30));
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 63, 180, 29));
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 110, 180, 28));
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 180, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Customer\n");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Pro_Id\n");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Unit_Price\n");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Pro_Name\n");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 72, -1));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 180, 32));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total_Price\n\n\n");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 180, 28));

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 180, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("  quantity\n");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Date");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 180, 31));

        Ps_tbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ps_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Customer", "Pro_Id", "Pro_Name", "Unit_Price", "Quantity", "Total_Price", "Date", "total", "pay", "Balance"
            }
        ));
        Ps_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ps_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Ps_tbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 510, 230));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Balance");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Pay");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Total");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));
        jPanel2.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 173, 28));
        jPanel2.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 173, 28));
        jPanel2.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 173, 28));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 0, 102));
        jButton9.setText("Print Invoice");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, 39));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 7, 320, 590));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/delete.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 55, 50));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/up.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 52, 51));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Saved Pictures/add.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 55, 54));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Id\n");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      int check=0;

String id=t3.getText();

if (id.equals(""))
{

check=1;

JOptionPane.showMessageDialog(null, "Id Field Is Required");
}
else{
try{
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Forget.class.getName()).log(Level.SEVERE, null, ex);
    }
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");
PreparedStatement st = (PreparedStatement) conn.prepareStatement("select Name from product1 WHERE Id = '"+id+"'");
 ResultSet res = (ResultSet) st.executeQuery();    
if(res.next()){
    check =1;
    
    t3 .setEditable(false);
    
   t4.setEditable (false);
    
    t4.setText(res.getString(1));
} else {
}
}catch (NullPointerException ex){
     ex.printStackTrace();
       

    }       catch (SQLException ex) {
                 ex.printStackTrace();
       
           
            }

}
if(check==0)
{
  
     JOptionPane.showConfirmDialog(this,"Product is not Available","information ",JOptionPane.INFORMATION_MESSAGE); 
    
    }






    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        Date Date = jDateChooser1.getDate();

        java.sql.Date MyDate = new java.sql.Date (Date.getTime());

        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
            }

            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");

            PreparedStatement st =  (PreparedStatement)conn.prepareStatement("insert into pos(Id,Customer,ProId,ProName,unitPrice,Quantity,TotalPrice,Date)Values(?,?,?,?,?,?,?,?)");
            st.setInt(1, Integer.valueOf(t1.getText()));
            st.setString(2,t2.getText());
            st.setString(3,t3.getText());
            st.setString(4,t4.getText());
            st.setString(5,t5.getText());
            st.setInt(6, (int) jSpinner1.getValue());
            st.setString(7,t6.getText());
            st.setDate(8, MyDate);

            //st.setString(5, Catch.getSelectedItem().toString());
            int rs= st.executeUpdate();
            //if(rs.next())

            JOptionPane.showMessageDialog(this," Pos Successfully Added");
          selectPos();
        } catch(SQLException ex)
        {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (t1.getText().isEmpty()||t3.getText().isEmpty()){

            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            Date Date = jDateChooser1.getDate();

            java.sql.Date MyDate = new java.sql.Date (Date.getTime());
            try{
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
                }
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");

                String updateQuery ="UPDATE pos Customer=?,ProId=?,ProName=?,unitPrice=?,Quantity=?,TotalPrice=?,Date=? WHERE Id=?";

                PreparedStatement st =  (PreparedStatement)conn.prepareStatement(updateQuery);

                st.setInt(8, Integer.valueOf(t1.getText()));
                st.setString(1,t2.getText());
            st.setString(2,t3.getText());
            st.setString(3,t4.getText());
            st.setString(4,t5.getText());
            st.setInt(5, (int) jSpinner1.getValue());
            st.setString(6,t6.getText());
            st.setDate(7, MyDate);

                
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Successfully");
                selectPos();
            }    catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (t1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "enter the id of Pos that to be Deleted");
        }

        else{

            try{

                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");

                String Id = t1.getText();
                String Query= "DELETE FROM pos WHERE Id="+Id;

                stmt=conn.createStatement ();
                stmt.executeUpdate(Query);

                JOptionPane.showMessageDialog(this, "Pos Deleted Successfully");
              selectPos();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void Ps_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ps_tblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =  (DefaultTableModel) Ps_tbl.getModel();
        int i =Ps_tbl.getSelectedRow();

        t1.setText (model.getValueAt(i , 0).toString());
        t2.setText (model.getValueAt(i , 1).toString());
        t3.setText (model.getValueAt(i , 2).toString());
        t4.setText (model.getValueAt(i , 3).toString());
        t5.setText (model.getValueAt(i , 4).toString());
        jSpinner1.setValue (model.getValueAt(i , 6));
        t6.setText (model.getValueAt(i , 7).toString());
        jDateChooser1.setDate((Date)model.getValueAt(i , 8));
         //t8.setText (model.getValueAt(i , 9).toString());
         // t9.setText (model.getValueAt(i , 10).toString());
         //t10.setText (model.getValueAt(i , 11).toString());

    }//GEN-LAST:event_Ps_tblMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int Total = Integer.parseInt( t8.getText());
        int pay=Integer.parseInt(t9.getText());
        int balance=Total-pay;
        t10.setText( String.valueOf(balance));
       Invoice();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
         int Qty = Integer.parseInt( jSpinner1.getValue().toString());
        int price=Integer.parseInt(t5.getText());
        int total=Qty*price;
        t6.setText( String.valueOf(total));
        t8.setText( String.valueOf(total));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D;
    public static javax.swing.JTable Ps_tbl;
    private javax.swing.JLabel T;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
