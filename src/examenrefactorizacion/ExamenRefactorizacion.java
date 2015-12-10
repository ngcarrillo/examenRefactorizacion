/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrefactorizacion;

/**
 *
 * @author ngarciacarrillo
 */
public class ExamenRefactorizacion {

    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean primo = false;

    public static void main(String arg[]) {
        int digito = 3;
        int numeroDigitos = 0;
        Primos primo1 = new Primos();
        primo1.introducirDatos(digito);
        for (int i = 1; i <= 99999; i++) {
            int auxiliar = i;

            int contador = 0;

            while (auxiliar != 0) {
                auxiliar = auxiliar / 10;
                contador++;
            }
            numeroDigitos = contador;

            if (numeroDigitos == digito) {

                primo1.comparar(i);
                primo1.numPrimo(i);
            }
        }

    }

}
