/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Laize Melo
 */
public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        
        /*FileOutputStream fil = new FileOutputStream("teste.txt");
        OutputStreamWriter out = new OutputStreamWriter(fil);
        BufferedWriter br = new BufferedWriter(out);*/
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("teste.txt"));
                
        bw.write("Teste de escrita");
        bw.newLine();
        bw.write("Teste de escrita 2");
             
        bw.close();
       
        
    }
}
