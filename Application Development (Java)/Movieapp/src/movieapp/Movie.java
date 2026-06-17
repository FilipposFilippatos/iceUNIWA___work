/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp;

/**
 *
 * @author user
 */
public class Movie {
    private String title;
    private String category;
    private String runningTime;
    private int year;
    private double price;

    public Movie(String title, String category, String runningTime, int year, double price) {
        this.title = title;
        this.category = category;
        this.runningTime = runningTime;
        this.year = year;
        this.price = price;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", category=" + category + ", runningTime=" + runningTime + ", year=" + year + ", price=" + price + '}';
    }
    
    
}
