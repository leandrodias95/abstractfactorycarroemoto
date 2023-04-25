package br.com.vehicle.abstractfactory.veiculo;

public class MotoEsportiva extends MotoBase{

	@Override
	public float tempoAceleracao() {
		return 2.5f;
	}
	
	@Override
	public String toString() {
		return "MotoEsportiva tempoAceleracao= " + tempoAceleracao() + ", acelerar= " + acelerar() + ", freiar= "
				+ freiar() + ", inclinar= " + inclinar() + "";
	}
}
