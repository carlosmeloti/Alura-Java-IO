/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Laize Melo
 */
public class TesteUnicodeEEncoding {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        //Código omitido

                String s = "Acho que é isso ou não é isso, opção!";
                System.out.println(s.codePointAt(0));

                Charset charset = Charset.defaultCharset();
                System.out.println(charset.displayName());

                byte[] bytes = s.getBytes("windows-1252");
                System.out.print(bytes.length + ", windows-1252, ");
                String sNovo = new String(bytes, "windows-1252");
                System.out.println(sNovo);

                bytes = s.getBytes("UTF-16");
                System.out.print(bytes.length + ", UTF-16, ");
                sNovo = new String(bytes, "UTF-16");
                System.out.println(sNovo);

                bytes = s.getBytes(StandardCharsets.US_ASCII);
                System.out.print(bytes.length + ", US-ASCII, ");
                sNovo = new String(bytes, "US-ASCII");
                System.out.println(sNovo);
                
        }
}
        
    