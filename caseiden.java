import java.util.Scanner;
class Caseiden
{
public static void main(String[] abcd)
{
Scanner p=new Scanner(System.in);
System.out.println("Please Enter your Data");
String k=p.next();
char z=k.charAt(0);
if(z>=65 && z<=90)
{
System.out.println(z + "Upper case");
}
else if(z>=97 && z<=122)
{
System.out.println(z + " Lower case");
}
else
{
System.out.println("Inavalid Data");
}

}

}