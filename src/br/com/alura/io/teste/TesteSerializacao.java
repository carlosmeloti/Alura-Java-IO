/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Laize Melo
 */
public class TesteSerializacao {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
       /* String nome = "Eu te amo, meu amor";
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivo.bi"));
        oos.writeObject(nome);
        oos.close();*/
       
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivo.bi"));
        String nome = (String) ois.readObject();
        System.out.println(nome);
    }
    
}
