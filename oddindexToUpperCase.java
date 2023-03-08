package week3day1;

import java.util.Scanner;

public class oddindexToUpperCase{
	
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[] s1=s.split(" ");
for(String x:s1)
{
    int i=0;
    for(Character ch:x.toCharArray())
    {
        if(i%2==0)
            System.out.print(Character.toUpperCase(ch));
        else
            System.out.print(Character.toLowerCase(ch));
        i++;
    }
    System.out.print(" ");
}
}

}
