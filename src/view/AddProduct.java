/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.FileIO;
import app.Product;
import exceptions.IllegalAmountException;
import exceptions.IllegalCodeException;
import exceptions.IllegalNameException;
import exceptions.IllegalPriceException;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gilvan
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        AmountLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        BrandLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        CodeLabel = new javax.swing.JLabel();
        NameTField = new javax.swing.JTextField();
        PriceTField = new javax.swing.JTextField();
        AmountTField = new javax.swing.JTextField();
        BrandTField = new javax.swing.JTextField();
        DescriptionTField = new javax.swing.JTextField();
        CodeTField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameLabel.setText("Nome:");

        AmountLabel.setText("Quantidade:");

        PriceLabel.setText("Preço:");

        BrandLabel.setText("Marca:");

        DescriptionLabel.setText("Descrição:");

        CodeLabel.setText("Código:");

        PriceTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTFieldActionPerformed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(0, 0, 255));
        TitleLabel.setText("Cadastro de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(TitleLabel)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TitleLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        RegisterButton.setForeground(new java.awt.Color(0, 0, 255));
        RegisterButton.setText("Cadastrar");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        CancelButton.setForeground(new java.awt.Color(0, 0, 255));
        CancelButton.setText("Menu");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addComponent(PriceLabel)
                            .addComponent(AmountLabel)
                            .addComponent(BrandLabel)
                            .addComponent(DescriptionLabel)
                            .addComponent(CodeLabel))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceTField)
                            .addComponent(AmountTField)
                            .addComponent(BrandTField)
                            .addComponent(DescriptionTField)
                            .addComponent(CodeTField)
                            .addComponent(NameTField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RegisterButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(PriceTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrandTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrandLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescriptionLabel)
                    .addComponent(DescriptionTField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodeLabel)
                    .addComponent(CodeTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton)
                    .addComponent(CancelButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PriceTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        
        String name = NameTField.getText();
        double price = 0.0;
        int amount = 0;
        String brand = BrandTField.getText();
        String description = DescriptionTField.getText();
        int code = 0;
        
        try
        {
            price = Double.parseDouble(PriceTField.getText());
        }
        catch(NumberFormatException nfe1){
            JOptionPane.showMessageDialog(null, "Preencha o campo Preço com um número. Exemplo: 5.50", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
                
        try{
            amount= Integer.parseInt(AmountTField.getText());
        }
        catch(NumberFormatException nfe2){
            
            JOptionPane.showMessageDialog(null, "Preencha o campo Quantidade com um número. Exemplo: 10", "alert", JOptionPane.ERROR_MESSAGE);
        }
        
        catch(IllegalArgumentException iae2){
            JOptionPane.showMessageDialog(null, iae2.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
        
        try{
            code = Integer.parseInt(CodeTField.getText());
        }
        catch(NumberFormatException nfe3){
            
            JOptionPane.showMessageDialog(null, "Preencha o campo Código com um número. Exemplo: 1234", "alert", JOptionPane.ERROR_MESSAGE);
        }
        
        catch(IllegalArgumentException iae3){
            JOptionPane.showMessageDialog(null, iae3.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
        Product product = null;
        
        try
        {
            product = new Product(name, price, amount, brand, description, code);
        }
        catch(IllegalNameException me1){
            JOptionPane.showMessageDialog(null, me1.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalPriceException me2){
            JOptionPane.showMessageDialog(null, me2.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalAmountException me3){
            JOptionPane.showMessageDialog(null, me3.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalCodeException me4){
            JOptionPane.showMessageDialog(null, me4.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
        }
 
        
        FileIO.addProduct(product);
        
        
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        
        
        
    }//GEN-LAST:event_RegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JTextField AmountTField;
    private javax.swing.JLabel BrandLabel;
    private javax.swing.JTextField BrandTField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CodeLabel;
    private javax.swing.JTextField CodeTField;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionTField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTField;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTField;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
