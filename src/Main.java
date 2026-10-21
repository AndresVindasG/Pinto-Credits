public class Main {
    public static void main(String[] args) {
        int numero = 901602;

        System.out.println(suma15(numero));
    }

    static boolean suma15(int numero) {
        int ultimoDigito = 0;
        int sumatoria = 0;
        boolean mayorOIgualQueQuince = false;

        while (numero > 0) {
            ultimoDigito = numero % 10;             //analizo el último dígito
            sumatoria = sumatoria + ultimoDigito;   //voy sumando
            numero = numero / 10;                   //Quito el último dígito
        }
        if (sumatoria >= 15) {
            mayorOIgualQueQuince = true;
        }
        return mayorOIgualQueQuince;
    }
}