/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import model.Ingredient;
import model.Dish;
import model.SavouryIngredient;

import model.SavouryIngredient;
import model.UserInputHandler;
/**
 *
 * @author imkir
 */
public class Savoury extends javax.swing.JFrame {

    /**
     * Creates new form Savoury
     */
    public Savoury() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Are you allergic to anything in specific?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 590, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 600, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Are there any savoury ingredients you would refer not to have in your meal?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 600, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 530, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 282, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("avacado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, 14));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("halloumi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("bell peppers");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 110, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("ground beef");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("garlic");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("tomatato sauce");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, -1, -1));

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, -1, 30));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 680, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/savoury background.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1440, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
         String userInput = jTextField1.getText();

    // Process the user input (for example, display it in a label)
    jLabel1.setText("You entered: " + userInput);

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // Get the user input from the text fields
    String allergenInput = jTextField1.getText();
    String proteinInput = jTextField2.getText();
    
    // Call the handleUserInput method with the user inputs
    handleUserInput(allergenInput, proteinInput);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
         String userInput = jTextField2.getText();

    // Process the user input (for example, display it in a label)
    jLabel2.setText("You entered: " + userInput);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        placingorder placingOrderWindow = new placingorder();
    // Display the placing order window
    placingOrderWindow.setVisible(true);
    // Close the current window
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
public void handleUserInput(String allergenInput, String proteinInput) {
     Ingredient[] spaghettiBologneseIngredients = SavouryIngredient.getSpaghettiBologneseIngredients();
    Ingredient[] halloumiSaladIngredients = SavouryIngredient.getHalloumiSaladIngredients();
    
    jLabel10.setText(""); // Clear the label text before updating

    boolean discardFirstDish = false;
    boolean discardSecondDish = false;

    // Check the allergen input against the ingredients of the first dish (Spaghetti Bolognese)
    for (Ingredient ingredient : spaghettiBologneseIngredients) {
        if (allergenInput.equalsIgnoreCase(ingredient.getName())) {
            discardFirstDish = true;
            break;
        }
    }

    // Check the allergen input against the ingredients of the second dish (Vegetable Stir-Fry)
    for (Ingredient ingredient : halloumiSaladIngredients) {
        if (allergenInput.equalsIgnoreCase(ingredient.getName())) {
            discardSecondDish = true;
            break;
        }
    }

    // Check the protein input against the ingredients of the first dish if it's not already discarded
    if (!discardFirstDish) {
        for (Ingredient ingredient : spaghettiBologneseIngredients) {
            if (proteinInput.equalsIgnoreCase(ingredient.getName())) {
                discardFirstDish = true;
                break;
            }
        }
    }

    // Check the protein input against the ingredients of the second dish if it's not already discarded
    if (!discardSecondDish) {
        for (Ingredient ingredient : halloumiSaladIngredients) {
            if (proteinInput.equalsIgnoreCase(ingredient.getName())) {
                discardSecondDish = true;
                break;
            }
        }
    }

    if (discardFirstDish && discardSecondDish) {
        // Both dishes are discarded
        jLabel10.setText("Sorry, both dishes contain an allergen or don't match your preferred ingredient. No recommendation available.");
    } else if (discardFirstDish) {
        // First dish is discarded, recommend the second dish
        jLabel10.setText("We recommend the dish: Halloumi Salad");
    } else if (discardSecondDish) {
        // Second dish is discarded, recommend the first dish
        jLabel10.setText("We recommend the dish: Spaghetti Bolognese");
    } else {
        // Neither dish is discarded, recommend both dishes
        jLabel10.setText("Both dishes are suitable: Spaghetti Bolognese and Halloumi Salad");
    }
}

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
            java.util.logging.Logger.getLogger(Savoury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Savoury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Savoury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Savoury.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Savoury().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
