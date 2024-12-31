package day02;

public class Problem1_1 {

    public static void main(String[] args) {
        int[] lex = new int[] {1, 2, 3, 4, 5}; // Array for testing
        int a = 1;  // Initialize a to 1 (assuming that the sequence is initially increasing)

        // Check for increasing sequence
        for (int i = 1; i < lex.length - 1; i++) {
            if (lex[i] <= lex[i + 1]) {
                a = 0; // Set a to 0 if the sequence is not strictly increasing
                break; // Exit the loop once we find a violation
            }
           
        for(int j = 2; j < lex.length - 1; j++) {
            if (lex[j] <= lex[j + 1]) {
                a = 1; 
                break; 
            	
            }
            
        }

        System.out.println(a); // Print the result
    }
 }
}