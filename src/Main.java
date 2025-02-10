import java.util.Scanner;
public class Main {
    public static void operaciones() {
        Scanner s = new Scanner(System.in);
        String c;
        int a;
        while(true){
            System.out.println("introduce el primer numero: ");
            c = s.next();
            try{
                a = Integer.parseInt(c);
                break;

            }catch (NumberFormatException e) {
                System.out.println("no es un numero");
            }
        }
        String d;
        int b;
        while (true){
            System.out.println("introduce el segundo numero: ");
            d = s.next();
            try{
                b = Integer.parseInt(d);
                break;
            }catch (NumberFormatException e) {
                System.out.println("no es un numero");
            }
        }
        char signo;
        while (true){
            System.out.println("introduce el signo de operacion: ");
            signo = s.next().charAt(0);
            if (signo == '+' || signo == '-' || signo == '*' || signo == '/') {
                break;
            } else {
                System.out.println("Operador no válido. Por favor, ingrese +, -, *, o /.");
            }
        }

        int resultado= 0;
        if(signo == '+'){
            resultado = a + b;
        } else if (signo == '-') {
            resultado = a - b;
        } else if (signo == '*') {
            resultado = a * b;
        }else {
            if (b !=0){
                resultado = a / b;
            }else {
                System.out.println(b+ "no puede ser cero");
            }
        }
        System.out.println("La operacion de " + a + " y " + b + " es: " + resultado);
    }
    public static void main(String[] args) {
        System.out.println("UPB Calculadora!!");
        operaciones();
    }
}
