package br.com.vehicle.abstractfactory.veiculo;

public interface Carro {
	String acelerar();
	String freiar();
	String virar();
	abstract float tempoAceleracao();

}
