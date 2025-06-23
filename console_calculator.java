import java.util.*;
class  console_calculator
{
    public static double add(double n1, double n2)
    {
        return  n1+n2;
    }
    public static double subtract(double n1, double n2)
    {
        return  n1-n2;
    }
    public static double multiply(double n1, double n2)
    {
        return  n1*n2;
    }
    public static double divide(double n1, double n2)
    {
        if(n2 == 0)
        {
            System.out.println("Error: division by zero"); 
            return Double.NaN;          
        }
        return n1/n2;
    }
    public static double modulo(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Error: Modulo by zero.");
            return Double.NaN;
        }
        return n1 % n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 0;
        do{
            System.out.print("Enter First Number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter Second Number: ");
            Double b = sc.nextDouble();

            double result;
            switch(op)
            {
                case '+':
                    result = add(a,b);
                    break;
                case '-':
                    result = subtract(a,b);
                    break;
                case '*':
                    result = multiply(a,b);
                    break;
                case '/':
                    result = divide(a,b);
                    break;
                 case '%':
                    result = modulo(a,b);
                    break;
                default:
                    System.out.println("Invalid Operator");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.print("Continue ? (Y/N): " );
            ch = sc.next().charAt(0);


        }while(ch == 'Y' || ch == 'y');

        System.out.println("Thanks for using Calculator.");
        sc.close();
    }    
}