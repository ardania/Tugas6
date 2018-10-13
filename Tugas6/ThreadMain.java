/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author Ardania
 */
public class ThreadMain {
    public static void main(String[] args) {
        Thread t1 = new Kirim(1);
        Thread t2 = new Terima(2);
        
        System.out.println("Running both threads....");
        t1.start();
        t2.start();
    }
}
