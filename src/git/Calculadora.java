package git;

import java.util.Scanner;

public class Calculadora {
	
	
	public static Integer main(String[] args) {
		 Integer a=0;
		 Integer b=0;
		 Integer opcion;
		 Integer resultado=0;
		 Scanner teclado = new Scanner(System.in);
		
		 
		 do{
		 System.out.println
		 ("Ingrese su operación /n 1 para dividir /n 2 para multiplicar /n 3 para restar /n 4 para sumar");
		 opcion = teclado.nextInt();
		 }while(opcion < 1 && opcion > 4);
		 System.out.println("Ingrese el primer numero");
		 a = teclado.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 a = teclado.nextInt();		 
		 
		 public Integer metodoQueDivideDosNumeros(Integer a Integer b) {
			 Integer resultado = a / b;
			    System.out.println("El resultado es " + resultado.toString());
				 return resultado;
		}
		 
		public Integer metodoQueMultiplicaDosNumeros(Integer a,Integer  b) {
			  Integer resultado = a * b;
			  System.out.println("El resultado es " + resultado.toString());
			   return resultado;
		 }
		 
		 public Integer metodoQueRestaDosNumero(Integer a, Integer b) {
			 	Integer resultado = a - b;
			 	System.out.printIn("El resultado es " + resultado.toString());
			 	return resultado;
		 }
			 
		 public Integer metodoQueSumaDosNumero(Integer a, Integer b) {
			 	Integer resultado = a + b;
			 	System.out.printIn("El resultado es " + resultado.toString());
			 	return resultado;
		 }
		}
	}


