/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringManipulation;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupB
 */
public class FilterHTML {
    
    public String removeHTMLTags(String str){
        str = str.replaceAll("\\<.*?\\>", "");
        
        return str;
    }
    
    public String countWords(String countW){
        // split text to array of words
        String[] words = countW.split("\\s");
        // frequency array
        int[] fr = new int[words.length];
        // init frequency array
        for (int i = 0; i < fr.length; i++) {
            fr[i] = 0;
        }
        // count words frequency
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {

                    fr[i]++;

                }
            }
        }

        // clean duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (i != j) {
                        words[i] = "";
                    }

                }
            }
        }

// show the output
        int total = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            if (words[i] != "") {

                list.add(words[i] + " = " + fr[i] + "\n");

            }

        }
       
        return list.toString();
    }
}
