import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	        Person[] persona = new Person[10];
	        for (int i = 0; i < 10; i++) {
	            persona[i] = new Person(){};
	        }
	      
	        int alto = 0;
	        int millonario = 0;
	        int mamado = 0;
	        int Feo = 0;
	        int miedoCucarachas = 0;
	        int estaCansado = 0;
	        int estaEnfermo = 0;
	        int estaTriste = 0;
	        int estaFeliz = 0;
	        System.out.println("JUEGO ADIVINA QUIEN? (JUGADORES)");

	        List<String> caracteristicasImportantes = Arrays.asList("Es Alto", "Es Millonario", "Esta Mamado", "Esta Feo", "Tiene Miedo a Cucarachas", "Esta Cansado", "Esta Enfermo", "Esta Triste", "Esta Feliz");

	        for (Person personas : persona) {
	            System.out.print(personas.getNombre() + ": ");
	            int contador = 0;
	            for (String caracteristica : caracteristicasImportantes) {
	                switch (caracteristica) {
	                    case "Tiene Espada":
	                        if (personas.getAlto()) {
	                            alto++;
	                            System.out.print("Es Alto, ");
	                            contador++;
	                        }
	                        break;
	                    case "Es Millonario":
	                        if (personas.getEsMillonario() ) {
	                            millonario++;
	                            System.out.print("Es Millonario, ");
	                            contador++;
	                        }
	                        break;
	                    case "Esta Mamado":
	                        if (personas.getEstaMamado()) {
	                            mamado++;
	                            System.out.print("Esta Mamado, ");
	                            contador++;
	                        }
	                        break;
	                    case "Esta Feo":
	            if (personas.getEstaFeo()) {
	                Feo++;
	                System.out.print("Esta Feo, ");
	                contador++;
	            }
	            break;
	                    case "Tiene Miedo a Cucarachas":
	            if (personas.getMiedoCucarachas()) {
	                miedoCucarachas++;
	                System.out.print("Tiene Miedo a Cucarachas, ");
	                contador++;
	            }
	            break;
	                    case "Esta Cansado":
	            if (personas.getEstaCansado()) {
	                estaCansado++;
	                System.out.print("Esta Cansado, ");
	                contador++;
	            }
	            break;
	                    case "Esta Enfermo":
	            if (personas.getEstaEnfermo()) {
	                estaEnfermo++;
	                System.out.print("Esta Enfermo, ");
	                contador++;
	            }
	            break;
	                    case "Esta Triste":
	            if (personas.getEstaTriste()) {
	                estaTriste++;
	                System.out.print("Esta Triste, ");
	                contador++;
	            }
	            break;
	                    case "Esta Feliz":
	            if (personas.getEstaFeliz()) {
	                estaFeliz++;
	                System.out.print("Esta Feliz, ");
	                contador++;
	            }
	            break;
	                }
	                if (contador == 4) {
	                    break;
	                }
	            }
	            System.out.println("");
	        }
	        
	 	    
	        System.out.println();
	        System.out.println("REPETICION DE ATRIBUTOS");
	        System.out.println("El Atributo Tiene Espada se repite: " + alto);
	        System.out.println("El Atributo es Millonario se repite: " + millonario);
	        System.out.println("El Atributo esta Mamado se repite: " + mamado);
	        System.out.println("El Atributo esta Feo se repite: " + Feo);
	        System.out.println("El Atributo Miedo a cucarachas se repite: " + miedoCucarachas);
	        System.out.println("El Atributo esta cansado se repite: " + estaCansado);
	        System.out.println("El Atributo esta enfermo se repite: " + estaEnfermo);
	        System.out.println("El Atributo esta triste se repite: " + estaTriste);
	        System.out.println("El Atributo esta feliz se repite: " + estaFeliz);
	        System.out.println();
	       
	         
	        System.out.println("QUE COMIENCE EL JUEGO");
	        
	        int personaElegida = new Random().nextInt(10);
	        
	     
	        for (int contadorPreguntas = 0; contadorPreguntas < 3; contadorPreguntas++) {
	            System.out.println("Elija una opción para descartar jugadores:");
	            System.out.println("1 Es Alto?");
	            System.out.println("2 Es Millonario?");
	            System.out.println("3 Esta Mamado?");
	            System.out.println("4 Esta Feo?");
	            System.out.println("5 Tiene Miedo a las Cucarachas?");
	            System.out.println("6 Esta Cansado?");
	            System.out.println("7 Esta Enfermo?");
	            System.out.println("8 Esta Triste?");
	            System.out.println("9 Esta Feliz?");
	            
	            int opcion = sc.nextInt();
	            switch (opcion) {
	                case 1:
	                    for (int i = 0; i < 10; i++) {
	                    	  if (persona[i] != null && !persona[i].getAlto()) {
	                              persona[i] = null;
	                          }
	                      }
	                      break;
	                case 2:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEsMillonario()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 3:
	                		for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaMamado()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 4:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaFeo()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 5:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getMiedoCucarachas()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 6:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaCansado()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 7:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaEnfermo()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 8:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaTriste()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	case 9:
	                	for (int i = 0; i < 10; i++) {
	                		  if (persona[i] != null && !persona[i].getEstaFeliz()) {
	                	            persona[i] = null;
	                	        }
	                	    }
	                	    break;
	                	}
	         
	            int numeroPersonasElegidas = 0;
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            numeroPersonasElegidas++;
	            }
	            }
	            
	            if (numeroPersonasElegidas == 1) {
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            	System.out.println("La persona elegida es " + persona[i].getNombre());
	            	break;
	            	}
	            	}
	            	return;
	            	}
	            System.out.println("Las personas que cumplen con la caracteristica son: ");
	            for (int i = 0; i < 10; i++) {
	            if (persona[i] != null) {
	            System.out.println((i + 1) + ". " + persona[i].getNombre());
	            }
	            }
	            System.out.println("");
	            }
	        System.out.println("Elige la persona que crees que es la elegida (Introduce el numero de la persona):");
	        int eleccionUsuario = sc.nextInt();
	        eleccionUsuario--;

	      
	        if (persona[eleccionUsuario] != null) {
	            System.out.println("¡Correcto! La persona elegida es " + persona[eleccionUsuario].getNombre());
	        } else {
	            System.out.println("Incorrecto, la persona elegida no cumplia con las caracteristicas");
	        }
	        }

	        }