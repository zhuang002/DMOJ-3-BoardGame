/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class BoardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        int max = 0;
        int count = 0;
        int lcount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == 'l') {
                count++;
                lcount++;
            } else if (c != ' ') {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        if (max < count) {
            max = count;
        }
        System.out.println(lcount + " " + max);
    }
}
