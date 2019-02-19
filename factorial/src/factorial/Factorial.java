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
    public static void main (String[]args){
        
        System.out.println(String.format ("el factorial de 3 es %d", factorial (3));
        System.out.println(String.format ("el factorial de 7 es %d", factorial (7));
        System.out.println(String.format ("el factorial de 35 es %d", factorial (35));
    
    }
        
            
        static int factorial
       
    while(numero1 !=0)
        {
            factorial=factorial * numero1;
            numero1=numero1 -1;
        }
        
        public class Factorial {
 
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
 
		System.out.print("Indica el numero a calcular su factorial ");
 
		int valorCalcular=0;
 
		
		while(valorCalcular<1) {
			try {
				
				valorCalcular=entrada.nextInt();
 
				
				if(valorCalcular<1)
					System.out.println("El valor tiene que ser superior a 0");
			}catch(InputMismatchException e) {
				
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
			}
		}
 
		long factorial=1L;
		for(int i=valorCalcular;i>0;i--) {
			factorial=factorial*i;
		}
 
		System.out.println("El factorial de " + valorCalcular + " es " + factorial);
	}
 
}
    
    
        
    
    }
    
    

 
    
}
