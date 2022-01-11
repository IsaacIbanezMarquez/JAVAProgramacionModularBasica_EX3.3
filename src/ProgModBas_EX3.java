import java.util.Scanner;

public class ProgModBas_EX3
{
    // 3. (max) Fer una funció que donats dos nombres ens retorni el màxim.


    public static void maximo()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor Introduzac un numero:");

        int userNum1 = sc.nextInt();

        System.out.println("Por favor Introduzca el segundo numero:");

        int userNum2 = sc.nextInt();

        if (userNum1 < userNum2)
        {
            System.out.println("El numero mayor es: " + userNum2);
        }
        else
        {
            System.out.println("El numero mayor es: " + userNum1);
        }
    }

    public static void main(String[] args)
    {
        maximo();
    }
}