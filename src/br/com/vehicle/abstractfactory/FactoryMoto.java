package br.com.vehicle.abstractfactory;

import br.com.vehicle.abstractfactory.veiculo.Moto;
import br.com.vehicle.abstractfactory.veiculo.Carro;


abstract class FactoryMoto implements Veiculo {

	@Override
	public Carro CriarCarro(String opcaoCarro) {
		return null;
	}

	@Override
	public Moto CriarMoto(String opcaoMoto) {
			return null;
	}
	
	



}
