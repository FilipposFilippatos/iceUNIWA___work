/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor1;

/**
 *
 * @author filip
 */
public class Weather {
    
    private String location, conditions;
    private int degrees, humidity;
    
    public Weather(String location, int degrees){
    
        this.location = location;
        this.degrees = degrees;
        this.humidity = 50;
        this.conditions = "-Current Conditions not provided-";
    
    }
 
    public Weather(String location, int degrees, int humidity, String conditions){
    
        this.location = location;
        this.degrees = degrees;
        this.humidity = humidity;
        this.conditions = conditions;
        
    }
    
    public String Forecast(){
    
        return "Weather in " + location + " is " + degrees + " Celsuis , mostly " + conditions + " and the humidity will be around " + humidity + "%. ";
         
    }
 
    public double getTemperatureFahrenheit(){
    
        return (degrees * 9.0 / 5) + 32;
        
    }
    
    public boolean needsJacket(){
    
        return degrees < 15;
    
    }
}
