package lab3;

public class test2 {
public static void main(String argv[]) throws Exception {
	
DifferentialPilot pilot = new DifferentialPilot(5.6f, 13.5f);
SoundSensor ss = new SoundSensor(SensorPort.S1);

int i = 0;
while(!ss.readValue(6)) {
	pilot.forward();
}
 if(ss.readValue(6) && i<4){
	i++;
	if(i%2 == 0) {
		pilot.rotate(90);
	}
	else {
		pilot.rotate(-90);
		pilot.forward();
	}
	
}
 
	pilot.stop();
}
}