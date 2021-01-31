/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Laize Melo
 */
public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fil = new FileInputStream("teste.txt");
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
