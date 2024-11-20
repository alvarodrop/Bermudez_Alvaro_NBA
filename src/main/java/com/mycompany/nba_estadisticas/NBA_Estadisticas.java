/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nba_estadisticas;

/**
 *
 * @author alvag
 */
public class NBA_Estadisticas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Interfaz().setVisible(true); // Aquí llamas a la interfazCalculadora
        }
    });
    }
}
