import java.util.Scanner;
class Grade
{
public static void main(String[] args)
{
Scanner pt=new Scanner(System.in);
{
System.out.println("Enter a number");
}
int number=pt.nextInt();
if(number>=0 && number<30)
{
System.out.println(number + " fail");
}
else if(number>=30 && number<60)
{
System.out.println(number + " Second");
}
else if(number>=60 && number<=100)
{
System.out.println(number + " first");
}
else
{
System.out.println(number + " Inavalid Number");
}
}


}