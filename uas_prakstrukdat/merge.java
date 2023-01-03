/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas_prakstrukdat;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author SUCI WULANDARI - 210605110154
 */
public class merge extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    int timeRun = 0;

    /**
     * Array untuk mergeSort
     */
    private int[] array;
    /**
     * Temp Merge Array
     */
    private int[] tempMergArr;
    /**
     * Length array
     */
    private int length;

    public merge() {
        initComponents();
 setLocationRelativeTo(this);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sort = new javax.swing.JPanel();
        nSort = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        nClear = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        tfdata1 = new javax.swing.JTextField();
        tfdata6 = new javax.swing.JTextField();
        tfdata2 = new javax.swing.JTextField();
        tfdata3 = new javax.swing.JTextField();
        tfdata4 = new javax.swing.JTextField();
        tfdata5 = new javax.swing.JTextField();
        p7 = new javax.swing.JPanel();
        test = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prosesPengurutan = new javax.swing.JTextArea();
        back = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        jPanel2.setPreferredSize(new java.awt.Dimension(940, 410));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 55)); // NOI18N
        jLabel1.setText("MERGE SORT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 360, 70));

        sort.setBackground(new java.awt.Color(255, 255, 255));
        sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sortMouseExited(evt);
            }
        });
        sort.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nSort.setFont(new java.awt.Font("HP Simplified Hans", 0, 20)); // NOI18N
        nSort.setText("Sorting");
        nSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nSortMouseClicked(evt);
            }
        });
        sort.add(nSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 40));

        jPanel2.add(sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 150, 40));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nClear.setFont(new java.awt.Font("HP Simplified Hans", 0, 20)); // NOI18N
        nClear.setText("Clear");
        clear.add(nClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 40));

        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 150, 40));

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "Insert Your Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("HP Simplified Hans", 0, 20), new java.awt.Color(44, 62, 80))); // NOI18N
        p6.setPreferredSize(new java.awt.Dimension(420, 140));
        p6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfdata1.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        tfdata1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdata1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("HP Simplified Hans", 0, 14), new java.awt.Color(44, 62, 80))); // NOI18N
        tfdata1.setPreferredSize(new java.awt.Dimension(20, 30));
        tfdata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdata1ActionPerformed(evt);
            }
        });
        p6.add(tfdata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 60));

        tfdata6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfdata6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdata6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "6", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(44, 62, 80))); // NOI18N
        tfdata6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdata6ActionPerformed(evt);
            }
        });
        p6.add(tfdata6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 70, 60));

        tfdata2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdata2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(44, 62, 80))); // NOI18N
        p6.add(tfdata2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, 60));

        tfdata3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdata3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(44, 62, 80))); // NOI18N
        tfdata3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdata3ActionPerformed(evt);
            }
        });
        p6.add(tfdata3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 70, 60));

        tfdata4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdata4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "4", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(44, 62, 80))); // NOI18N
        p6.add(tfdata4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 60));

        tfdata5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdata5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "5", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(44, 62, 80))); // NOI18N
        p6.add(tfdata5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, 60));

        jPanel2.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 280));

        p7.setBackground(new java.awt.Color(255, 255, 255));
        p7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 62, 80), 1, true), "Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("HP Simplified Hans", 0, 20), new java.awt.Color(44, 62, 80))); // NOI18N
        p7.setPreferredSize(new java.awt.Dimension(420, 140));
        p7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        test.setFont(new java.awt.Font("HP Simplified Hans", 0, 24)); // NOI18N
        test.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 230));

        jPanel2.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 290, 280));

        prosesPengurutan.setColumns(20);
        prosesPengurutan.setFont(new java.awt.Font("HP Simplified Hans", 0, 13)); // NOI18N
        prosesPengurutan.setRows(5);
        prosesPengurutan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 62, 80)), "Progress", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("HP Simplified Hans", 0, 20), new java.awt.Color(51, 51, 51))); // NOI18N
        prosesPengurutan.setDisabledTextColor(new java.awt.Color(44, 62, 80));
        jScrollPane1.setViewportView(prosesPengurutan);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 280, 280));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 460));

        back.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        Exit.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X ");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, -10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortMouseClicked
        // TODO add your handling code here:
        if (tfdata1.getText().equals("") || tfdata2.getText().equals("") || tfdata3.getText().equals("") || tfdata4.getText().equals("") || tfdata5.getText().equals("") || tfdata6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please input your data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            int a1 = Integer.parseInt(tfdata1.getText());
            int a2 = Integer.parseInt(tfdata2.getText());
            int a3 = Integer.parseInt(tfdata3.getText());
            int a4 = Integer.parseInt(tfdata4.getText());
            int a5 = Integer.parseInt(tfdata5.getText());
            int a6 = Integer.parseInt(tfdata6.getText());
     int[] data = {a1, a2, a3, a4, a5,a6};

            this.array = data;
            this.length = data.length;
            this.tempMergArr = new int[this.length];
            this.mergeSort(0, this.length - 1);

            int[] inputArr = array;
            for (int i : inputArr) {
                System.out.print(i);
                System.out.print(" ");
                test.setText(String.valueOf(data[0] + " - " + data[1] + " - " + data[2] + " - " + data[3] + " - " + data[4] + " - " + data[5]));

            }

        }
        System.out.println(" ");
    }//GEN-LAST:event_sortMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
         tfdata1.setText("");
        tfdata2.setText("");
        tfdata3.setText("");
        tfdata4.setText("");
        tfdata5.setText("");
        tfdata6.setText("");
        
        test.setText("");
        prosesPengurutan.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here
       new Sorting().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        doexit();
    }//GEN-LAST:event_ExitMouseClicked

    private void nSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nSortMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nSortMouseClicked

    private void sortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortMouseEntered
        // TODO add your handling code here:
        x1();
    }//GEN-LAST:event_sortMouseEntered
    public void x1() {
        setBorder2(sort);
        setColor(sort);
        setColorTombol(nSort);
    }
    private void sortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortMouseExited
        // TODO add your handling code here:
        y1();
    }//GEN-LAST:event_sortMouseExited
    public void y1() {
        resetColorTombol(nSort);
        resetColor(sort);
    }
    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        // TODO add your handling code here:
