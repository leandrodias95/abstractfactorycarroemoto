package br.com.vehicle.abstractfactory;

import br.com.vehicle.abstractfactory.veiculo.Moto;
import br.com.vehicle.abstractfactory.veiculo.Carro;

public interface Veiculo {
	abstract Carro  CriarCarro(String opcaoCarro);
	abstract Moto  CriarMoto(String opcaoMoto);
}
