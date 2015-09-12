import java.util.Scanner;
import java.io.IOException;

public class BintangSiku{
	public static void main(String[] args) {
		int x,y;
		for (x=1;x<=5;x++)
   		{
   			for(y=5; y>=x; y--)
      	{
       		System.out.print("*");
     	}
      		System.out.println(" ");
   		}

	}}
