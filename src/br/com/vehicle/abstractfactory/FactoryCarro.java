package br.com.vehicle.abstractfactory;

import br.com.vehicle.abstractfactory.veiculo.Carro;
import br.com.vehicle.abstractfactory.veiculo.Moto;

abstract class FactoryCarro implements Veiculo  {

	@Override
	public Carro CriarCarro(String opcaoCarro) {
		return null;
	}

	@Override
	public Moto CriarMoto(String opcaoMoto) {
		return null;
	}


	
	

}
