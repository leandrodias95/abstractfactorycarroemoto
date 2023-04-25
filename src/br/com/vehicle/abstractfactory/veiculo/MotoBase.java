package br.com.vehicle.abstractfactory.veiculo;

public abstract class MotoBase implements Moto{

	@Override
	public String acelerar() {
		return "Acelerando";
	}

	@Override
	public String freiar() {
		return "Freando";
	}

	@Override
	public String inclinar() {
		return "Inclinando";
	}

	public abstract float tempoAceleracao();

}