x2();
    }//GEN-LAST:event_clearMouseEntered
 public void x2() {
        setBorder2(clear);
        setColor(clear);
        setColorTombol(nClear);
    }
    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        // TODO add your handling code here:
y2();
    }//GEN-LAST:event_clearMouseExited

    private void tfdata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdata1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdata1ActionPerformed

    private void tfdata6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdata6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdata6ActionPerformed

    private void tfdata3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdata3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdata3ActionPerformed
public void y2() {
        resetColorTombol(nClear);
        resetColor(clear);
    }

    public void doexit() {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Apakah anda yakin ingin keluar dari program?", "Tutup Aplikasi",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }

    public void y3() {
        resetColorTombol(nSort);
        resetColor(sort);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            this.mergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            this.mergeSort(middle + 1, higherIndex);
            // Now merge both sides
            this.mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            this.tempMergArr[i] = this.array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (this.tempMergArr[i] <= this.tempMergArr[j]) {
                this.array[k] = this.tempMergArr[i];
                i++;
            } else {
                this.array[k] = this.tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            this.array[k] = this.tempMergArr[i];
            k++;
            i++;
        }

    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(44, 62, 80));
    }

    public void setColorTombol(JLabel label) {
        label.setForeground(new java.awt.Color(255, 255, 225));
    }

    public void resetColorTombol(JLabel label) {
        label.setForeground(new java.awt.Color(44, 62, 80));
    }

    public void setBorder2(JPanel panel) {
        panel.setBorder(new LineBorder(new java.awt.Color(44, 62, 80)));
    }

    public void resetBorder(JPanel panel) {
        panel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
            java.util.logging.Logger.getLogger(merge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(merge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(merge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(merge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new merge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel back;
    private javax.swing.JPanel clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nClear;
    private javax.swing.JLabel nSort;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JTextArea prosesPengurutan;
    private javax.swing.JPanel sort;
    private javax.swing.JLabel test;
    private javax.swing.JTextField tfdata1;
    private javax.swing.JTextField tfdata2;
    private javax.swing.JTextField tfdata3;
    private javax.swing.JTextField tfdata4;
    private javax.swing.JTextField tfdata5;
    private javax.swing.JTextField tfdata6;
    // End of variables declaration//GEN-END:variables
}