package softblue.designpatterns;

public class TemperatureClassAdapter extends Temperature {

	@Override
	public void setValue(double value) {
		super.setValue(value * 9 / 5 + 32);
	}
	
	@Override
	public double getValue() {
		return (super.getValue() - 32) * 5 / 9;
	}
	
	public double getValueInFahrenheit() {
		return super.getValue();
	}
}
