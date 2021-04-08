package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        int first;
        int second;
        char znak;
        Scanner wej=new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        first=wej.nextInt();
        System.out.println("Podaj drugą liczbę:");
        second=wej.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb  - wciśnij -");

        znak=wej.next().charAt(0);
        switch(znak)
        {
            case'+':
                System.out.println(first + second);
                break;
            case'-':
                System.out.println(first - second);
                break;
            }
        }
    }