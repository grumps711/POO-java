
public class Test {

	public static void main(String[] args) {
		// Localitzacions 
		Localitzacio reactor1 = new Localitzacio("Reactor 1",40.4165,2.5025, 66); 
		Localitzacio reactor2 = new Localitzacio("Reactor 2",40.3818,2.1685, 13); 
		Localitzacio reactor3 = new Localitzacio("Reactor 3",40.3828,2.1685, 11); 

		//Sensors
		Sensor sensor1 = new Sensor (1,0,70);
		Sensor sensor2 = new Sensor (2, 0,42);
		Sensor sensor3 = new Sensor (3,0, 14);
		
		//Punts Control
		PuntControl[] pcs=new PuntControl[3];
		pcs[0]=new PuntControl (1, reactor1,sensor1);
		pcs[1]=new PuntControl (2, reactor2,sensor2);		
		pcs[2]=new PuntControl (3, reactor3,sensor3);
		
		//Planta Industrial		
		PlantaIndustrial pi=new PlantaIndustrial("Planta de prova",pcs);
		
		System.out.println(pi.informeDiari());		
		System.out.println(pi.informeDiari());		
		System.out.println(pi.informeDiari());		
		System.out.println(pi.informeDiari());
		
		pi.canviSensorPC(1, new Sensor(4,0,78));
		pi.canviSensorPC(2, new Sensor(5,0,82));
		pi.canviSensorPC(3, new Sensor(6,0,12));
		
		System.out.println(pi.informeDiari());
		
		pi.canviLocalitzacioPC(2, new Localitzacio("Reactor 4",40.3868,2.1985, 14));
		
		System.out.println(pi.informeDiari());
		
	}

}
