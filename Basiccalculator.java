import java.util.Scanner;
public class Basiccalculator
{
   public static void main(String[] args)
   {
     int num1,num2,result;
     char operator;
     Scanner input= new Scanner(System.in);
     System.out.println("enter the operator");
     operator=input.next().charAt(0);
     System.out.println("enter the num1");
     num1= input.nextInt();
     System.out.println("enter the num2");
     num2= input.nextInt();
     switch(operator)
     {
       case '+':
         result= num1 + num2;
         System.out.println(result);
         break;
       case '-':
         result= num1 - num2;
         System.out.println(result);
         break;
       case '*':
         result= num1 * num2;
         System.out.println(result);
         break;
       case '/':
         result= num1 / num2;
         System.out.println(result);
         break;
       case '^':
         result= num1 ^ num2;
         System.out.println(result);
         break;
      }
    }
}