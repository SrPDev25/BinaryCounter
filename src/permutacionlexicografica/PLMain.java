package permutacionlexicografica;

public class PLMain {

    private static void pTabla(String tabla[]){
        short count=10;
        while (count >= 0) {
                System.out.print(tabla[count]);
                count--;
            }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] printR = {"A","A","A","A","A","A","A","A","A","A"};
        int x = 1000000000, y, z;
        int exponente, sistemaNum = 10;
        while (x != -1) {
            y = x;
            z = 0;
            exponente = 0;
            while (y >= 1) {
                printR[exponente] = letras[y % sistemaNum];
                y /= sistemaNum;
                exponente++;
            }
            pTabla(printR);
            x--;
        }
    }

}
/*Scanner entrada = new Scanner(System.in);
        int[] letras = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int x = 1000000000, y, z = 0;
        int exponente, sistemaNum=10;
        while (x != -1) {
            y = x;
            z = 0;
            exponente = 0;
            while (y >= 1) {
                z += (y % sistemaNum) * Math.pow(10, exponente);
                y /= sistemaNum;
                exponente++;
            }
            System.out.println(z);
            x--;
        }*/