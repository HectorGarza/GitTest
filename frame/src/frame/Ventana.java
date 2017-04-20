package frame;
import java.awt.Image;
import java.awt.Toolkit;
public class Ventana extends javax.swing.JFrame{  
    
    public static Employee[] list;
    public Ventana() {
       initComponents();
       list= new Employee[10];
       this.setLocationRelativeTo(null);
       Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("employees.png"));
       setIconImage(icon);
       setVisible(true);     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEleccion = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        btnShowList = new javax.swing.JButton();
        btnshowMarriedEmployees = new javax.swing.JButton();
        btnThreeKids = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnTotalOvertimePay = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Employees");

        lblEleccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEleccion.setText("What do you want to do?");

        jButtonAdd.setText("Add employee");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        btnShowList.setText("Show employee list");
        btnShowList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowListActionPerformed(evt);
            }
        });

        btnshowMarriedEmployees.setText("Show married employees");
        btnshowMarriedEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowMarriedEmployeesActionPerformed(evt);
            }
        });

        btnThreeKids.setText("Employee's with more than 3 children");
        btnThreeKids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeKidsActionPerformed(evt);
            }
        });

        jButton1.setText("Employee's with more than 1000 base salary");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTotalOvertimePay.setText("Show total overtime pay");
        btnTotalOvertimePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalOvertimePayActionPerformed(evt);
            }
        });

        jButton3.setText("Done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnShowList, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnshowMarriedEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThreeKids, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTotalOvertimePay, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdd)
                .addGap(18, 18, 18)
                .addComponent(btnShowList)
                .addGap(18, 18, 18)
                .addComponent(btnshowMarriedEmployees)
                .addGap(18, 18, 18)
                .addComponent(btnThreeKids)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnTotalOvertimePay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addEmploye jFrame= new addEmploye();//"Frame2" es el nombre que tu le pusiste a tu 2do jframe
        jFrame.setVisible(true);
   
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void btnShowListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowListActionPerformed
      ShowList list = new ShowList();
      list.setVisible(true); 
    }//GEN-LAST:event_btnShowListActionPerformed

    private void btnshowMarriedEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowMarriedEmployeesActionPerformed
        printMarriedEmployees marriedList = new printMarriedEmployees();
        marriedList.setVisible(true);
    }//GEN-LAST:event_btnshowMarriedEmployeesActionPerformed

    private void btnThreeKidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeKidsActionPerformed
        printEmployeesWithChildren childrenList = new printEmployeesWithChildren();
        childrenList.setVisible(true);
    }//GEN-LAST:event_btnThreeKidsActionPerformed

    private void btnTotalOvertimePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalOvertimePayActionPerformed
        TotalOvertimePay totalList = new TotalOvertimePay();
        totalList.setVisible(true);
        
    }//GEN-LAST:event_btnTotalOvertimePayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        print1000EmployeesSalary baseList = new print1000EmployeesSalary();
        baseList.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new Ventana().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowList;
    private javax.swing.JButton btnThreeKids;
    private javax.swing.JButton btnTotalOvertimePay;
    private javax.swing.JButton btnshowMarriedEmployees;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel lblEleccion;
    // End of variables declaration//GEN-END:variables
}
