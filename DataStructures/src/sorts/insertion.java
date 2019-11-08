package sorts;

import java.util.Scanner;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String userInput = scanner.nextLine();
        
        char[] ch = userInput.toCharArray();
        System.out.println(ch);
        char[] ascii = ch;
        
        for(int i=1; i<ch.length-1; i++)
        {
            int temp = ch[i];
            int j = i - 1;
            while((j < -1) && (ch[i] >= temp))
            {
                ch[j+1] = ch[j];
                j = j - 1;
            }
            ch[j+1] = (char) temp;
        }
 	   
        
    }
        
	}


