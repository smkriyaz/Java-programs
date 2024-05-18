//decimal to binary 
// decimal = 0-9
// binary 0 and 1
// lets say 9(decimal) i want to convert into binary (1001) ->Result

/* 9%2 (1) 9/2 =(4) 4%2 (0) 4/2 (2) 2%2 (0)  2/2 (1)   */

public class Decimaltobinary {
  public static void main(String[] args){
    int number = 9;
    int binary[] = new int[1000];
    int i = 0;

    while(number > 0){
       binary[i] = number % 2; // Store the remainder (binary digit)
       number = number / 2;    // Update the number by dividing by 2
       i++;
    }

    // Print binary digits in reverse order
    for(int j = i - 1; j >= 0; j--){
      System.out.print(binary[j]);
    }

    System.out.println(); // Print a newline at the end
  }
}