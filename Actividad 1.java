import java.io.PrintStream;
import java.util.Scanner;
class Actividad1{
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int num = 0;
        screen.println("ingrese un numero entero");
        num = keyboard.nextInt();
        if(num % 2 ==0){
            System.out.println("el " + num + " es par");
        }else{
            System.out.println("el " + num +" es impar");
        }
    }
}