/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingevent;

import java.util.Scanner;

/**
 *
 * @author AV01
 */

public class Livescoreusingevent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ScoreSource scoreSource = new ScoreSource();

        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        scoreSource.addListener(subscriber1);
        scoreSource.addListener(subscriber2);

        while (true) {
            System.out.print("Enter Score: ");
            String input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            scoreSource.setScoreLine(input);
        }
        in.close();
    }
}
