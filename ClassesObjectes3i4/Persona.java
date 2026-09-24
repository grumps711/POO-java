

public class Persona {

		private int dni; 
		private String nombre;
		private Data dataNaixement;		//atribut canviat

		private static int mayoria_edad = 18;


		// constructor amb DNI, nom i data de naixement
		public Persona(int dni,  String nombre, Data dataNaixement) {
			this.nombre = nombre;
			this.dataNaixement = new Data(dataNaixement);;
			this.dni = dni;
		}
		
		// constructor amb nom i data de naixement
		public Persona(String nombre, Data dataNaixement) {
			this.nombre = nombre;
			this.dataNaixement = new Data(dataNaixement);	//copia de la data de naixement
		}
		
		//constructor de copia
		public Persona(Persona p){
			this.dni = p.dni;
			this.nombre = p.nombre;
			this.dataNaixement = new Data(p.dataNaixement);	//copia de la data de naixement
    	}


		//getters i setters

		public String getNombre() {
		return nombre;
		}

		public void setNombre(String n) {
			nombre = n; 
		}

		public static int getMayoria_edad() {
		return mayoria_edad;
		}

		public static void setMayoria_edad(int mayoria_edad) {
		Persona.mayoria_edad = mayoria_edad;
		}

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
			this.dni = dni;
		}

		public Data getDataNaixement() {
			return new Data(this.dataNaixement);
		}

		public void setDataNaixement(Data dataNaixement) {
			this.dataNaixement = new Data(dataNaixement);
		}

	}