/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/*
1. El importar las clases no significa ue se encuentren cargando la memoria.
Solo hasta que se utilicen en el codigo, se utilizara espacio memoria.
*/
//import mx.com.globalmentoring.Utileria;

/*
2. Se puede importar el metodo estatico de otra clase y tuilizarlo directo.
*/

//import static mx.com.globalmentoring.Utileria.imprimir;




/**
 *
 * @author lepo9
 */
public class TestUtileria {
    public static void main(String[] args) {
        //1. Utileria.imprimir("Saludos");
        //2. imprimir("Adios");
        //Se puede hacer con el nombre completamente calificado
        mx.com.globalmentoring.Utileria.imprimir("Adios");
    }
}
