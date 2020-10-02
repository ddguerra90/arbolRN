/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesrn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class ArbolesRN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int resul;
        Rojinegros arbol = new Rojinegros();

        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);

        arbol.inicializar();
        String aux;
        int v;
        System.out.println("INSERTAR NODOS");
        System.out.println("Digite Numero. 9999 para terminar");

        try {
            aux = teclado.readLine();
            v = Integer.parseInt(aux);
            while (v != 9999) {
                arbol.insertar(v);
                arbol.inorden(arbol.Raiz());
                System.out.println("");
                arbol.preorden(arbol.Raiz());
                System.out.println("");
                System.out.println("--------------");
                System.out.println("Digite Nero. 9999 para terminar");

                aux = teclado.readLine();
                v = Integer.parseInt(aux);
            }
        } catch (IOException el) {
            System.out.println("Error al abrir el teclado.");
        }

/////////////////////////////////////////////////////// // retiros /////////////////////////////////////////////////////// /////////////////////////////////////////////////////// /////////////////////////////////////////////////////// 
        System.out.println("RETIRAR NODE'S");
        System.out.println("Digite Numero. 9999 para terminar");
        try {
            aux = teclado.readLine();
            v = Integer.parseInt(aux);
            while (v != 9999) {
                arbol.eliminar(arbol.Raiz(), v);
                arbol.inorden(arbol.Raiz());
                System.out.println("");
                arbol.preorden(arbol.Raiz());
                System.out.println("");
                System.out.println(" ");
                System.out.println("Digite Numero. 9999 para terminar");
                aux = teclado.readLine();
                v = Integer.parseInt(aux);
            }
        } catch (IOException el) {
            System.out.println("Error al abrir el teclado.");
        }

    }

}
