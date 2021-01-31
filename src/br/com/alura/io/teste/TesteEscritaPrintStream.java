/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Laize Melo
 */
public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {
        
        /*FileOutputStream fil = new FileOutputStream("teste.txt");
        OutputStreamWriter out = new OutputStreamWriter(fil);
        BufferedWriter br = new BufferedWriter(out);*/
        
       // BufferedWriter bw = new BufferedWriter(new FileWriter("teste.txt"));
        PrintStream ps = new PrintStream("teste.txt");
                
        ps.print("Teste de escrita");
        ps.println();
        ps.print("Teste PrintStream");
             
        ps.close();
       
        
    }
}
