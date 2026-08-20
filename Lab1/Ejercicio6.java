import java.util.Scanner;
class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese horas: ");
        int hora = scanner.nextInt();
        System.out.print("Ingrese minutos: ");
        int min = scanner.nextInt();
        System.out.print("Ingrese segundos: ");
        int seg = scanner.nextInt();
        int convSegundos = conversion(hora, min, seg);
        System.out.println("Conversion a segundos: "+convSegundos);
    }
    public static int conversion(int h, int m,int s) {
        int totalseg;
        totalseg = (h*3600) + (m*60) + s;
        return totalseg;
    }
}
