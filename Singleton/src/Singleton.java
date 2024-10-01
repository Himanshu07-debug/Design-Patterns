/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cse
 */
public class Singleton {

    
    private static Singleton singleInstance=new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
      // RULE -> Static context ke andar non-static use nhi kar sakte
      // Therefore make obj as static
      return singleInstance;  
    }
    
}
