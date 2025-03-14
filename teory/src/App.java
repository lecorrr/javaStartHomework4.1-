
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

  


    public static void main(String[] args) {
        
        factorial();
               
    }

    public static void factorial()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number betwen 4 an 16 \nto calculate factorial:");
        
        try  {
            
            int i = sc.nextInt();
            int j = 1;

            //Calculates factorial of the given number

            if (4 <= i && 20 >= i) {

                for (;i > 0; i--) {
                    j *= i;
                }
    
                System.out.println(j);

            }else{

                System.out.println("Too high number for Integer data type");
           
            }
            
        } catch (InputMismatchException e) {

            System.out.println("Invalid input.");
            
        }
    }
}
