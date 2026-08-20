import java.util.Random;
class Ejercicio3 {
    public static void main(String[] args) {
        Random random= new Random();
        int[] frecuencia = new int [6];
        for (int i = 0; i < 20000; i++) {
            int dado = random.nextInt(6) + 1;
            switch (dado) {
                case 1:
                    frecuencia[0] += 1;
                    break;
                case 2:
                    frecuencia [1] += 1;
                    break;
                case 3:
                    frecuencia [2] += 1;
                    break;
                case 4:
                    frecuencia [3] += 1;
                    break;
                case 5:
                    frecuencia[4] += 1;
                    break;
                case 6:
                    frecuencia[5] += 1;
                    break;
            }
        }
        for (int i = 0; i < frecuencia.length; i++){
            System.out.println("Frecuencia del " + (i+1) + ":" + frecuencia[i]);
        }
    }
}
