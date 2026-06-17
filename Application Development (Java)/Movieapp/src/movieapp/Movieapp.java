/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movieapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Movieapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("datafile.txt"));
        scanner.useDelimiter(";|\n");
        scanner.useLocale(Locale.US);
        
        String title, category, runningTime;
        int year;
        double price;
        
        while(scanner.hasNextLine()) {
            title = scanner.next();
            category = scanner.next();
            runningTime = scanner.next();    
            year = scanner.nextInt();
            price = scanner.nextDouble();
            
            Movie movie = new Movie(title, category, runningTime, year, price);
            
            System.out.println(movie.toString());
        }
        scanner.close();
    }
    
}
