import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa horas trabajadas");
        int horas = sc.nextInt();

        if (horas <= 40) {
            int sueldotot = horas * 16;
            System.out.println("Tu sueldo es: " + sueldotot);
        } else if (horas > 40) {
            int horasextras = horas - 40;
            int sueldoextra = horasextras * 20;
            int sueldonormal = 40 * 16;
            int sueldoT = sueldoextra + sueldonormal;
            System.out.println("Tu sueldo con trabajo estra: " + sueldoT);
        } else {
            System.out.println("la cagetiaste");
        }
        sc.close();
    }
}
