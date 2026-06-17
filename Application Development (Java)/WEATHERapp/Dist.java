package Constructor1;

/**
 *
 * @author ArisS
 */
public class Dist {

    public static void main(String[] args) {
        Weather Athens = new Weather("Athens",12);          // This constructor takes only Location and Degrees in Celcius. It sets Huidity to 50% and conditions to Unknown.
        
        Weather Chios = new Weather("Chios", 10,95,"Storm");    // This constructor takes Location, Degrees in Celcius, Current Humidity and Current Conditions.
        
        System.out.println(Athens.Forecast());                  // Forcast creates and returns a String based on the info we gave.
        System.out.println(Chios.Forecast());
        
        System.out.println("The Temperature in Fahrenheit will be: " + Athens.getTemperatureFahrenheit());  //This returns a Double that gives the Temperature in Fahrenheit. 
                                                                                                            //Formula: (C * 9/5) + 32
            
        
        if(Athens.needsJacket()){                               //This Checks if the Degrees in Celcius is over 15 and returns a Boolean. 
            System.out.println("Take your Jacket");
        }else{
            System.out.println("You are good to go!");

        }
    }
}


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
    
        return "Weather in" + location + "is " + degrees + " Celsius , mostly " + conditions + "and the humidity will be around " + humidity + "%. ";
        
    }
    
    public double getTemperatureFahrenheit(){
    
        return (degrees * 9.0 / 5) + 32 ;
        
    }
    
     public boolean needsJacket(){
        return degrees < 15;
    }
    
}
