package br.com.vehicle.abstractfactory.veiculo;

public class MotoPopular extends MotoBase{

	@Override
	public float tempoAceleracao() {
		return 8.5f;
	}

	@Override
	public String toString() {
		return "MotoPopular tempoAceleracao= " + tempoAceleracao() + ", acelerar= " + acelerar() + ", freiar= "
				+ freiar() + ", inclinar= " + inclinar() + "";
	}

}
