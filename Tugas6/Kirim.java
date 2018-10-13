/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author Ardania
 */
public class Kirim extends Thread{
    
    int ganjil;
    
    public Kirim(int num){
        ganjil = num;
    }
    public void run(){
        for(int i=0; i< 10; i++){
            ganjil++;
            ganjil++;
            System.out.print(ganjil + " ");
        }
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            
        }
    }
}
