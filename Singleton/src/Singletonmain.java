/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cse
 */
public class Singletonmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello Singleton Pattern");

        // Static methods can be called using the classname also, non-static methods requires Object to call
        Singleton object= Singleton.getInstance();
    }
    
}
