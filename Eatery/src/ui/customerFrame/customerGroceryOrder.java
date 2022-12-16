/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customerFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.EateryEnterprise;
import model.Food;
import model.Grocery;
import model.Order;
import model.OrderStatus;
import model.Restaurant;
import javax.swing.JFileChooser;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ktkir
 */
public class customerGroceryOrder extends javax.swing.JPanel {

    /**
     * Creates new form customerGroceryOrder
     */
    EateryEnterprise eatery;
    Customer currentCustomer;
    List<Grocery> groceryList;
    List<Grocery> orderGroceryList;
    int orderTotalprice;
    public customerGroceryOrder(EateryEnterprise eatery, Customer currentCustomer) {
        initComponents();
        this.eatery=eatery;
        this.currentCustomer=currentCustomer;
        this.groceryList=eatery.getGroceries();
        this.orderGroceryList=new ArrayList<>();
        this.orderTotalprice=0;
        couponsDropdown.setSelectedItem(null);
        cityDropDown.setEnabled(false);
        displayGroceryTable();
        btnpdf.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cityDropDown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        groceryTable = new javax.swing.JTable();
        addToCart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        placeOrder = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textOrderTotal = new javax.swing.JTextField();
        textDeliveryInstructions = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        couponsDropdown = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnpdf = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Choose City");

        cityDropDown.setEditable(true);
        cityDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOSTON" }));
        cityDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityDropDownActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Your cart");

        groceryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Grocery Id", "Name", "Grocery Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(groceryTable);

        addToCart.setBackground(new java.awt.Color(102, 102, 102));
        addToCart.setForeground(new java.awt.Color(255, 255, 255));
        addToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N
        addToCart.setText("Add to Cart");
        addToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addToCartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addToCartMouseExited(evt);
            }
        });
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Choose your Grocery Order");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Grocery Name", "Grocery Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderTable);

        placeOrder.setText("Checkout");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Order Total ($):");

        jLabel5.setText("Delivery Instructions");

        couponsDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50OFF", "25OFF" }));

        jLabel8.setText("Coupons");

        btnpdf.setBackground(new java.awt.Color(102, 102, 102));
        btnpdf.setForeground(new java.awt.Color(255, 255, 255));
        btnpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        btnpdf.setText("DOWNLOAD BILL AS PDF");
        btnpdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpdfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpdfMouseExited(evt);
            }
        });
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(844, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(couponsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textDeliveryInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGap(55, 55, 55)
                        .addComponent(btnpdf))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(511, 511, 511))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCart)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDeliveryInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couponsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeOrder)
                    .addComponent(btnpdf))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(437, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(0, 153, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ORDER YOUR GROCERY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

      private void displayGroceryTable() 
     {
        groceryTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) groceryTable.getModel();
        tableModel.setRowCount(0);
        if (groceryList!=null) {
            for (int i = 0; i < groceryList.size(); i++) {
                Grocery grocery = groceryList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] =grocery.getGroceryId();
                tableRow[1] =grocery.getGroceryName();
                tableRow[2]= grocery.getPrice();
                tableModel.addRow(tableRow);
            }
        }
         
     }
    
      
      public void placeOrder(String deliveryAddress){
        Random random = new Random();
        int randomOrderId = random.nextInt(900) + 100;
        String delAddress=deliveryAddress;
        String instructions=textDeliveryInstructions.getText();      
  
    Order ord= new Order(randomOrderId,currentCustomer.getStateId(),-1,OrderStatus.ORDER_PLACED,delAddress,instructions,orderTotalprice,null,currentCustomer.getCity(),true,orderGroceryList,-1);  
eatery.placeOrder(ord);
            placeOrder.setEnabled(false);
btnpdf.setVisible(true);
  
}
    
    private void cityDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityDropDownActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
        int row=groceryTable.getSelectedRow();
        int col=0;
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
         int groceryId= Integer.parseInt(groceryTable.getModel().getValueAt(row, col).toString());
        Grocery groc= eatery.getGroceryById(groceryId);
        if(quantity.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter the quantity of the selected grocery item, to add it to your cart!");
        }
          if(!quantity.getText().matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(this, "The quantity should be a number!");
        }
        else if(!quantity.getText().equals(""))
        {
            changefoodQuantity(groc,Integer.parseInt(quantity.getText()));
            populateOrderTable();
        }
        }
        
    }//GEN-LAST:event_addToCartActionPerformed

    public void populateOrderTable(){
             orderTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) orderTable.getModel();
        tableModel.setRowCount(0);
        if (orderGroceryList!=null) {
            for (int i = 0; i < orderGroceryList.size(); i++) {
                Grocery grocery = orderGroceryList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] =grocery.getGroceryName();
                tableRow[1]= grocery.getPrice();
                tableRow[2]= grocery.getOrderQuantity();
                tableModel.addRow(tableRow);
            }
        }
     }
    
    
      public void changefoodQuantity(Grocery groc,int quantity)
    {   
       
        for(Grocery groce : this.orderGroceryList)
        {
            if(groce.getGroceryId()==groc.getGroceryId())
            {
                if(groce.getQuantity()<quantity)
                {
                    JOptionPane.showMessageDialog(this, "The grocery store doesn't have the quantity of the selected item!");
                    return;
                }
                else
                {
                       groce.setOrderQuantity(quantity); 
                        return;
                }
            
               
            }
        }
        
        
         if(groc.getQuantity()<quantity)
                {
                    JOptionPane.showMessageDialog(this, "The grocery store doesn't have the quantity of the selected item!");
                    return;
                }
                else
                {
                       groc.setOrderQuantity(quantity); 
                        this.orderGroceryList.add(groc);
                }
       
        
        
    }
    
    public void couponChecker()
    {
         int price=0;
        for(Grocery f : orderGroceryList)
        {
            price+=(f.getPrice()* f.getOrderQuantity());
        }
         orderTotalprice=price;
        textOrderTotal.setText(String.valueOf(orderTotalprice));
        

    
        orderTotalprice=price;
            if(couponsDropdown.getSelectedItem()!=null)
        {
            if(couponsDropdown.getSelectedItem().toString()=="50OFF")
            {
                if(orderTotalprice>100)
                {
                    
                    orderTotalprice=orderTotalprice/2;
                    
                }
                else
                {
                   
                    couponsDropdown.setSelectedItem(null);
                    JOptionPane.showMessageDialog(this, "Order for atelast 100$ to avail this coupon!");
                }
                
            }
            else if(couponsDropdown.getSelectedItem().toString()=="25OFF")
            {
                
                if(orderTotalprice>50)
                {
                    orderTotalprice=(int) ((int)orderTotalprice*0.75);
                   
                }
                else
                {
 couponsDropdown.setSelectedItem(null);
                    JOptionPane.showMessageDialog(this, "Order for atelast 50$ to avail this coupon!");
                }
               
            }
            textOrderTotal.setText(String.valueOf(orderTotalprice));
        }
            
            
           
    }
    
    
    
    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        // TODO add your handling code here:
   couponChecker();
            if(!textDeliveryInstructions.getText().equals(""))
            {
                
                placeOrder(currentCustomer.getAddress());
                JOptionPane.showMessageDialog(this, "Your total order price is $"+orderTotalprice +"!");
                JOptionPane.showMessageDialog(this, "Order placed with restaraunt!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please enter the delivery instructions, to palce your order!");
            }

       
    }//GEN-LAST:event_placeOrderActionPerformed

    private void btnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpdfActionPerformed
        // TODO add your handling code here:
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);

        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();

        }

        Document doc = new Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Order.pdf"));

            doc.open();

            PdfPTable tb1 = new PdfPTable(3);
            PdfPTable tb2 = new PdfPTable(2);
            PdfPTable tb3 = new PdfPTable(2);

            tb1.setSpacingAfter(10f);
            tb2.setSpacingAfter(10f);
            tb3.setSpacingAfter(10f);

            tb1.addCell("Grocery Name");
            tb1.addCell("Grocery Price");
            tb1.addCell("Quantity");

            tb3.addCell("Offer Applied");
            if(couponsDropdown.getSelectedItem()==null)
            {
                tb3.addCell("No Coupons applied!");
            }else
            {
                tb3.addCell(couponsDropdown.getSelectedItem().toString());
            }

            tb2.addCell("Total Amount");
            tb2.addCell(textOrderTotal.getText());
            for(int i=0;i<orderTable.getRowCount();i++)
            {
                String groceryName = orderTable.getValueAt(i,0).toString();
                String groceryPrice = orderTable.getValueAt(i,1).toString();
                String Quantity = orderTable.getValueAt(i,2).toString();

                tb1.addCell(groceryName);
                tb1.addCell(groceryPrice);
                tb1.addCell(Quantity);
            }
            doc.add(tb1);
            doc.add(tb3);
            doc.add(tb2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(customerFoodOrder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(customerFoodOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        this.groceryList=eatery.getGroceries();
        displayGroceryTable();
          this.orderGroceryList= new ArrayList<>();
        populateOrderTable();
        textDeliveryInstructions.setText("");
        orderTotalprice=-1;
        textOrderTotal.setText("");
        quantity.setText("");
        btnpdf.setVisible(false);
        doc.close();

    }//GEN-LAST:event_btnpdfActionPerformed

    private void addToCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToCartMouseEntered
        // TODO add your handling code here:
        addToCart.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_addToCartMouseEntered

    private void addToCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToCartMouseExited
        // TODO add your handling code here:
        addToCart.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_addToCartMouseExited

    private void btnpdfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpdfMouseEntered
        // TODO add your handling code here:
        btnpdf.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnpdfMouseEntered

    private void btnpdfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpdfMouseExited
        // TODO add your handling code here:
        btnpdf.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnpdfMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JButton btnpdf;
    private javax.swing.JComboBox<String> cityDropDown;
    private javax.swing.JComboBox<String> couponsDropdown;
    private javax.swing.JTable groceryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton placeOrder;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField textDeliveryInstructions;
    private javax.swing.JTextField textOrderTotal;
    // End of variables declaration//GEN-END:variables
}
