package softblue.designpatterns;

import softblue.designpatterns.gui.Window;


public class App {

	public static void main(String[] args) {
		
		ConsoleObserver observer = new ConsoleObserver();
		WeatherForecast.getInstance().registerObserver(observer);
		
		Window window = new Window("Temperatura", 300, 150);
		window.show();
	}
}
