import java.util.*;
public class Eliminate_Duplicates {
  
  public static void main(String[] args) {
    
    int[] numbersArray = new int[15];
    
    for (int i=0; i<numbersArray.length; i++){
      numbersArray[i] = (int) (Math.random() * 10);
    }
   
    System.out.println("Array: " + Arrays.toString(numbersArray));
    
    int[] arrayWithoutDuplicates = eliminateDuplicates(numbersArray);
    
    System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));

    
  }

  public static int[] eliminateDuplicates(int[] list){  

    int[] newArray = new int[list.length];
    int arrayCount = 0;
    
    for(int i = 0; i <list.length; i++){
      boolean isUnique = true;
      
      for (int j = 0; j <arrayCount; j++){
        
        if (list[i] == newArray[j]){
          isUnique = false;
          break;
        }
      }
      if (isUnique){
        newArray[arrayCount] = list[i];
        arrayCount++;
      }
    }
      int[] returnArray = new int[arrayCount];
      System.arraycopy(newArray, 0, returnArray, 0, arrayCount);


    return returnArray;
  }
  
}