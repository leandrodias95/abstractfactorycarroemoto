package br.com.vehicle.abstractfactory;

import br.com.vehicle.abstractfactory.veiculo.Moto;
import br.com.vehicle.abstractfactory.veiculo.MotoEsportiva;
import br.com.vehicle.abstractfactory.veiculo.MotoPopular;

public class FabricaMotoExtendida extends FactoryMoto {

	@Override
	public Moto CriarMoto(String opcaoMoto) {
		if(opcaoMoto.equals("popular")) {
			return new MotoPopular();
		}else if(opcaoMoto.equals("esportiva")) {
			return new MotoEsportiva();
		
	}
		return super.CriarMoto(opcaoMoto);
	//abdcd
	}
}