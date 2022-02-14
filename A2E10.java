import java.util.Scanner;
public class A2E10 
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        int sumaNumeros = 0;
        int sumaNumerosAux =0;
        int numAuxMod = 0;
        int numMultiplos = 0;
        System.out.println("Se leeran los numeros hasta que la suma de los mismos llegue a 1000");
        while(sumaNumeros <= 1000)
        {
            System.out.println("Ingrese el numero:");
            int num = entrada.nextInt();
            sumaNumeros = (sumaNumeros+num);
            numAuxMod = (num % 6);
            if(numAuxMod == 0)
            {
                numMultiplos = (numMultiplos+1);
            }
            if((num >= 1) && (num <= 10))
            {
                sumaNumerosAux = (sumaNumerosAux+1);
            }
        }
        System.out.println("La cantidad de numeros multiplos de 6 encontrados es: "+numMultiplos);
        System.out.println("La suma de los numeros encontrados entre (1,10) es: "+sumaNumerosAux);
    }
}