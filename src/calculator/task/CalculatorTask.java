
package calculator.task;
import java.util.Scanner;
public class CalculatorTask {
   public static void showoperation(){
       System.out.println(" + is to sum"
               + "- to sub"
               + "* to multiblication"
               + "/ tp devide"
               + "% to module"
               + "! to fact"
               + "^ to power");
   }
   public static void sum(){
       double sum=0;
       System.out.println("enter number");
       Scanner s=new Scanner(System.in);
       double num=s.nextDouble();
       for(int i=1;i<=num;i++){
           sum+=num;
       }
       System.out.println(sum);
   }
   public static void sub(){
       double sub=0;
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        double num=s.nextDouble();
        for(int i=0;i<num;i++){
           sub-=num;
       }
       System.out.println(sub);
   }
   public static void multi(){
       double multi=1;
       System.out.println("enter numberes");
       Scanner s=new Scanner(System.in);
       double num1=s.nextDouble();
       double num2=s.nextDouble();
     
           multi=num1*num2;
       
       System.out.println(multi);
   }
    public static void div(){
        double num1=1,num2;
        double div=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter numberes");
        num1=s.nextDouble();
        num2=s.nextDouble();
           if(num2>num1)
                System.out.println(div=num2/num1);
           else
              System.out.println(div=num1/num2); 
       
       System.out.println(div);  
   }
     public static void mode(){
        double num1,num2;
        System.out.println("enter numbers");
        Scanner s=new Scanner(System.in);
        num1=s.nextDouble();
        num2=s.nextDouble();
        double mode=num1%num2;
         System.out.println(mode);
   }
 public static void pow(){
        double num1,num2;
        System.out.println("enter num 1 and num 2");
        Scanner s=new Scanner(System.in);
        num1=s.nextDouble();
        num2=s.nextDouble();
        double pow=1;
        for(int i=0;i<num2;i++){
          pow*=num1;
      }
           System.out.println(pow);
   }     
  public static void fact(){
        int num;
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        int fact=1;
        if(num>0){
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
      }
       else
        System.out.println("invalid");   
   }   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name");
        String name=input.next();
        System.out.println("welcom to my calculator"+ name);
        while(true){
            System.out.println("calculator operation");
            showoperation();
            System.out.println("enter operator");
            char op=input.next().charAt(0);
            switch(op){
                case'!':
                    fact();
                    break;
                case '*':
                    multi();
                    break;
                case '+':
                    sum();
                    break;
                case '-':
                    sub();
                    break;
                case'/':
                    div();
                    break;
                case '^':
                    pow();
                    break;
                case '%':
                    mode();
                    break;   
            }
            System.out.println("enter e to end and c to complet");
            char c =input.next().charAt(0);
            if(c=='e'){
                System.out.println("thanks for using my app");
            break;
            }
            else if(c=='c'){
                continue;
            }
            else{
                System.out.println("not valid");
            break;
            }  
                
        }
    }
    
}
