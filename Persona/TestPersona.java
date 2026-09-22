package Persona;


public class TestPersona {


		public static void main(String[] args) {
		Persona  persona1, persona2, persona3;
		
		persona1 = new Persona();
		persona1.setNombre("Adan");
		persona1.setEdad(21);
		persona1.setDni(1);
		
		persona2 = new  Persona(2, "Eva",22);
		persona3 = new  Persona("Abel",1);

		Persona persona4 = new Persona(persona3);
		
		System.out.println("Persona1: " + 
				" DNI:" +persona1.getDni() + 
				" Nombre: " +persona1.getNombre()+
				" Edad: " +  persona1.getEdad()+ 
				" Mayoria Edad: "+Persona.getMayoria_edad()); 
		
		System.out.println("Persona2: " + 
				" DNI:" +persona2.getDni() + 
				" Nombre: " +persona2.getNombre()+
				" Edad: " +  persona2.getEdad()+ 
				" Mayoria Edad: "+Persona.getMayoria_edad()); 
		
		System.out.println("Persona3: " + 
				" DNI:" +persona3.getDni() + 
				" Nombre: " +persona3.getNombre()+
				" Edad: " +  persona3.getEdad()+ 
				" Mayoria Edad: "+Persona.getMayoria_edad()); 
		
		System.out.println("Diferencia de edad entre "+persona1.getNombre()+ " y "+persona2.getNombre()+": "+ persona1.diferenciaEdad(persona2));
		System.out.println("Diferencia de edad entre "+persona1.getNombre()+ " y "+persona3.getNombre()+": "+ persona1.diferenciaEdad(persona3.getEdad()));
		

		System.out.println("Persona4: " + 
				" DNI:" +persona4.getDni() + 
				" Nombre: " +persona4.getNombre()+
				" Edad: " +  persona4.getEdad()+ 
				" Mayoria Edad: "+Persona.getMayoria_edad()); 
		}
}
