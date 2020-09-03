package projectcalculator;

import javax.script.ScriptEngineManager;

public class Main extends javax.swing.JFrame {

    String num = "";
    Double y, z;


    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bt9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtSum = new javax.swing.JButton();
        TfDisplay = new javax.swing.JTextField();
        BtSwtich = new javax.swing.JButton();
        BtMultiply = new javax.swing.JButton();
        Bt4 = new javax.swing.JButton();
        Bt2 = new javax.swing.JButton();
        BtPercent = new javax.swing.JButton();
        Bt3 = new javax.swing.JButton();
        Bt5 = new javax.swing.JButton();
        BtAdd = new javax.swing.JButton();
        Bt6 = new javax.swing.JButton();
        BtSubtract = new javax.swing.JButton();
        BtRud = new javax.swing.JButton();
        Bt1 = new javax.swing.JButton();
        BtDouble = new javax.swing.JButton();
        BtLog = new javax.swing.JButton();
        BtMod = new javax.swing.JButton();
        BtC = new javax.swing.JButton();
        BtDelete = new javax.swing.JButton();
        BtDivide = new javax.swing.JButton();
        Bt7 = new javax.swing.JButton();
        BtDot = new javax.swing.JButton();
        Bt8 = new javax.swing.JButton();
        Bt0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        Bt9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt9.setText("9");
        Bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("HCP Maru Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Calculator");

