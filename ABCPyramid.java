import java.util.Scanner;

public class ABCPyramid {
	public static void main(String[] args) {
		int count = 0;
		int j;
		
//		Loop for first half triangle
		for(int i = 1; i <= 5; i++) //for 5 loops
		{
			if(i <= 3){
				for(j = 1; j <= 5-i; j++) //for spaces
					System.out.print(" ");
				for(j = 1; j <= 2*i-1; j++)
					if(j <= i)
						System.out.print((char)(char)(j+96)+""); //for printing values
					else
						System.out.print((char)(char)(2*i-j+96)+"");
			}
			else{
//		Loop for second half triangle		
				for(j = 1; j <= i-1; j++) //for spaces
					System.out.print(" ");
				for(j = 1; j <= i-1; j++)
					if(j < i){
						if(i==5 && count == 1){
							break;}
						System.out.print((char)(char)(j+96)+""); //for printing values
						if(i==5)
						count++;
					}else
						System.out.print((char)(char)(2*i-j+96)+"");
			}
			System.out.println(); //for line break
		}
	}
}
