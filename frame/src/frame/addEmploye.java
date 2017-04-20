
package frame;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class addEmploye extends javax.swing.JFrame {
    

   
    private static int count=0 ;
    private static boolean married = false;
    private static int id ;
    private static String name ;
    private static double baseSalary ;
    private static int children ;

    
    public addEmploye()
    {
        initComponents();    
        this.setLocationRelativeTo(null);
        Image addEmployee = Toolkit.getDefaultToolkit().getImage(getClass().getResource("employee.png"));
        setIconImage(addEmployee);
        setVisible(true);    
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnListo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtBaseSalary = new javax.swing.JTextField();
        lblBaseSalary = new javax.swing.JLabel();
        lblChildren = new javax.swing.JLabel();
        txtChildren = new javax.swing.JTextField();
        lblExtraHours = new javax.swing.JLabel();
        txtExtraHours = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add employee");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        lblId.setText("ID");

        btnListo.setText("Done");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        jLabel1.setText("Married");

        jCheckBox1.setText("Yes");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        txtBaseSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseSalaryActionPerformed(evt);
            }
        });

        lblBaseSalary.setText("Base Salary");

        lblChildren.setText("Children");

        txtChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChildrenActionPerformed(evt);
            }
        });

        lblExtraHours.setText("Extra hours worked ");

        txtExtraHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExtraHoursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblBaseSalary)
                    .addComponent(lblChildren)
                    .addComponent(lblExtraHours))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtId)
                            .addComponent(txtBaseSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtChildren)
                            .addComponent(txtExtraHours))))
                .addGap(255, 255, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBaseSalary))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChildren)
                    .addComponent(txtChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExtraHours)
                    .addComponent(txtExtraHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnListo)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
          
          int extraHours;
          int children;


          String name ;
          double baseSalary ;
          
          int id  = Integer.parseInt(txtId.getText());
          name = txtName.getText();
          baseSalary = Double.parseDouble(txtBaseSalary.getText());
         
          if (txtChildren.getText().equals(""))
          {
             children = 0;
          }
          else
          {
              children = Integer.parseInt(txtChildren.getText());
          }
          
          if(txtExtraHours.getText().equals(""))
          {
            extraHours = 0;
          }
          else
          {
            extraHours = Integer.parseInt(txtExtraHours.getText());
          }
          
          // Employee newData = new Employee(id, name, baseSalary, married, children);
          if(count<Ventana.list.length)
          {
           Ventana.list[count] = new Employee(id, name, baseSalary, married, children);
           Ventana.list[count].setExtraHours(extraHours);
           Ventana.list[count].calculateTypeTax();
           Ventana.list[count].calculateTax();
           Ventana.list[count].calculateOvertimePay();
           Ventana.list[count].calculateGrossSalary();
           married = false;
           count++;
          }
          else
          {
             JOptionPane.showMessageDialog(null, "Your list is alredy full", "Warning", JOptionPane.WARNING_MESSAGE);
          }
         
           
          this.dispose();      
    }//GEN-LAST:event_btnListoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
             married = true;          
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtBaseSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaseSalaryActionPerformed

    private void txtChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChildrenActionPerformed
   
    }//GEN-LAST:event_txtChildrenActionPerformed

    private void txtExtraHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExtraHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExtraHoursActionPerformed


    public static void main(String args[]) {
      

          
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEmploye().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBaseSalary;
    private javax.swing.JLabel lblChildren;
    private javax.swing.JLabel lblExtraHours;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtBaseSalary;
    private javax.swing.JTextField txtChildren;
    private javax.swing.JTextField txtExtraHours;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
