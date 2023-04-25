package br.com.vehicle.abstractfactory.veiculo;


public class CarroEsportivo extends CarroBase{

	@Override
	public float tempoAceleracao() {
		return 2.5f;
	}

	@Override
	public String toString() {
		return "CarroEsportivo tempoAceleracao= " + tempoAceleracao() + ", acelerar= " + acelerar() + ", freiar= "
				+ freiar() + ", virar= " + virar() + "";
	}
}
