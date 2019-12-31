package vjezba19;

import java.io.Serializable;

public class Car implements Serializable{

    
   private String model;
   private int maxSpeed;
   
   
   public void setModel(String model){
       this.model = model;
       
   }
   public String getString(){
       return this.model;
   }
   public void setMaximumSpeed(int maxSpeed){
       this.maxSpeed = maxSpeed;
   }
   public int getMaxSpeed(){
       return this.maxSpeed;
   }

    @Override
    public String toString() {
        return "Model: " + model + " Max speed" + maxSpeed;
                
    }
   
   
    
    
    
    
}
