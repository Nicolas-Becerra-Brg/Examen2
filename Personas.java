package ejercicios_random;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public abstract class Personas {
		
		private static String[] nombres = {"Andy", "Woody", "Buzz", "Motorolo", "Sandalio", "Masiosare", "Lupe", "Aylen Tejas", "Miguel Hidalgo y Costilla", "Agripino" };
		private static String[] atributos = {"lentes", "Proceso_legal_pendiente", "Cabello_Largo", "Guerrero_Dragon", "Pelon", "Huele_feo", "otaku", "Come_chetos", "Es_alto", "Tiene_40", "Es_feo", "Es_presidente"};
		private static String[] atributos_copy = {"lentes", "Proceso_legal_pendiente", "Cabello_Largo", "Guerrero_Dragon", "Pelon", "Huele_feo", "otaku", "Come_chetos"};
		private String atributo, atributo_2, atributo_3, atributo_4;
		private String nombre;   
		private static List<String> nombres_rand = new ArrayList<String>();
		private static List<String> atributos_rand = new ArrayList<String>();
		Random rand = new Random();

		
		static {
		    for (String nombre : nombres) {
		        nombres_rand.add(nombre);
		    }
		    Collections.shuffle(nombres_rand, new Random());
		    
		}
		static {
		    for (String atributo : atributos) {
		        atributos_rand.add(atributo);
		        
		    }
		    Collections.shuffle(atributos_rand, new Random());

		}
		static {
		    for (String atributo_2 : atributos) {
		        atributos_rand.add(atributo_2);
		    }
		    Collections.shuffle(atributos_rand, new Random());
		    
		}
		static {
		    for (String atributo_3 : atributos) {
		        atributos_rand.add(atributo_3);
		    }
		    Collections.shuffle(atributos_rand, new Random());
		    
		}
		static {
		    for (String atributo_4 : atributos) {
		        atributos_rand.add(atributo_4);
		    }
		    Collections.shuffle(atributos_rand, new Random());
		    
		}
		

		public Personas() {	 
		if(nombres_rand.size() != 0) {
			this.nombre = nombres_rand.remove(0);}
		if(atributos_rand.size() != 0) { 
			this.atributo = atributos_rand.remove(0);}
		if(atributos_rand.size() != 0) { 
			this.atributo_2 = atributos_rand.remove(0);}
		if(atributos_rand.size() != 0) { 
			this.atributo_3 = atributos_rand.remove(0);}
		if(atributos_rand.size() != 0) { 
			this.atributo_4 = atributos_rand.remove(0);}
		
		/*int rando_num = rand.nextInt(atributos.length);
		int top;
		top = rando_num;
		atributo = atributos[top];
		
		int rando_num2 = rand.nextInt(atributos_2.length);
		int top2;
		top2 = rando_num2;
		atributo_2= atributos_2[top2];
		
		int rando_num3 = rand.nextInt(atributos_3.length);
		int top3;
		top3 = rando_num3;
		atributo_3 = atributos_3[top3];
		
		int rando_num4 = rand.nextInt(atributos_4.length);
		int top4;
		top4 = rando_num4 ;
		atributo_4 = atributos_4[top4];*/
		
		}
		
				
		    public String get_nombre () { return nombre; }
		    public String get_atributo () { return atributo; }
		    public String get_atributo2 () { return atributo_2; }	
		    public String get_atributo3 () { return atributo_3; }	
		    public String get_atributo4 () { return atributo_4; }	
}


/*private static List<String> nombres_rand = new ArrayList<String>();
static {
    for (String nombre : nombres) {
        nombres_rand.add(nombre);
    }
    Collections.shuffle(nombres_rand, new Random());
    
}*/

/*this.nombre = nombres_rand.remove(0);*/



/*int rando_num = rand.nextInt(nombres.length);
int top;
top = rando_num;
nombre = nombres[top];*/



/*int rando_num = rand.nextInt(atributos.length);
int top;
top = rando_num;
atributo = atributos[top];

int rando_num2 = rand.nextInt(atributos_2.length);
int top2;
top2 = rando_num2;
atributo_2= atributos_2[top2];

int rando_num3 = rand.nextInt(atributos_3.length);
int top3;
top3 = rando_num3;
atributo_3 = atributos_3[top3];

int rando_num4 = rand.nextInt(atributos_4.length);
int top4;
top4 = rando_num4 ;
atributo_4 = atributos_4[top4];*/
















/*this.atributo_1 = rand.nextBoolean();
this.atributo_2 = rand.nextBoolean();
this.atributo_3 = rand.nextBoolean();
this.atributo_4 = rand.nextBoolean();*/

/*public boolean get_atributo_1 () {
return atributo_1;
}
public boolean get_atributo_2 () {
return atributo_2;
}
public boolean get_atributo_3 () {
return atributo_3;
}
public boolean get_atributo_4 () {
return atributo_4;
}*/

/*public void Push(char value){

if(top==max){
  return;
}

stack[top]= value;
top ++;*/
