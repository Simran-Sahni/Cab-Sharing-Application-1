/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking;
import static cabbooking.HeadQuater.CalculateFare;
import java.util.*;
/**
 *
 * @author Dell
 */
public class TripDetails extends javax.swing.JFrame {

       


Customer currentuser;
    /**
     * Creates new form TripDetails
     * @param currentbooking
     * @param trip_reference
     * @param tripdriver
     * @param ob
     */

String pickuploc,droploc;
    public TripDetails(Booking currentbooking,Customer ob,Driver tripdriver) {
        initComponents();
        currentuser = ob;
        HeadQuater.CallRandomize();
        
          pickuploc = HeadQuater.getLocationDescription(Integer.parseInt(currentbooking.getPickUpLocation()));
        droploc = HeadQuater.getLocationDescription(Integer.parseInt(currentbooking.getDropLocation()));
        
        drivername.setText(tripdriver.getDriverName());
        driver_id.setText(String.valueOf(tripdriver.getDriverId())); 
       Pickup_Location.setText(HeadQuater.getLocationDescription(Integer.parseInt(currentbooking.getPickUpLocation())));
        Drop_Location.setText(HeadQuater.getLocationDescription(Integer.parseInt(currentbooking.getDropLocation())));
        int Duration = HeadQuater.CalculateTripDuration(HeadQuater.getLocationDescription(Integer.parseInt(currentbooking.getPickUpLocation())),HeadQuater.getLocationDescription(Integer.parseInt(currentbooking.getDropLocation())));
         Duration_.setText(String.valueOf(Duration)  + " Min");    
         car_name.setText(tripdriver.getVehicleName());
         car_id.setText(tripdriver.getVehicleNumber());
         Number_.setText(tripdriver.getPhoneNumber());
         Rating_.setText(String.valueOf(tripdriver.getRating()));
         Fare_.setText("Rs "+String.valueOf(HeadQuater.CalculateFare(pickuploc,droploc)));
        
        Timer timer = new Timer();
        if(new Scheduler().scheduledExecutionTime()==0)
        {
            timer.schedule(new Scheduler(),60000,30000);
        }
        
        
      
    }
      /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        drivername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Pickup_Location = new javax.swing.JLabel();
        Duration_ = new javax.swing.JLabel();
        Drop_Location = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        car_id = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        driver_id = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        car_name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Rating_ = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fare_ = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Number_ = new javax.swing.JLabel();
        GoogleMaps = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Status:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Duration:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fare:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 1200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Trip  Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Driver:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Duration:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Driver Id ");

        Back.setBackground(java.awt.Color.darkGray);
        Back.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        Back.setForeground(java.awt.Color.white);
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        drivername.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        drivername.setForeground(new java.awt.Color(255, 255, 255));
        drivername.setText("drivername");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("From:");

        Pickup_Location.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Pickup_Location.setForeground(new java.awt.Color(255, 255, 255));
        Pickup_Location.setText("PickupLocation");

        Duration_.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Duration_.setForeground(new java.awt.Color(255, 255, 255));
        Duration_.setText("Duration");

        Drop_Location.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Drop_Location.setForeground(new java.awt.Color(255, 255, 255));
        Drop_Location.setText("DropLocation");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("To:");

        car_id.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        car_id.setForeground(new java.awt.Color(255, 255, 255));
        car_id.setText("Car ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Car Name :");

        driver_id.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        driver_id.setForeground(new java.awt.Color(255, 255, 255));
        driver_id.setText("DriverId");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Car Number:");

        car_name.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        car_name.setForeground(new java.awt.Color(255, 255, 255));
        car_name.setText("Car Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rating:");

        Rating_.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Rating_.setForeground(new java.awt.Color(255, 255, 255));
        Rating_.setText("Rating");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fare:");

        Fare_.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Fare_.setForeground(new java.awt.Color(255, 255, 255));
        Fare_.setText("Fare");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Driver's Number");

        Number_.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Number_.setForeground(new java.awt.Color(255, 255, 255));
        Number_.setText("Number");

        GoogleMaps.setBackground(java.awt.Color.darkGray);
        GoogleMaps.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        GoogleMaps.setForeground(java.awt.Color.white);
        GoogleMaps.setText("Show Google Maps");
        GoogleMaps.setPreferredSize(new java.awt.Dimension(51, 31));
        GoogleMaps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoogleMapsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(530, 530, 530))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drivername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(driver_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Number_, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Rating_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(car_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(car_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Pickup_Location, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                    .addComponent(Drop_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Duration_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Fare_, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(GoogleMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(805, 805, 805)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(478, 478, 478))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drivername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(driver_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel15))
                    .addComponent(Number_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rating_, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car_name)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(car_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Pickup_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Drop_Location))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Duration_, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Fare_, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GoogleMaps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(274, 274, 274))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
             new bookcab(currentuser).setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_BackActionPerformed

    private void GoogleMapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoogleMapsActionPerformed
        // TODO add your handling code here:
        
        HeadQuater.googleMapDirections(pickuploc, droploc);
    }//GEN-LAST:event_GoogleMapsActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TripDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new TripDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Drop_Location;
    private javax.swing.JLabel Duration_;
    private javax.swing.JLabel Fare_;
    private javax.swing.JButton GoogleMaps;
    private javax.swing.JLabel Number_;
    private javax.swing.JLabel Pickup_Location;
    private javax.swing.JLabel Rating_;
    private javax.swing.JLabel car_id;
    private javax.swing.JLabel car_name;
    private javax.swing.JLabel driver_id;
    private javax.swing.JLabel drivername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
