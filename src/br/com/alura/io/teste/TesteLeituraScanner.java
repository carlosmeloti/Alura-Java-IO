/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Laize Melo
 */
public class TesteLeituraScanner {
    
    public static void main(String[] args) throws Exception{
     
        Scanner scanner = new Scanner(new File("contas.csv"));
        
        while(scanner.hasNext()){
            String linha = scanner.nextLine();
           // System.out.println(linha);
            
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useDelimiter(",");
            
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
          // double valor5 = linhaScanner.nextDouble();
            
            String valoresFormatados = String.format("%s %s %s %s", valor1, valor2, valor3, valor4);
            System.out.println(valoresFormatados);
            //System.out.println(valor1 + " - " + valor2 + " - " + valor3 + " - " + valor4 + " - " + valor5);
            
            linhaScanner.close();
            
        }
        
        scanner.close();
        
    }
    
}
