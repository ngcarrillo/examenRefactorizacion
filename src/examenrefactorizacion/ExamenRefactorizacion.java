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
        if (digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int auxiliar = i;

            int contador = 0;

            while (auxiliar != 0) {
                auxiliar = auxiliar / 10;
                contador++;
            }
            numeroDigitos = contador;

            if (numeroDigitos == digito) {
                if (i < 4) {
                    primo = true;
                } else {
                    if (i % 2 == 0) {
                        primo = false;
                    } else {
                        int comparador = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                comparador++;
                            }
                            i1 += 2;
                            if (comparador == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (comparador == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(i);
                }
            }
        }
    }
}
