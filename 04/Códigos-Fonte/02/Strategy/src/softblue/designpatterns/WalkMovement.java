package softblue.designpatterns;

public class WalkMovement implements Movement {

	@Override
	public void move(int distance) {
		int currentDistance = 0;
		
		while (currentDistance < distance) {
			currentDistance++;
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
			
			if (currentDistance % 20 == 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				}
				
				System.out.println("Parada para descanso");
			}
			
			System.out.println("Distância percorrida: " + currentDistance + "m");
		}
	}
}
