import java.io.*;
import java.util.Stack;

class GFG {
    Stack aux;
    Stack org;
    
    GFG(){
      aux = new Stack(); 
      org = new Stack();  
    }

    void push1(int n){
        if(org.isEmpty()){
            aux.push(n);
            org.push(n);
            return;
        }
        
        int y = (int)aux.pop();
        aux.push(y);
        org.push(n);
        if(n>y)
           aux.push(y);
        else
           aux.push(n);
    }
    
    int pop1(){
        if(org.isEmpty())
            return -1;
        
        aux.pop();
        
     return (int)org.pop();    
    }
    
    int getmin(){
        if(org.isEmpty())
            return -1;
     return (int) aux.pop();   
    }
    
    
	public static void main (String[] args) {
	    GFG g = new GFG();
	    g.push1(10);
	     g.push1(2);
	      g.push1(13);
	       g.push1(4);
	        g.push1(5);
	        
	        g.pop1();
	        
	        System.out.println( "Min : " +g.getmin());
	        
		//code
	}
}