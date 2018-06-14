package assignment6;
import java.util.Scanner;
public class String_to_int {

	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int no1 = Integer.parseInt(s1);
		int no2=Integer.parseInt(s2);
		if(no1>no2)
			System.out.println(no1);
		else
			System.out.println(no2);
	}
}
