
// Simple Java program to print next 
// greater elements in a given array
 
class Main
{ 
    /* prints element and NGE pair for 
     all elements of arr[] of size n */
    static void printNGE(int arr[], int n)
    {
        int next, i, j;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (arr[i] < arr[j])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" -- "+next);
        }
    }
      
    public static void main(String args[])
    {
        int arr[]= {11, 13, 21, 3};
        int n = arr.length;
        printNGE(arr, n);
    }
}
*************************************************************************************************
import java.util.*;

class test{
public static void main(String[] args) {

int arr[] = { 10,9,8,11};
Stack<Integer> stack = new Stack<Integer>();

if (arr.length > 0)
 stack.push(arr[0]);

for (int i = 1; i < arr.length; i++) {

    if (stack.isEmpty() == false)
    {
		int element = stack.pop(); //10
        int next = arr[i];  //9
        
        
        while(element < next){
            System.out.println(element + " >> " + arr[i]);
            if(stack.isEmpty())
              break;
            element=stack.pop();
        }
        
        if(element > next) {
          stack.push(element);
        }
    }

    stack.push(arr[i]);

}

    while (!stack.isEmpty()) {
       System.out.println(stack.pop() + " >> -1 ");
    }
}
}