import java.io.IOException;
  import java.util.Scanner;
  
  public class DesafioPares{
      
        public static void main(String[] args) throws IOException {
          
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
          
      	for (int i = 1 ; i <= N ; i++) {
      		if (i %2 == 0 ) System.out.println(i);
      	}
      }
  	
  }