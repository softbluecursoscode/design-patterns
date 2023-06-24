package softblue.designpatterns;

public class Suco extends Bebida {

	@Override
	public void adicionarAgua() {
		System.out.println("Adicionando água ao suco");
	}

	@Override
	public void adicionarSubstancia() {
		System.out.println("Adicionando suco");
	}

	@Override
	public boolean colocarAcucar() {
		return true;
	}

	@Override
	public void adicionarAcucar() {
		System.out.println("Adicionando açúcar ao suco");
	}

	@Override
	public void mexer() {
		System.out.println("Mexendo o suco");
	}	
}
