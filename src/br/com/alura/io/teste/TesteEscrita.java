/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Laize Melo
 */
public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fil = new FileOutputStream("teste.txt");
        OutputStreamWriter out = new OutputStreamWriter(fil);
        BufferedWriter br = new BufferedWriter(out);
        
        String txt = JOptionPane.showInputDialog("Texto da segunda linha");
 
        br.write("Teste de escrita");
        br.newLine();
        br.write(txt);
             
        br.close();
       
        
    }
}
