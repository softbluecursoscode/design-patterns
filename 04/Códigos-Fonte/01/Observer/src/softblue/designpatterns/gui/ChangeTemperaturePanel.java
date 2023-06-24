package softblue.designpatterns.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import softblue.designpatterns.WeatherForecast;

public class ChangeTemperaturePanel extends JPanel implements ActionListener {

	private JComboBox<Integer> temperatureCbo;
	public ChangeTemperaturePanel() {

		Integer[] values = { 0, 5, 10, 15, 20, 25, 30 };
		temperatureCbo = new JComboBox<>(values);
		temperatureCbo.addActionListener(this);
		
		add(new JLabel("Temperatura:"));
		add(temperatureCbo);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Integer temperature = (Integer) temperatureCbo.getSelectedItem();
		WeatherForecast.getInstance().setTemperature(temperature);
	}
}
