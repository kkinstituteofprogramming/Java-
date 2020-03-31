import java.io.*; 
   
class Minimum{
       
    // adding two integer values. 
    public int min(int a, int b){ 
           
        int min;
	if(a<b)
		min=a;
	else
		min=b; 
        return min; 
    } 
       
    // adding three integer values.
    public int min(int a, int b, int c){  
           
        int min;
        if(a<b && a<c)
		min = a;
	else if(a<b && b<c)
		min = b;
	else
		min = c;
	return min; 
    }
       
}
   
class Overload_By_No_Of_Arguments_1 { 
    public static void main (String[] args) { 
           
        Minimum ob = new Minimum(); 
           
        int min1 = ob.min(1,2); 
        System.out.println("Manimum of given two values is :" + min1); 
        int min2 = ob.min(1,2,3); 
        System.out.println("Manimum of three given values is :" + min2); 
           
    } 
} 