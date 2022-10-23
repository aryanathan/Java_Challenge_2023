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
 
    
    
    


    


