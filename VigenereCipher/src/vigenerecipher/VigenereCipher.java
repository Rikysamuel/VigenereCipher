/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vigenerecipher;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Rikysamuel
 */
public class VigenereCipher {
    
    public String FileReader(String filename) throws FileNotFoundException{
        Scanner input = new Scanner(new FileReader(filename));
        String str = null;
        while (input.hasNext()){
            if (str == null){
                str = input.next().toLowerCase();
            } else{
                str = str.concat(" ");
                str = str.concat(input.next()).toUpperCase();
            }
        }
        return str;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
    }
    
}
