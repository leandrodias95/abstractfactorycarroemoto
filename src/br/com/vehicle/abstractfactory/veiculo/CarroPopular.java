package br.com.vehicle.abstractfactory.veiculo;

public class CarroPopular extends CarroBase{

	@Override
	public float tempoAceleracao() {
		return 8.5f;
	}

	@Override
	public String toString() {
		return "CarroPopular tempoAceleracao= " + tempoAceleracao() + ", acelerar= " + acelerar() + ", freiar= "
				+ freiar() + ", virar= " + virar() + "";
	}


}
