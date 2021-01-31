/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Laize Melo
 */
public class TesteEscritaELeitura {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fol = new FileOutputStream("c:\\teste.txt");
        OutputStreamWriter out = new OutputStreamWriter(fol);
        BufferedWriter bw = new BufferedWriter(out);
        
        bw.write("Teste de escrita");
        
        String txt = "1";
        
        while(!txt.isEmpty()){
            txt = JOptionPane.showInputDialog("Texto da segunda linha");
            bw.newLine();
            bw.write(txt);
        }
        
        bw.close();
        
        FileInputStream fil = new FileInputStream("c:\\teste.txt");
        InputStreamReader in = new InputStreamReader(fil);
        BufferedReader br = new BufferedReader(in);
        
        String linha = br.readLine();
        
        while (linha != null) {
            System.out.println(linha);  
            linha = br.readLine();
        }
         br.close();
       
        
    }
}
