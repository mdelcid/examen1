package miproyecto;

import java.util.Scanner;

public class miclase 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner mi_scanner = new Scanner(System.in);
		
		int nota1;
		int nota2;
		int nota3;
		int nota4;
		
		System.out.println("Alumno 1");
		System.out.println("Escriba nota1: ");
		nota1 = mi_scanner.nextInt();
		System.out.println("Escriba ntoa2: ");
		nota2 = mi_scanner.nextInt();
		System.out.println("Escriba nota 3: ");
		nota3 = mi_scanner.nextInt();
		nota4 = ((nota1+nota2+nota3)/(3));
		System.out.println("El promedio es: " + nota4);
		
		if(nota4>=60)
		{ System.out.println("Aprobado");
		} 
		else System.out.println("Reprobado");
		
		System.out.println("Alumno 2");
		System.out.println("Escriba nota1: ");
		nota1 = mi_scanner.nextInt();
		System.out.println("Escriba nota2: ");
		nota2 = mi_scanner.nextInt();
		System.out.println("Escriba nota3: ");
		nota3 = mi_scanner.nextInt();
		nota4 = ((nota1+nota2+nota3)/(3));
		System.out.println("El promedio es: " + nota4);
		
		if(nota4>=60)
		{ System.out.println("Aprobado");
		}
		else System.out.println("Reprobado");
		
		System.out.println("Alumno 3");
		System.out.println("Escriba nota1: ");
		nota1 = mi_scanner.nextInt();
		System.out.println("Escriba nota2: ");
		nota2 = mi_scanner.nextInt();
		System.out.println("Escriba nota3: ");
		nota3 = mi_scanner.nextInt();
		nota4 = ((nota1+nota2+nota3)/(3));
		System.out.println("El promedio es: " + nota4);
		
		if(nota4>=60)
		{ System.out.println("Aprobado");
		}
		else System.out.println("Reprobado");
	}
		
}


