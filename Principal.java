package hotel;

import java.util.Scanner;

import hotel_transilvania_persona.persona;
import hotel_transilvania_persona.personaDB;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		conexion con = new conexion();
		con.conectar();
		*/
		Scanner leer= new Scanner(System.in);
		
		System.out.print("Nombre de la persona: ");
		String p1=leer.nextLine();
		System.out.println("Apellido: ");
		String a1= leer.nextLine();
		System.out.print("Nombre de la persona: ");
		String p2= leer.nextLine();
		System.out.println("Apellido: ");
		String a2= leer.nextLine();
		persona per = new persona(p1,a1, 86543, 3123123);
		persona per2 = new persona(p2, a2, 031313, 2434023);
		personaDB perDB = new personaDB();
		
		perDB.agregarPersona(per);
		perDB.agregarPersona(per2);
		
		
		//perDB.editarPersona(per, per2);
		leer.close();
	}

}
