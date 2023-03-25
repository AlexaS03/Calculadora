package Operaciones;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0, b=0, res=0;
		String sel=null;
		try (Scanner tec = new Scanner(System.in)) {
			System.out.println("Seleccionar una opción\n");
			System.out.println("+: Suma"
					+ "\n-: Resta"
					+ "\n*: Multiplicación"
					+ "\n/: División");
			
			sel=tec.next(); 		
			switch(sel){
				case "+":
				System.out.println("Ha seleccionado Suma: Ingresar Valores\n");
				System.out.println("Primer Sumando\n");
				a=tec.nextInt();
				System.out.println("Segundo Sumando\n");
				b=tec.nextInt();
				res=a+b;
				System.out.println(a+"+"+b+"="+res);
				break;
				
				case "-":
					System.out.println("Ha seleccionado Resta: Ingresar Valores\n");
					System.out.println("Minuendoo\n");
					a=tec.nextInt();
					System.out.println("Sustraendo\n");
					b=tec.nextInt();
					res=a-b;
					System.out.println(a+"-"+b+"="+res);
					break;
				
				case "*":
					System.out.println("Ha seleccionado Multiplicación: Ingresar Valores\n");
					System.out.println("Multiplicando\n");
					a=tec.nextInt();
					System.out.println("Multiplicador\n");
					b=tec.nextInt();
					res=a*b;
					System.out.println(a+"*"+b+"="+res);
					break;	
					
				case "/":
					System.out.println("Ha seleccionado División: Ingresar Valores\n");
					System.out.println("Divisor\n");
					a=tec.nextInt();
					System.out.println("Dividendo\n");
					b=tec.nextInt();
					res=a/b;
					System.out.println(a+"/"+b+"="+res);
					break;
					
			}
		}

	}

}
