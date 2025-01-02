package day02;

public class Problem1_1 {

    public static void main(String[] args) {
        int[] lex = new int[] {2, 1, 3, 4, 5};
        int a = 0;  

        for(int i = 1; i < lex.length - 1; i++) {
            if(lex[i] < lex[i + 1]) {
                a = 1; 
                break;
            }
            else {
            	for(int j=2; j <lex.length-1; j++) {
                	if(lex[j] < lex[j+1]) {
                		a = 2;
                		break;
                	}
                }
            }
           }
        

        System.out.println(a); 
    }
 }