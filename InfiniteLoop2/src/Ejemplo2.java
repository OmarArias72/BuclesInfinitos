/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Ejemplo2 {
    int x;
    public void imprimir(){
        for (int i=0;x<=10;i++){
            System.out.println("2 x "+i+" = "+ 2*i);
            i=5;
        }
    }
    
    public static void main(String[] args) {
        Ejemplo2 dato1 = new Ejemplo2();
        dato1.imprimir();
    }
}
