package softblue.designpatterns.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import softblue.designpatterns.TextObserver;
import softblue.designpatterns.WeatherForecast;

public class TextPanel extends JPanel {

	public TextPanel() {
		JTextField txtTemperature = new JTextField(20);
		txtTemperature.setEnabled(false);
		add(txtTemperature);
		
		TextObserver observer = new TextObserver(txtTemperature);
		WeatherForecast.getInstance().registerObserver(observer);
	}
}
