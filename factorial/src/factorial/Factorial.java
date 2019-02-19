/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author gerson
 */
public class Factorial {
      public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial");
        System.out.println(String.format("El factorial de 4 es %d",FactorialN(4)));
        // System.out.println(""+FactorialN(5));
        
    }
    
    
    static int FactorialN(int n)
    {
       int acum=1;
      
       while(n>0)
       {
           acum=acum*n;
           n--;
       }
        n=acum;
        return n;
}
}
   