import java.util.*;
class calculator{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        System.out.println("=====CALCULATOR=====");
        System.out.println("addition");
        System.out.println("subtraction");
        System.out.println("multiplictaion");
        System.out.println("divison");
        System.out.println("modulos");
        System.out.println("root");
        System.out.println("power");
        System.out.println("EXIT");
        
System.out.println("\nEnter your choice:\n");

int choice = sc.nextInt();

int a,b;

switch(choice){
   case 1:
       System.out.println("Enter firt number : ");
       a = sc.nextInt();

System.out.println("Enter second number :");
 b =sc.nextInt();
      
 System.out.println("Result :"+(a+b));
       break;
       
       case 2:
           System.out.println("Enter firt number : ");
 a = sc.nextInt();

System.out.println("Enter second number :");
 b =sc.nextInt();

           System.out.println("Result :"+(a-b));
           break;
           
           case 3:
               System.out.println("Enter firt number : ");
 a = sc.nextInt();

System.out.println("Enter second number :");
 b =sc.nextInt();

               System.out.println("Result :"+(a*b));
               break;
               
               case 4:
                   System.out.println("Enter firt number : ");
 a = sc.nextInt();

System.out.println("Enter second number :");
 b =sc.nextInt();

                   System.out.println("Result :"+(a/b));
                   break;
                   
                   case 5:
                       System.out.println("Enter firt number : ");
 a = sc.nextInt();

System.out.println("Enter second number :");
 b =sc.nextInt();
                       System.out.println("Result :"+(a%b));
                       break;
                      
                       case 6:
                           System.out.println("Enter firt number : ");
 a = sc.nextInt();

System.out.println("Enter second number :");
 b =sc.nextInt();
 
 System.out.println("Result :"+Math.sqrt(a));
                           break;
                           
                           case 7:
                               System.out.println("Enter number : ");
 a = sc.nextInt();
 
System.out.println("Enter second number :");
 b =sc.nextInt();

        System.out.println("Result :"+Math.pow(a,b));
                               break;
                               
                               case 8:
                                   System.out.println("CALCULATOR CLOSED");
                                   break;
                                   
                                   default:
                                       System.out.println("Invalid choice");
                                       
}
while(choice!=8){
    sc.close();
}

    }
}