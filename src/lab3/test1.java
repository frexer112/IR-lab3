package lab3;

public class test1 {
public static void main(String argv[]) throws Exception {
	
	DifferentialPilot pilot = new DifferentialPilot(5.6f, 13.5f);
	ColorSensor cs = new ColorSensor(SensorPort.S4);
	
	
		cs.setFloodlight(true);
		
		// BLUE = 2;
		while (cs.getColorID(2)) {
			
		pilot.forward();
	
}   

}
}