        BtSum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtSum.setText("=");
        BtSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSumActionPerformed(evt);
            }
        });

        TfDisplay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TfDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TfDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfDisplayActionPerformed(evt);
            }
        });

        BtSwtich.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtSwtich.setText("±");
        BtSwtich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSwtichActionPerformed(evt);
            }
        });

        BtMultiply.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtMultiply.setText("x");
        BtMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMultiplyActionPerformed(evt);
            }
        });

        Bt4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt4.setText("4");
        Bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt4ActionPerformed(evt);
            }
        });

        Bt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt2.setText("2");
        Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt2ActionPerformed(evt);
            }
        });

        BtPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtPercent.setText("%");
        BtPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPercentActionPerformed(evt);
            }
        });

        Bt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt3.setText("3");
        Bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt3ActionPerformed(evt);
            }
        });

        Bt5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt5.setText("5");
        Bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt5ActionPerformed(evt);
            }
        });

        BtAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtAdd.setText("+");
        BtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddActionPerformed(evt);
            }
        });

        Bt6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt6.setText("6");
        Bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt6ActionPerformed(evt);
            }
        });

        BtSubtract.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtSubtract.setText("-");
        BtSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSubtractActionPerformed(evt);
            }
        });

        BtRud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtRud.setText("√");
        BtRud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRudActionPerformed(evt);
            }
        });

        Bt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt1.setText("1");
        Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1ActionPerformed(evt);
            }
        });

        BtDouble.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtDouble.setText("x²");
        BtDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDoubleActionPerformed(evt);
            }
        });

        BtLog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtLog.setText("log");
        BtLog.setToolTipText("");
        BtLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLogActionPerformed(evt);
            }
        });

        BtMod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtMod.setText("Mod");
        BtMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModActionPerformed(evt);
            }
        });

        BtC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtC.setText("C");
        BtC.setToolTipText("");
        BtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCActionPerformed(evt);
            }
        });

        BtDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtDelete.setText("←");
        BtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeleteActionPerformed(evt);
            }
        });

        BtDivide.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtDivide.setText("÷");
        BtDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDivideActionPerformed(evt);
            }
        });

        Bt7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt7.setText("7");
        Bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt7ActionPerformed(evt);
            }
        });

        BtDot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtDot.setText(".");
        BtDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDotActionPerformed(evt);
            }
        });

        Bt8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt8.setText("8");
        Bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt8ActionPerformed(evt);
            }
        });

        Bt0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bt0.setText("0");
        Bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TfDisplay)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtSwtich, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtDot, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtSum, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtRud, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtRud, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSwtich, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDot, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSum, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1ActionPerformed
        TfDisplay.setText(num += Bt1.getText());
    }//GEN-LAST:event_Bt1ActionPerformed

    private void Bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt0ActionPerformed
        TfDisplay.setText(num += Bt0.getText());
    }//GEN-LAST:event_Bt0ActionPerformed

    private void Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt2ActionPerformed
        TfDisplay.setText(num += Bt2.getText());
    }//GEN-LAST:event_Bt2ActionPerformed

    private void Bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt3ActionPerformed
        TfDisplay.setText(num += Bt3.getText());
    }//GEN-LAST:event_Bt3ActionPerformed

    private void Bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt4ActionPerformed
        TfDisplay.setText(num += Bt4.getText());
    }//GEN-LAST:event_Bt4ActionPerformed

    private void Bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt5ActionPerformed
        TfDisplay.setText(num += Bt5.getText());
    }//GEN-LAST:event_Bt5ActionPerformed

    private void Bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt6ActionPerformed
        TfDisplay.setText(num += Bt6.getText());
    }//GEN-LAST:event_Bt6ActionPerformed

    private void Bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt7ActionPerformed
        TfDisplay.setText(num += Bt7.getText());
    }//GEN-LAST:event_Bt7ActionPerformed

    private void Bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt8ActionPerformed
        TfDisplay.setText(num += Bt8.getText());
    }//GEN-LAST:event_Bt8ActionPerformed

    private void Bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt9ActionPerformed
        TfDisplay.setText(num += Bt9.getText());
    }//GEN-LAST:event_Bt9ActionPerformed

    private void BtDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDotActionPerformed
        TfDisplay.setText(num += ".");
    }//GEN-LAST:event_BtDotActionPerformed

    private void BtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddActionPerformed
        TfDisplay.setText(num += "+");
    }//GEN-LAST:event_BtAddActionPerformed

    private void BtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeleteActionPerformed
        TfDisplay.setText(num = num.substring(0, num.length() -1));
    }//GEN-LAST:event_BtDeleteActionPerformed

    private void BtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCActionPerformed
        TfDisplay.setText("");
        num = "";
    }//GEN-LAST:event_BtCActionPerformed

    private void BtSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSubtractActionPerformed
        TfDisplay.setText(num += "-");
    }//GEN-LAST:event_BtSubtractActionPerformed

    private void BtMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMultiplyActionPerformed
        TfDisplay.setText(num += "*");
    }//GEN-LAST:event_BtMultiplyActionPerformed

    private void BtDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDivideActionPerformed
        TfDisplay.setText(num += "/");
    }//GEN-LAST:event_BtDivideActionPerformed

    private void BtSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSumActionPerformed
        try {
            if(num.contains("Mod")) //contains เช็คว่ามีคำว่า Mod ไหม
            {
                y = Double.parseDouble(num.substring(0, num.indexOf("Mod") - 1));
                z = Double.parseDouble(num.substring(num.indexOf("Mod") + 4, num.length()));
               // System.out.println(y);
                //System.out.println(z);
                num = Double.toString(y % z);
            }
            else
            {
                ScriptEngineManager em = new ScriptEngineManager();
                num = em.getEngineByName("JavaScript").eval(num).toString(); // เป็นLibrary ที่มีสูตรคำนวณอยู่แล้ว โดยทำการเรียกJavaScript มาทำการคำนวณ string ที่อยู่ใน num
            }
            if(num.contains(".")) //contains หาว่ามีจุดทศนิยมไหม?
            {
            if(0 == Long.valueOf(num.substring(num.indexOf(".") + 1, num.length()))) //ตรวจดูว่าหลังจุดทศนิยม มีค่าไหม
                num = num.substring(0, num.indexOf("."));//ให้แสดงแค่แลขข้างหน้าจุดทศนิยม
            }
            TfDisplay.setText(num);
            if(num.equals("0"))
            {
                num = "";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_BtSumActionPerformed

    private void TfDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfDisplayActionPerformed

    private void BtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModActionPerformed
        TfDisplay.setText(num += " Mod ");
    }//GEN-LAST:event_BtModActionPerformed

    private void BtPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPercentActionPerformed
        if(num.contains("+"))
        {
            y = Double.parseDouble(num.substring(0, num.indexOf("+")));
            z = Double.parseDouble(num.substring(num.indexOf("+") +1, num.length()));
            num = Double.toString(y) + "+" +  Double.toString(y * z / 100);
        }
        else if(num.contains("-"))
        {
            y = Double.parseDouble(num.substring(0, num.indexOf("-")));
            z = Double.parseDouble(num.substring(num.indexOf("-") +1, num.length()));
            num = Double.toString(y) + "-" +  Double.toString(y * z / 100);
        }
        else if(num.contains("*"))
        {
            y = Double.parseDouble(num.substring(0, num.indexOf("*")));
            z = Double.parseDouble(num.substring(num.indexOf("*") +1, num.length()));
            num = Double.toString(y) + "*" +  Double.toString(y * z / 100);
        }
        else if(num.contains("/"))
        {
            y = Double.parseDouble(num.substring(0, num.indexOf("/")));
            z = Double.parseDouble(num.substring(num.indexOf("/") +1, num.length()));
            num = Double.toString(y) + "/" +  Double.toString(y * z / 100);
        }
        TfDisplay.setText(num);
    }//GEN-LAST:event_BtPercentActionPerformed

    private void BtSwtichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSwtichActionPerformed
        if(num.contains(".")) //contains มีจุดทศนิยมไหม?
            num = Double.toString(Double.parseDouble(num) * -1);
        else if(num != "")
            num = Long.toString(Long.parseLong(num) * -1);
        TfDisplay.setText(num);
    }//GEN-LAST:event_BtSwtichActionPerformed

    private void BtRudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRudActionPerformed
        if(num != "")
        {
            num = Double.toString(Math.sqrt(Double.parseDouble(num))); //แปลงดับเบิ้ลหารากฐานสอง แล้วแปลงเป็นสตริง 
            if(0 == Long.valueOf(num.substring(num.indexOf(".") + 1, num.length()))) //ตรวจดูว่าหลังจุดทศนิยม มีค่าไหม
                num = num.substring(0, num.indexOf(".")); //แสดงแค่แลขข้างหน้าจุดทศนิยม
        }
        TfDisplay.setText(num);
    }//GEN-LAST:event_BtRudActionPerformed

    private void BtDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDoubleActionPerformed
        if(num != "")
        {
            num = Double.toString(Math.pow(Double.parseDouble(num), 2)); //แปลงดับเบิ้ลหาเลขยกกำลัง แล้วแปลงเป็นสตริง
            if(0 == Long.valueOf(num.substring(num.indexOf(".") + 1, num.length()))) //ตรวจดูว่าหลังจุดทศนิยม มีค่าไหม
                num = num.substring(0, num.indexOf(".")); //แสดงแค่แลขข้างหน้าจุดทศนิยม
        }      
        TfDisplay.setText(num);
    }//GEN-LAST:event_BtDoubleActionPerformed

    private void BtLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLogActionPerformed
        if(num != "")
        {
            num = Double.toString(Math.log10(Double.parseDouble(num))); //แปลงดับเบิ้ลหาLog แล้วแปลงเป็นสตริง 
            if(0 == Long.valueOf(num.substring(num.indexOf(".") + 1, num.length()))) //ตรวจดูว่าหลังจุดทศนิยม มีค่าไหม
                num = num.substring(0, num.indexOf(".")); //แสดงแค่แลขข้างหน้าจุดทศนิยม
        }      
        TfDisplay.setText(num);
    }//GEN-LAST:event_BtLogActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt0;
    private javax.swing.JButton Bt1;
    private javax.swing.JButton Bt2;
    private javax.swing.JButton Bt3;
    private javax.swing.JButton Bt4;
    private javax.swing.JButton Bt5;
    private javax.swing.JButton Bt6;
    private javax.swing.JButton Bt7;
    private javax.swing.JButton Bt8;
    private javax.swing.JButton Bt9;
    private javax.swing.JButton BtAdd;
    private javax.swing.JButton BtC;
    private javax.swing.JButton BtDelete;
    private javax.swing.JButton BtDivide;
    private javax.swing.JButton BtDot;
    private javax.swing.JButton BtDouble;
    private javax.swing.JButton BtLog;
    private javax.swing.JButton BtMod;
    private javax.swing.JButton BtMultiply;
    private javax.swing.JButton BtPercent;
    private javax.swing.JButton BtRud;
    private javax.swing.JButton BtSubtract;
    private javax.swing.JButton BtSum;
    private javax.swing.JButton BtSwtich;
    private javax.swing.JTextField TfDisplay;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
