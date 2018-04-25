
import java.sql.*;
import javax.swing.*;

public class RegistrationApp extends javax.swing.JFrame {

    public RegistrationApp() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Title = new javax.swing.JLabel();
        RegistrationBtn = new javax.swing.JButton();
        labelFamily = new javax.swing.JLabel();
        labelCountry = new javax.swing.JLabel();
        labelWorkshop1 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelWorkshop2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Family = new javax.swing.JTextField();
        Country = new javax.swing.JComboBox<>();
        Workshop1 = new javax.swing.JComboBox<>();
        Workshop2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        Title.setText("Register for workshop");

        RegistrationBtn.setBackground(new java.awt.Color(153, 102, 255));
        RegistrationBtn.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        RegistrationBtn.setForeground(new java.awt.Color(102, 0, 255));
        RegistrationBtn.setText("Register");
        RegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clicked(evt);
            }
        });

        labelFamily.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        labelFamily.setText("Family");

        labelCountry.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        labelCountry.setText("Country");

        labelWorkshop1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        labelWorkshop1.setText("1st workshop");

        labelName.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        labelName.setText("Name");

        labelWorkshop2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        labelWorkshop2.setText("2nd workshop");

        Family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyActionPerformed(evt);
            }
        });

        Country.setEditable(true);
        Country.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Latvija", "Lietuva", "Itālija" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Country, org.jdesktop.beansbinding.ObjectProperty.create(), Country, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);

        Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryActionPerformed(evt);
            }
        });

        Workshop1.setEditable(true);
        Workshop1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        Workshop1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Workshop 1", "Workshop 2", "Workshop 3", "Workshop 4" }));
        Workshop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Workshop1ActionPerformed(evt);
            }
        });

        Workshop2.setEditable(true);
        Workshop2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        Workshop2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Workshop 1", "Workshop 2", "Workshop 3", "Workshop 4" }));
        Workshop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Workshop2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RegistrationBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelWorkshop1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelWorkshop2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelCountry)
                                        .addComponent(labelFamily)
                                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name)
                            .addComponent(Family, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(Country, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Workshop1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Workshop2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Title)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Family, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWorkshop1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workshop1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWorkshop2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workshop2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegistrationBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Clicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clicked

        try {
            String url = "jdbc:mysql://localhost:3306/registrations1";
            String username = "root";
            String password = "karnaka";

            Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        String Query = "INSERT INTO registrations (NAME, FAMILY, Country, WORKSHOP_1, WORKSHOP_2) VALUES ('"+Name.getText()+"', '"+Family.getText()+"', '"+Country.getSelectedItem()+"', '"+Workshop1.getSelectedItem()+"', '"+Workshop2.getSelectedItem()+"')";
        
        stmt.execute(Query);
        
        JOptionPane.showMessageDialog(null, "Esi reģistrējies, refresho");
        Name.setText (null);
        Family.setText(null);
        Country.setSelectedItem("Latvia");
        Workshop1.setSelectedItem("Workshop 1");
        Workshop1.setSelectedItem("Workshop 2");
        
        
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_Clicked

    private void FamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FamilyActionPerformed

    private void CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryActionPerformed

    }//GEN-LAST:event_CountryActionPerformed

    private void Workshop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Workshop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Workshop1ActionPerformed

    private void Workshop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Workshop2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Workshop2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Country;
    private javax.swing.JTextField Family;
    private javax.swing.JTextField Name;
    private javax.swing.JButton RegistrationBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox<String> Workshop1;
    private javax.swing.JComboBox<String> Workshop2;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelFamily;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelWorkshop1;
    private javax.swing.JLabel labelWorkshop2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
