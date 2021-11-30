
package permutacionlexicografica;


public class PLMain {


    public static void main(String[] args) {
        // TODO code application logic here
        String[] letras = {"A", "B", "C", "D", 0, 0, 0, 0, 0, 0};
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
        }
    }
    
}
