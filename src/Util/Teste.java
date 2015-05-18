/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tadeu
 */
public class Teste {

    
    public static void main(String[] args) {
        File arquivo = new File("c:/arquivo.txt");
        DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String data = formatData.format(new Date(arquivo.lastModified()));
        long tamanho = arquivo.length();  
        System.out.println(data);
        System.out.println(tamanho);
        
    }

}
