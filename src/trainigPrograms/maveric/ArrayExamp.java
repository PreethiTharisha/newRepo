package trainigPrograms.maveric;

class ArrayExamp 
{
    public static void main (String[] args) 
    {         
      // declares an Array of integers.
      int[] arr= {10,20,30,4,5,56};
      
      
        // allocating memory for 5 integers.
    //  arr = new int[5];
      
      
       // initialize the first elements of the array
     // arr[0] = 10;
      
      // initialize the second elements of the array
      //arr[1] = 20;
      
     // accessing the elements of the specified array
      for (int i = 0; i < arr.length; i++)
         System.out.println("Element at index " + i +  " : "+ arr[i]);          
    }
}

