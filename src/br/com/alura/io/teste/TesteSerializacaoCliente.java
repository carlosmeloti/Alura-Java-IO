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
import java.io.Serializable;

/**
 *
 * @author Laize Melo
 */
public class TesteSerializacaoCliente{
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
       
        /*Cliente cliente = new Cliente();
        cliente.setNome("Carlos");
        cliente.setCpf("813.620.642-20");
        cliente.setProfissao("Analista de Sistemas");*/
               
        
               
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivocliente.bi"));
        oos.writeObject(cliente);
        oos.close();*/
       
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivocliente.bi"));
        Cliente cliente = (Cliente) ois.readObject();
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getProfissao());
    }
    
}
