import java.util.Random;

public class Die {

    public static void main (String args[] ){
        
       for (int i =0 ; i<20; i++){
          
           Random rn = new Random();
           int High =7;
           int low = 1;
           int rNumber = rn.nextInt( High-low)+low ;
          
           
           if( i ==20){
               break;
           }
               System.out.println("Roll " + (i+1)+": "+ rNumber);
           }
        
    }   



    }




____________________________

public class Die{
private int numberOfSides;
private String color;
private int faceValue;

//initalizes the number of sides on a Die as 6
public int Die(){
    numberOfSides=6;
}
//initalizes the number of sides as N
public  int Die(int N){
    numberOfSides=N;
}
//returns the number of sides on a die
public  int numSides(){
    return numberOfSides;
}
//rolls die 
public roll(){
    faceValue= (int)(Math.random()*numberOfSides)+1;
    return faceValue;
}
 //returns the color of the die
public static String dieColor(){
    return color;
}








________________________
public class DieTester{
    public static void main(String args[]){
    
int n =1000;

  
    
    
    


    


