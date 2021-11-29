package permutacionlexicografica;

public class NumerosBinarios {

    byte[] numeros = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public NumerosBinarios() {
    }

    private void Tabla(){
        System.out.println(numeros[0]+""+numeros[1]+""+numeros[2]+""+numeros[3]+""+numeros[4]+""+numeros[5]+""+numeros[6]+""+numeros[7]+""+numeros[8]+""+numeros[9]);
    }
    public void Opciones(int x) {
        int count;
        while (true) {
            count = 0;
            numeros[x]++;
            if (numeros[x] == 2) {
                numeros[x] -= 2;
                Opciones(x - 1);
            }
            /*while (count < 10) {
                System.out.print(numeros[count]);
                count++;
            }*/
            Tabla();
            if (x == 0 || numeros[x - 1] == 1 && numeros[x] == 1) {
                break;
            }
        }
    }

    public void getCeros() {
        int count = 0;
        Tabla();
        /*while (count < 10) {
            System.out.print(numeros[count]);
            count++;
        }*/
    }
}
