package git;

public class Calculadora {
	
	
	public static void main(String[] args) {
		 Integer a;
		 Integer b;
		 Integer opcion;
		 Integer resultado;
		 do{
		 System.out.println
		 ("Ingrese su operación /n 1 para dividir /n 2 para multiplicar /n 3 para restar /n 4 para sumar");
		 opcion = teclado.next();
		 }while(opcion < 1 && opcion > 4)
		 System.out.println("Ingrese el primer numero");
		 a = teclado.next();
		 System.out.println("Ingrese el segundo numero");
		 a = teclado.next();
		 
		 switch(opcion) {
		 case 1 :
			 	System.out.println("elegiste la opcion dividir");
			 	resultado = a / b ;
			 	break;
		
		 case 2 :
			 	System.out.println("elegiste la opcion multiplicar");
				resultado = a * b ;
				break;
				
		 case 3 :
			 	System.out.println("elegiste la opcion restar");
				resultado = a - b ;
				break;
			 
		 case 4 :		
			 	System.out.println("elegiste la opcion sumar");
				resultado = a +b ;
				break;	
		 }
		 	System.out.println("El resultado es " + resultado.toString());
		 }
		}


