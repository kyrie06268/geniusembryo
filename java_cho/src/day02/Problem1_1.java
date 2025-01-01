package day02;

public class Problem1_1 {

    public static void main(String[] args) {
        int[] lex = new int[] {1, 2, 3, 4, 5};
        int a = 1;  

        for(int i = 1; i < lex.length - 1; i++) {
            if (lex[i] < lex[i + 1]) {
                a = 0; 
                break;
            }
           }

        System.out.println(a); // Print the result
    }
 }