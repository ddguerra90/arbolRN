/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesrn;

/**
 *
 * @author Administrador
 */
class Nodo {
    int llave; 
    int color; 
    Nodo izq; 
    Nodo der; 
    Nodo (int llave, int color) 
    { 
        this.llave = llave; 
        this.color = color; 
    } 
    Nodo (int llave) 
    { 
        this.llave = llave; 
    } 
}
