/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise2 {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data:");
        
        String am = scanner.next();
        String course;
        float mark;
        int count = 0;
        float sum = 0;
        while(!am.equals("000000")) {
            course = scanner.next();
            
            while(!course.equals("end")) {
                mark = scanner.nextFloat();
                count++;
                sum += mark;
                course = scanner.next();
            }     
            if (count>0) {
            System.out.println("Average of student " + am + " is " + sum/count);
            } else {
                System.out.println("no marks for this student");
            }
            sum = 0;
            count = 0;
            am = scanner.next();        
        }
        System.out.println("Reading data completed");        
    }
}
