package ejercicios_random;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Program extends Personas{

	public static void main(String[] args) {
			
		
		List<Program> personas = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
		            personas.add(new Program());
		        }
		
		for (Program person : personas) {
		    List<String> attributes = new ArrayList<>();
		    }
		
		for (int i = 0; i < personas.size(); i++) {
		            Program p = personas.get(i);
		            System.out.println("Tu persona " + (i+1) + " es: " + p.get_nombre());
		            System.out.println("Y tiene los siguientes atributos: " + p.get_atributo() + ", " + p.get_atributo2() + ", " + p.get_atributo3() + ", " + p.get_atributo4());
		            System.out.println("");
		        }
		
		 int min = 0;
	     int max = 9; 
	     int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		 
	      Program persona_elegida = personas.get(random_int);
	      
		System.out.println(persona_elegida.get_nombre());
		
		
		/*Program P_1 = new Program();
		Program P_2 = new Program();
		Program P_3 = new Program();
		Program P_4 = new Program();
		Program P_5 = new Program();
		Program P_6 = new Program();
		Program P_7 = new Program();
		Program P_8 = new Program();
		Program P_9 = new Program();
		Program P_10 = new Program();
		
		System.out.println("Tu persona 1 es:" + P_1.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_1.get_atributo() +", " + P_1.get_atributo2() +", " + P_1.get_atributo3() +", " + P_1.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 2 es:" + P_2.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_2.get_atributo() +", " + P_2.get_atributo2() +", " + P_2.get_atributo3() +", " + P_2.get_atributo4());
		System.out.println("");

		System.out.println("Tu persona 3 es:" + P_3.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_3.get_atributo() +", " + P_3.get_atributo2() +", " + P_3.get_atributo3() +", " + P_3.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 4 es:" + P_4.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_4.get_atributo() +", " + P_4.get_atributo2() +", " + P_4.get_atributo3() +", " + P_4.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 5 es:" + P_5.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_5.get_atributo() +", " + P_5.get_atributo2() +", " + P_5.get_atributo3() +", " + P_5.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 6 es:" + P_6.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_6.get_atributo() +", " + P_6.get_atributo2() +", " + P_6.get_atributo3() +", " + P_6.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 7 es:" + P_7.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_7.get_atributo() +", " + P_7.get_atributo2() +", " + P_7.get_atributo3() +", " + P_7.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 8 es:" + P_8.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_8.get_atributo() +", " + P_8.get_atributo2() +", " + P_8.get_atributo3() +", " + P_8.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 9 es:" + P_9.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_9.get_atributo() +", " + P_9.get_atributo2() +", " + P_9.get_atributo3() +", " + P_9.get_atributo4());
		System.out.println("");
		
		System.out.println("Tu persona 10 es:" + P_10.get_nombre());
		System.out.println("Y tiene los soguientes atributos: " + P_10.get_atributo() +", " + P_10.get_atributo2() +", " + P_10.get_atributo3() +", " + P_10.get_atributo4());
		System.out.println("");*/
		
		/*ArrayList<Program> lst = new ArrayList<Program>();
		for (int i = 0; i < 10; i++) {
		  lst.add(P_1);
		  
		  }*/
}
}


// Crear lista de personas
/*ArrayList<Program> lst = new ArrayList<Program>();
for (int i = 0; i < 10; i++) {
  Program Person = new Program();
  lst.add(Person);
  
  }

}*/