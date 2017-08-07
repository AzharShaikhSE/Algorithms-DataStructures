public class PathPossibleBetweenPetrolPumps {
    static class PetrolPump{ 
    int petrol;
    int distance;
    PetrolPump(int p, int d){
    petrol =p;
    distance = d;
    }
}

    public static int PathPossibleBetweenPetrolPumpsfun(PetrolPump data[]) {

        int start=0;
        int end = data.length-1;
        int n = data.length;
        int cur_pet=0;
        int finalStart = start;
        int maxFinalStart=0;
        int maxPerol=0;
        int count=0;
        
        while(count<n ){
            cur_pet=0;
            while(start!=end){
                cur_pet = cur_pet+(data[start].petrol-data[start].distance);
                if(cur_pet < 0){
                    cur_pet=0;
                    end= start;
                    start = (start+1)%n;
                    finalStart = start;
                    if(start == 0){
                        break;
                    }
                }
                else{
                    start = (start+1)%n;
                }
            }
            
            System.out.println("start "+start+" end "+end+" finalStart "+finalStart+" cur_pet "+cur_pet);
            if(cur_pet > maxPerol){
                 maxPerol=cur_pet;
                 maxFinalStart=finalStart;
             }
			 end=finalStart;
            start = (finalStart+1)%n;
            finalStart=start;
            count++;
    }
          return maxFinalStart;
    }
    
    public static void main(String[] args) {
        PetrolPump arr[] = {new PetrolPump(2,1), new PetrolPump(3,3),new PetrolPump(4, 4),new PetrolPump(3,2)};
        System.out.println(PathPossibleBetweenPetrolPumpsfun(arr));
        }
    }