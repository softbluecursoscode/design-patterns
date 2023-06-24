package softblue.designpatterns;

public abstract class Bebida {

	public void preparar() {
		
		adicionarAgua();
		adicionarSubstancia();
		
		if (colocarAcucar()) {
			adicionarAcucar();
		}
		
		mexer();
	}

	public abstract void adicionarAgua();
	public abstract void adicionarSubstancia();
	public abstract boolean colocarAcucar();
	public abstract void adicionarAcucar();
	public abstract void mexer();
}
