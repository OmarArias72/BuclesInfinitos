/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Infinito {
     int x = 0;
    public void loop() {
    
    while(x<10) {
        System.out.println("¡Esto no acaba!");
    }
    }
    
    public static void main(String[] args) {
        Infinito imprimir = new Infinito();
        imprimir.loop();
    }
}
