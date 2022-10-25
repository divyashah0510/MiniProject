
package October_25_2022;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TodocallingPanel = new javax.swing.JPanel();
        FormHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MemberPanel = new javax.swing.JPanel();
        MemberDetails = new javax.swing.JLabel();
        MemberMasterPanel = new javax.swing.JPanel();
        MMasterDetails = new javax.swing.JLabel();
        MaintenancePanel = new javax.swing.JPanel();
        MaintenanceForm = new javax.swing.JLabel();
        MasterPanel = new javax.swing.JPanel();
        MasterForm = new javax.swing.JLabel();
        MaintenanceBillPanel = new javax.swing.JPanel();
        MBillForm = new javax.swing.JLabel();
        AssociateMemberPanel = new javax.swing.JPanel();
        AMemberForm = new javax.swing.JLabel();
        NommineeFormPanel = new javax.swing.JPanel();
        NForm = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        jp2 = new javax.swing.JPanel();
        jp3 = new javax.swing.JPanel();
        jp4 = new javax.swing.JPanel();
        jp5 = new javax.swing.JPanel();
        jp6 = new javax.swing.JPanel();
        jp7 = new javax.swing.JPanel();
        jp8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TodocallingPanel.setBackground(new java.awt.Color(255, 255, 255));
        TodocallingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TodocallingPanelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SOCIETY MAINTENACE");

        javax.swing.GroupLayout FormHeadLayout = new javax.swing.GroupLayout(FormHead);
        FormHead.setLayout(FormHeadLayout);
        FormHeadLayout.setHorizontalGroup(
            FormHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FormHeadLayout.setVerticalGroup(
            FormHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormHeadLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MemberPanel.setBackground(new java.awt.Color(0, 0, 0));
        MemberPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberPanelMouseClicked(evt);
            }
        });

        MemberDetails.setBackground(new java.awt.Color(255, 255, 255));
        MemberDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MemberDetails.setForeground(new java.awt.Color(255, 255, 255));
        MemberDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemberDetails.setText("Member Details");
        MemberDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberDetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MemberPanelLayout = new javax.swing.GroupLayout(MemberPanel);
        MemberPanel.setLayout(MemberPanelLayout);
        MemberPanelLayout.setHorizontalGroup(
            MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MemberDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MemberPanelLayout.setVerticalGroup(
            MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MemberDetails)
                .addContainerGap())
        );

        MemberMasterPanel.setBackground(new java.awt.Color(0, 0, 0));
        MemberMasterPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberMasterPanelMouseClicked(evt);
            }
        });

        MMasterDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MMasterDetails.setForeground(new java.awt.Color(255, 255, 255));
        MMasterDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MMasterDetails.setText("Member Master");
        MMasterDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMasterDetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MemberMasterPanelLayout = new javax.swing.GroupLayout(MemberMasterPanel);
        MemberMasterPanel.setLayout(MemberMasterPanelLayout);
        MemberMasterPanelLayout.setHorizontalGroup(
            MemberMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberMasterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MMasterDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MemberMasterPanelLayout.setVerticalGroup(
            MemberMasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberMasterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MMasterDetails)
                .addContainerGap())
        );

        MaintenancePanel.setBackground(new java.awt.Color(0, 0, 0));

        MaintenanceForm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MaintenanceForm.setForeground(new java.awt.Color(255, 255, 255));
        MaintenanceForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaintenanceForm.setText("Maintenance Form");
        MaintenanceForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaintenanceFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MaintenancePanelLayout = new javax.swing.GroupLayout(MaintenancePanel);
        MaintenancePanel.setLayout(MaintenancePanelLayout);
        MaintenancePanelLayout.setHorizontalGroup(
            MaintenancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaintenancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaintenanceForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MaintenancePanelLayout.setVerticalGroup(
            MaintenancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaintenancePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaintenanceForm)
                .addContainerGap())
        );

        MasterPanel.setBackground(new java.awt.Color(0, 0, 0));
        MasterPanel.setForeground(new java.awt.Color(255, 255, 255));

        MasterForm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MasterForm.setForeground(new java.awt.Color(255, 255, 255));
        MasterForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MasterForm.setText("Master");
        MasterForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasterFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MasterPanelLayout = new javax.swing.GroupLayout(MasterPanel);
        MasterPanel.setLayout(MasterPanelLayout);
        MasterPanelLayout.setHorizontalGroup(
            MasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MasterForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MasterPanelLayout.setVerticalGroup(
            MasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MasterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MasterForm)
                .addContainerGap())
        );

        MaintenanceBillPanel.setBackground(new java.awt.Color(0, 0, 0));

        MBillForm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MBillForm.setForeground(new java.awt.Color(255, 255, 255));
        MBillForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MBillForm.setText("Maintenance Bill");
        MBillForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MBillFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MaintenanceBillPanelLayout = new javax.swing.GroupLayout(MaintenanceBillPanel);
        MaintenanceBillPanel.setLayout(MaintenanceBillPanelLayout);
        MaintenanceBillPanelLayout.setHorizontalGroup(
            MaintenanceBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaintenanceBillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MBillForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MaintenanceBillPanelLayout.setVerticalGroup(
            MaintenanceBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaintenanceBillPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MBillForm)
                .addContainerGap())
        );

        AssociateMemberPanel.setBackground(new java.awt.Color(0, 0, 0));

        AMemberForm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AMemberForm.setForeground(new java.awt.Color(255, 255, 255));
        AMemberForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AMemberForm.setText("Associate Member Form (Form 14D)");
        AMemberForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMemberFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AssociateMemberPanelLayout = new javax.swing.GroupLayout(AssociateMemberPanel);
        AssociateMemberPanel.setLayout(AssociateMemberPanelLayout);
        AssociateMemberPanelLayout.setHorizontalGroup(
            AssociateMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssociateMemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AMemberForm, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        AssociateMemberPanelLayout.setVerticalGroup(
            AssociateMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssociateMemberPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AMemberForm)
                .addContainerGap())
        );

        NommineeFormPanel.setBackground(new java.awt.Color(0, 0, 0));

        NForm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NForm.setForeground(new java.awt.Color(255, 255, 255));
        NForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NForm.setText("Nomminee Form");
        NForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NommineeFormPanelLayout = new javax.swing.GroupLayout(NommineeFormPanel);
        NommineeFormPanel.setLayout(NommineeFormPanelLayout);
        NommineeFormPanelLayout.setHorizontalGroup(
            NommineeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NommineeFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NForm, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        NommineeFormPanelLayout.setVerticalGroup(
            NommineeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NommineeFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NForm)
                .addContainerGap())
        );

        javax.swing.GroupLayout TodocallingPanelLayout = new javax.swing.GroupLayout(TodocallingPanel);
        TodocallingPanel.setLayout(TodocallingPanelLayout);
        TodocallingPanelLayout.setHorizontalGroup(
            TodocallingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MemberMasterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MaintenancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MasterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MaintenanceBillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AssociateMemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NommineeFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TodocallingPanelLayout.setVerticalGroup(
            TodocallingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodocallingPanelLayout.createSequentialGroup()
                .addComponent(FormHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MemberMasterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaintenancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MasterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaintenanceBillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AssociateMemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NommineeFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jp1.setBackground(new java.awt.Color(255, 153, 153));

        jp2.setBackground(new java.awt.Color(255, 102, 102));

        jp3.setBackground(new java.awt.Color(102, 0, 0));

        jp4.setBackground(new java.awt.Color(102, 255, 51));

        jp5.setBackground(new java.awt.Color(0, 255, 204));

        jp6.setBackground(new java.awt.Color(255, 255, 51));

        jp7.setBackground(new java.awt.Color(0, 153, 102));

        jp8.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jp8Layout = new javax.swing.GroupLayout(jp8);
        jp8.setLayout(jp8Layout);
        jp8Layout.setHorizontalGroup(
            jp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        jp8Layout.setVerticalGroup(
            jp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp7Layout = new javax.swing.GroupLayout(jp7);
        jp7.setLayout(jp7Layout);
        jp7Layout.setHorizontalGroup(
            jp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp7Layout.setVerticalGroup(
            jp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp6Layout = new javax.swing.GroupLayout(jp6);
        jp6.setLayout(jp6Layout);
        jp6Layout.setHorizontalGroup(
            jp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp6Layout.setVerticalGroup(
            jp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp5Layout = new javax.swing.GroupLayout(jp5);
        jp5.setLayout(jp5Layout);
        jp5Layout.setHorizontalGroup(
            jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp5Layout.setVerticalGroup(
            jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TodocallingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TodocallingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MemberDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberDetailsMouseClicked
        // TODO add your handling code here:
        jp1.setVisible(true);
        
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        jp5.setVisible(false);
        jp6.setVisible(false);
        jp7.setVisible(false);
        jp8.setVisible(false);
        jp1.setBackground(Color.ORANGE);
         JOptionPane.showMessageDialog(this, "Member details ");
    }//GEN-LAST:event_MemberDetailsMouseClicked

    private void MMasterDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMasterDetailsMouseClicked
        // TODO add your handling code here:
        jp1.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        jp5.setVisible(false);
        jp6.setVisible(false);
        jp7.setVisible(false);
        jp8.setVisible(false);
        jp2.setVisible(true);
        

        jp2.setBackground(Color.GREEN);
        JOptionPane.showMessageDialog(this, "Member Master ");
        Form1 form1 = new Form1();
        form1.setVisible(true);
    }//GEN-LAST:event_MMasterDetailsMouseClicked

    private void MemberPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberPanelMouseClicked

    private void MaintenanceFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaintenanceFormMouseClicked
        // TODO add your handling code here:
        jp3.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp4.setVisible(false);
        jp5.setVisible(false);
        jp6.setVisible(false);
        jp7.setVisible(false);
        jp8.setVisible(false);
        MaintenanceForm.setBackground(Color.yellow);
         JOptionPane.showMessageDialog(this, "Maintenance ");
        
    }//GEN-LAST:event_MaintenanceFormMouseClicked

    private void MasterFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasterFormMouseClicked
        // TODO add your handling code here:
        jp4.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp5.setVisible(false);
        jp6.setVisible(false);
        jp7.setVisible(false);  
        jp8.setVisible(false);
        MasterForm.setBackground(Color.YELLOW);
        JOptionPane.showMessageDialog(this, "Master ");
      
    }//GEN-LAST:event_MasterFormMouseClicked

    private void MBillFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MBillFormMouseClicked
        // TODO add your handling code here:
        jp5.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        jp6.setVisible(false);
        jp7.setVisible(false);
        jp8.setVisible(false);
        MBillForm.setBackground(Color.green);
        JOptionPane.showMessageDialog(this, "Member Bill");
    }//GEN-LAST:event_MBillFormMouseClicked

    private void AMemberFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMemberFormMouseClicked
        // TODO add your handling code here:
        jp6.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        jp5.setVisible(false);
        jp7.setVisible(false);
        jp8.setVisible(false);
        AMemberForm.setBackground(Color.blue);
         JOptionPane.showMessageDialog(this, "A Member ");
    }//GEN-LAST:event_AMemberFormMouseClicked

    private void NFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NFormMouseClicked
        // TODO add your handling code here:
        jp7.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        jp5.setVisible(false);
        jp6.setVisible(false);
        jp8.setVisible(false);
        NForm.setBackground(Color.red);
         JOptionPane.showMessageDialog(this, "N Form ");
    }//GEN-LAST:event_NFormMouseClicked

    private void TodocallingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodocallingPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TodocallingPanelMouseClicked

    private void MemberMasterPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberMasterPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberMasterPanelMouseClicked
    public void tableMouseClicked(java.awt.event.MouseEvent evt)
    {
        
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMemberForm;
    private javax.swing.JPanel AssociateMemberPanel;
    private javax.swing.JPanel FormHead;
    private javax.swing.JLabel MBillForm;
    private javax.swing.JLabel MMasterDetails;
    private javax.swing.JPanel MaintenanceBillPanel;
    private javax.swing.JLabel MaintenanceForm;
    private javax.swing.JPanel MaintenancePanel;
    private javax.swing.JLabel MasterForm;
    private javax.swing.JPanel MasterPanel;
    private javax.swing.JLabel MemberDetails;
    private javax.swing.JPanel MemberMasterPanel;
    private javax.swing.JPanel MemberPanel;
    private javax.swing.JLabel NForm;
    private javax.swing.JPanel NommineeFormPanel;
    private javax.swing.JPanel TodocallingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel jp5;
    private javax.swing.JPanel jp6;
    private javax.swing.JPanel jp7;
    private javax.swing.JPanel jp8;
    // End of variables declaration//GEN-END:variables
}
