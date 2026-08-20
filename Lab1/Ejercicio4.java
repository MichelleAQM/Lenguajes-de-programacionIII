import java.util.Scanner;
class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numeros: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double menor = menorDeTres (n1, n2, n3);
        System.out.println("Menar de tres:" + menor);
    }
    public static double menorDeTres (double n1, double n2, double n3) {
        if (n1 <= n2 && n1 <=n3) {
            return n1;
        } 
        else if (n2 <= n1 && n2 <=n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
