class PetrolPump { 
            int petrol;
            int distance;
            PetrolPump(int p, int d){
                petrol =p;
                distance = d;
            }
}

public class PathPossibleBetweenPetrolPumps {
       

        public static int PathPossibleBetweenPetrolPumpsfun(PetrolPump data[]) {
       
        int start=0;
        int end = data.length-1;
        int n = data.length;
        
        int cur_pet=0;
        int finalStart = start;
        
        while(start!=end){
            
            cur_pet = cur_pet+(data[start].petrol-data[start].distance); // calculate the current petrol
            
            if(cur_pet < 0){                 // if petrol is not sufficient -1 
                cur_pet=0; 					// reset the value of cur_pet				
                end= start;					// make end .... to start			
                start = (start+1)%n;		// move start by 1 we do % increment becuase its circular and index should not go out of bound	
                finalStart = start;          // reset finalStart
                
                if(start == 0){				 // all nodes are visited after last node again start become = 0 
                  return -1;
                }
            }
            else{
                start = (start+1)%n;
            }
        }
        System.out.println("cur_pet : "+cur_pet);
        return finalStart;
    }
    
public static void main(String[] args) {
    PetrolPump arr[] = {new PetrolPump(4,6), new PetrolPump(6,5),new PetrolPump(7, 3),new PetrolPump(4,5)};
    
    System.out.println(PathPossibleBetweenPetrolPumpsfun(arr));
}

}