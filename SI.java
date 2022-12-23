import java.util.Scanner;
public class SI
{
public static void main(String[] args)
{
float pa,time,rate,SI;
Scanner sc=new Scanner(System.in);
System.out.println("enter principle ammount");
pa=sc.nextFloat();
System.out.println("enter time");
time=sc.nextFloat();
System.out.println("enter rate");
rate=sc.nextFloat();
SI=pa*time*rate;
System.out.println("simple interest is:"+SI/100);
}
}