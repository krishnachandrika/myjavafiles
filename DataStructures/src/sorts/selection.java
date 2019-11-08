package sorts;

import java.util.Scanner;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String userInput = scanner.nextLine();
        
        char[] ch = userInput.toCharArray();
       
        for (int i=0; i<ch.length; i++) {
            for (int j=i+1; j<ch.length; j++) {
                if (Character.toLowerCase(ch[j])<Character.toLowerCase(ch[i])) {
                    sortChars(i, j, ch);
                }
            }
        }
        
        
        System.out.println(String.valueOf(ch));
    }
	private static void sortChars(int i, int j, char[] ch) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

		
 }


