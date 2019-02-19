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
        System.out.println("Factorial");
        System.out.println(String.format("El factorial de 4 es %d",Fac(4)));
               
    }
    
    
    static int Fac(int f)
    {
       int numero=1;
      
       while(f>0)
       {
           numero=numero*f;
           f--;
       }
        f=numero;
        return f;
}
}
   