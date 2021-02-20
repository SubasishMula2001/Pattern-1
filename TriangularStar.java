import java.util.Scanner;
public class TriangularStar{
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	int i,j,n;
	n=s.nextInt();
	for(i=1;i<=n;i++){
		for(j=1;j<=i;j++){
			System.out.print("*");
			
			
		}
		System.out.println();
	}
}
}