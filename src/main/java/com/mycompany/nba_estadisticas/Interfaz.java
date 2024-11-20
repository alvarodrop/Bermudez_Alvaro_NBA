/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.nba_estadisticas;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.*;


/**
 *
 * @author alvag
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        anotados3 = new javax.swing.JSpinner();
        totalTiros = new javax.swing.JSpinner();
        anotados2 = new javax.swing.JSpinner();
        FGButton = new javax.swing.JButton();
        eFGButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(173, 216, 230));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel4.setBackground(new java.awt.Color(51, 0, 204));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel4.setText("Estadisticas Baloncesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel6.setText("Anotados de 3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel7.setText("Anotados de 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel8.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(jLabel8, gridBagConstraints);

        anotados3.setPreferredSize(new java.awt.Dimension(64, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(anotados3, gridBagConstraints);

        totalTiros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        totalTiros.setPreferredSize(new java.awt.Dimension(64, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(totalTiros, gridBagConstraints);

        anotados2.setPreferredSize(new java.awt.Dimension(64, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(anotados2, gridBagConstraints);

        FGButton.setText("FG");
        FGButton.setPreferredSize(new java.awt.Dimension(72, 30));
        FGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FGButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(FGButton, gridBagConstraints);

        eFGButton.setText("eFG");
        eFGButton.setPreferredSize(new java.awt.Dimension(72, 30));
        eFGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eFGButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(eFGButton, gridBagConstraints);

        jButton1.setText("Reset");
        jButton1.setPreferredSize(new java.awt.Dimension(72, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 10;
        getContentPane().add(jButton1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FGButtonActionPerformed
        // Obtener valores de los spinners
        int tiros2 = (int) anotados2.getValue(); // Tiros de 2 anotados
        int tiros3 = (int) anotados3.getValue(); // Tiros de 3 anotados
        int tirosTotales = (int) totalTiros.getValue(); // Total de tiros intentados

        // Validar que el total de tiros no sea 0 para evitar división por 0
        if (tirosTotales == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "El total de tiros no puede ser 0", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calcular el FG: (Tiros anotados / Total tiros intentados) * 100
        int tirosAnotados = tiros2 + tiros3; // Sumar los tiros de 2 y 3 anotados
        double fg = ((double) tirosAnotados / tirosTotales) * 100;

        // Calcular el eFG
        double efg = ((double) tiros2 + (0.5 * tiros3)) / tirosTotales * 100;

        // Crear el texto para el resultado
        String resultadoFG = "FG: " + String.format("%.2f", fg) + "%";

        // Mostrar el resultado en otro JFrame (Resultado.java)
        Resultado resultadoFrame = new Resultado(resultadoFG);
        resultadoFrame.setVisible(true);

        // Guardar los datos en Excel
        guardarEnExcel(tiros2, tiros3, tirosTotales, fg, 0);
    }//GEN-LAST:event_FGButtonActionPerformed

    private void eFGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eFGButtonActionPerformed
        // Obtener los valores de los Spinners
        int anotados2 = (int) this.anotados2.getValue();  // Tiros de 2 anotados
        int anotados3 = (int) this.anotados3.getValue();  // Tiros de 3 anotados
        int totalTiros = (int) this.totalTiros.getValue();  // Tiros totales

        // Comprobar que los tiros totales no sean 0 para evitar división por 0
        if (totalTiros == 0) {
            String error = "Los tiros totales no pueden ser 0.";
            Resultado resultadoVentana = new Resultado(error);
            resultadoVentana.setVisible(true);
            return;
        }

        // Calcular eFG
        double eFG = ((anotados2 + 1.5 * anotados3) / (double) totalTiros) * 100;
       
        // Mostrar el resultado en la interfaz de usuario
        String resultado = "eFG: " + String.format("%.2f", eFG) + "%";// Formatear el resultado a 2 decimales

        // Crear una instancia de la ventana Resultado para mostrar el resultado
        Resultado resultadoVentana = new Resultado(resultado);  // Pasamos el resultado al constructor
        resultadoVentana.setVisible(true);

        // Guardar los datos en Excel
        guardarEnExcel(anotados2, anotados3, totalTiros, 0, eFG); // Aquí, pasamos eFG y dejamos FG en 0
    
    }//GEN-LAST:event_eFGButtonActionPerformed

    


    private static final String FILE_PATH = "C:\\GradoSuperior\\2º\\DI\\NBA_Estadisticas\\NBA_Estadisticas\\src\\main\\java\\com\\mycompany\\nba_estadisticas\\Estadisticas_Baloncesto.xlsx";

    public void guardarEnExcel(int tiros2, int tiros3, int totalTiros, double fg, double efg) {
        File excelFile = new File(FILE_PATH);
        Workbook workbook = null;

        try {
            // Si el archivo ya existe, lo abrimos, si no, creamos uno nuevo
            if (excelFile.exists()) {
                FileInputStream fileInputStream = new FileInputStream(excelFile);
                workbook = new XSSFWorkbook(fileInputStream);
            } else {
                workbook = new XSSFWorkbook(); // Si no existe, creamos un nuevo libro de trabajo
            }

            // Crear hoja de trabajo (sheet)
            Sheet sheet = workbook.getSheetAt(0);
            if (sheet == null) {
                sheet = workbook.createSheet("Estadísticas Baloncesto"); // Si no existe, la creamos
            }

            // Si el archivo ya tiene datos, encontrar la última fila
            int lastRowNum = sheet.getLastRowNum();
            Row newRow = sheet.createRow(lastRowNum + 1); // Crear una nueva fila debajo de la última fila con datos

            // Si el archivo está vacío, agregar los encabezados
            if (lastRowNum == 0) {
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("Tiros de 2");
                headerRow.createCell(1).setCellValue("Tiros de 3");
                headerRow.createCell(2).setCellValue("Total Tiros");
                headerRow.createCell(3).setCellValue("FG (%)");
                headerRow.createCell(4).setCellValue("eFG (%)");
            }

            // Añadir los datos a la nueva fila
            newRow.createCell(0).setCellValue(tiros2);
            newRow.createCell(1).setCellValue(tiros3);
            newRow.createCell(2).setCellValue(totalTiros);
            newRow.createCell(3).setCellValue(fg);
            newRow.createCell(4).setCellValue(efg);

            // Escribir los datos en el archivo Excel
            try (FileOutputStream fileOut = new FileOutputStream(excelFile)) {
                workbook.write(fileOut);
                System.out.println("Archivo Excel guardado con éxito");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();  // Cerrar el libro de trabajo
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FGButton;
    private javax.swing.JSpinner anotados2;
    private javax.swing.JSpinner anotados3;
    private javax.swing.JButton eFGButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner totalTiros;
    // End of variables declaration//GEN-END:variables
}
