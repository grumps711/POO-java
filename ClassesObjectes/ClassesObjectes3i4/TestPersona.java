

public class TestPersona {


		public static void main(String[] args) {
		Persona  persona1, persona2, persona3;
		

		//prova del constructor amb parametres DNI, nom i data de naixement

		Data data = new Data();

		data.setAny(1993);
		data.setMes(03);
		data.setDia(19);

		persona1 = new Persona(53, "Eugeni", data);


		
		//prova del constructor amb parametres nom i data de naixement

		Data data2 = new Data();

		data2.setAny(1993);
		data2.setMes(03);
		data2.setDia(19);

		persona2 = new Persona("Eugeni", data2);

		

		//prova del constructor de copia

		persona3 = new Persona(persona2);


		//prova del constructor amb parametres DNI, nom i data de naixement
		
		System.out.println("Persona1: " + 
				" DNI:" +persona1.getDni() + 
				" Nombre: " +persona1.getNombre()+
				" Data de naixement: " +  persona1.getDataNaixement()+ 
				" Mayoria Edad: "+Persona.getMayoria_edad()); 
		
		System.out.println("Persona2: " + 
				" DNI:" +persona2.getDni() + 
				" Nombre: " +persona2.getNombre()+
				" Data de naixement: " +  persona2.getDataNaixement()+ 
				" Mayoria Edad: "+Persona.getMayoria_edad()); 
		
		System.out.println("Persona3: " + 
				" DNI:" +persona3.getDni() + 
				" Nombre: " +persona3.getNombre()+
				" Data de naixement: " +  persona3.getDataNaixement()+ 
				" Mayoria Edad: "+Persona.getMayoria_edad()); 
		}
}
