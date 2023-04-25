package br.com.vehicle.abstractfactory.veiculo;

public abstract class CarroBase implements Carro {

	@Override
	public String acelerar() {
		return "Acelerando";
	}

	@Override
	public String freiar() {
		return "freiando";
	}

	@Override
	public String virar() {
		return "Virando";
	}

	public abstract float tempoAceleracao();
	
}
