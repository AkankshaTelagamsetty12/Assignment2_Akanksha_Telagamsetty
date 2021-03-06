/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import cars.information;
import cars.fleet;
import java.util.regex.Pattern;
import ui.CreateJPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akankshatelagamsetty
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    fleet carfleet;
    public CreateJPanel(fleet carfleet) {
        initComponents();
        this.carfleet= carfleet;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSNo = new javax.swing.JTextField();
        lblSNo = new javax.swing.JLabel();
        lblmanufacturer = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        lblNodelNo = new javax.swing.JLabel();
        txtModelNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        txtAvailability = new javax.swing.JTextField();
        lblExpiration = new javax.swing.JLabel();
        txtExpiration = new javax.swing.JTextField();
        lblManufacturingYear = new javax.swing.JLabel();
        txtManufacturingYear = new javax.swing.JTextField();
        btnAddData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVerifyManuYear = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        txtSNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNoActionPerformed(evt);
            }
        });
        txtSNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSNoKeyTyped(evt);
            }
        });

        lblSNo.setText("S.no");

        lblmanufacturer.setText("Manufacturer");

        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });
        txtSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeatsKeyTyped(evt);
            }
        });

        lblSeats.setText("Seats");

        lblNodelNo.setText("Model No");

        txtModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNoActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblCity.setText("City");

        lblAvailability.setText("Availability");

        txtAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailabilityActionPerformed(evt);
            }
        });

        lblExpiration.setText("Maintenance Expiration Status");

        txtExpiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpirationActionPerformed(evt);
            }
        });

        lblManufacturingYear.setText("Manufactured Year");

        txtManufacturingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturingYearActionPerformed(evt);
            }
        });

        btnAddData.setText("Add Data");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Create and Modify Car Information");

        btnVerifyManuYear.setText("Verify");
        btnVerifyManuYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyManuYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblManufacturingYear)
                                        .addGap(105, 105, 105)
                                        .addComponent(txtManufacturingYear))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblExpiration)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnVerifyManuYear))
                            .addComponent(lblCity)
                            .addComponent(lblNodelNo)
                            .addComponent(lblAvailability)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeats)
                                    .addComponent(lblmanufacturer)
                                    .addComponent(lblSNo))
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCity)
                                    .addComponent(txtSeats)
                                    .addComponent(txtSNo)
                                    .addComponent(txtManufacturer)
                                    .addComponent(txtModelNo)
                                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnAddData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSNo)
                    .addComponent(txtSNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmanufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNodelNo)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExpiration)
                    .addComponent(txtExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturingYear)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerifyManuYear))
                .addGap(39, 39, 39)
                .addComponent(btnAddData)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNoActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed

        // TODO add your handling code here:
        //Add data to table
        //Validation to not give null inputs
        String serialno = txtSNo.getText();
            String manufacturer = txtManufacturer.getText();
            String seats = txtSNo.getText();
            String modelno = txtModelNo.getText();
            String city = txtCity.getText();
            String availabiltiy = txtAvailability.getText();
            String expiration = txtExpiration.getText();
            String yom = txtManufacturingYear.getText();
        
        information selectedCar = carfleet.addNewInfo();
        selectedCar.setSerialno(serialno);
        selectedCar.setManufacturer(manufacturer);
        selectedCar.setSeats(Integer.parseInt(seats));
        selectedCar.setModelno(modelno);
        selectedCar.setCity(city);
        selectedCar.setAvailabilty(availabiltiy);
        selectedCar.setExpiration(expiration);
        selectedCar.setYom(yom);
        
        /*

        if(txtSNo.getText().equals("")||txtManufacturer.getText().equals("")||txtSeats.getText().equals("")|| txtModelNo.getText().equals("")||txtCity.getText().equals("")||txtAvailability.getText().equals("") || txtExpiration.getText().equals("") || txtManufacturingYear.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter All Fields");

        }

        else{

            //storing data to string array
            String data[] = {txtSNo.getText(), txtManufacturer.getText(), txtSeats.getText(), txtModelNo.getText(), txtCity.getText(), txtAvailability.getText(), txtExpiration.getText(), txtManufacturingYear.getText()};

            DefaultTableModel tblModel = (DefaultTableModel)tblRecord.getModel();

            //add string array data into rows
            tblModel.addRow(data);

            JOptionPane.showMessageDialog(this, "Fields Added Successfully");
            txtSNo.setText("");
            txtManufacturer.setText("");
            txtSeats.setText("");
            txtModelNo.setText("");
            txtCity.setText("");
            txtAvailability.setText("");
            txtExpiration.setText("");
            txtManufacturingYear.setText("");

        } */
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void txtAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailabilityActionPerformed

    private void txtExpirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpirationActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtExpirationActionPerformed

    private void txtManufacturingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturingYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturingYearActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNoActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void btnVerifyManuYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyManuYearActionPerformed
        // TODO add your handling code here:
         if (!(Pattern.matches("^[12][0-9]{3}$", txtExpiration.getText()))) 
{
            JOptionPane.showMessageDialog(null, "Please enter a 4 digit year", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "The year is valid", "Good!", JOptionPane.INFORMATION_MESSAGE);

            }
    }//GEN-LAST:event_btnVerifyManuYearActionPerformed

    private void txtSeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatsKeyTyped
        // TODO add your handling code here:
        char zip = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar()))  {
            
            txtSeats.setEditable(true);}
        
        else{

            evt.consume();  
            JOptionPane.showMessageDialog(null, "Please enter a numeric value only");
            }
    }//GEN-LAST:event_txtSeatsKeyTyped

    private void txtSNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSNoKeyTyped
        // TODO add your handling code here:
        char zip = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar()))  {
            
            txtSNo.setEditable(true);}
        
        else{

            evt.consume();  
            JOptionPane.showMessageDialog(null, "Please enter a numeric value only");
            }
    }//GEN-LAST:event_txtSNoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnVerifyManuYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblExpiration;
    private javax.swing.JLabel lblManufacturingYear;
    private javax.swing.JLabel lblNodelNo;
    private javax.swing.JLabel lblSNo;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblmanufacturer;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpiration;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtSNo;
    private javax.swing.JTextField txtSeats;
    // End of variables declaration//GEN-END:variables
}
