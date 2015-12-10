/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrefactorizacion;

import static examenrefactorizacion.ExamenRefactorizacion.primo;

/**
 *
 * @author ngarciacarrillo
 */
public class Primos {

    int i;
    int digito;

    public Primos() {

    }

    public void introducirDatos(int digito) {
        this.digito = digito;
        if (digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    }

    public void comparar(int i) {
        if (i < 4) {
            primo = true;
        } else {
            if (i % 2 == 0) {
                primo = false;
            } else {
                if (i % 2 == 0) {
                } else {
                    this.i = i;
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
        }
    }
    public void numPrimo(int i){
        this.i = i;
        if (primo == true) {
            System.out.println(i);
}

}
}

