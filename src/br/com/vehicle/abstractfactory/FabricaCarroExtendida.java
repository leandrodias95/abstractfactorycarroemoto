package br.com.vehicle.abstractfactory;

import br.com.vehicle.abstractfactory.veiculo.Carro;
import br.com.vehicle.abstractfactory.veiculo.CarroEsportivo;
import br.com.vehicle.abstractfactory.veiculo.CarroPopular;

public class FabricaCarroExtendida extends FactoryCarro {

	@Override
	public Carro CriarCarro(String opcaoCarro) {
		if(opcaoCarro.equals("popular")) {
			return new CarroPopular();
		}else if(opcaoCarro.equals("esportivo")) {
			return new CarroEsportivo();
		
	}
		return super.CriarCarro(opcaoCarro);
	
	}
}
