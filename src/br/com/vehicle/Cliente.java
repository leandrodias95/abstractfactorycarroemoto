package br.com.vehicle;
import br.com.vehicle.abstractfactory.veiculo.Carro;
import br.com.vehicle.abstractfactory.veiculo.Moto;
import br.com.vehicle.abstractfactory.FabricaMotoExtendida;
import br.com.vehicle.abstractfactory.FabricaCarroExtendida;

public class Cliente {
	public static void main(String args[]) {
	FabricaMotoExtendida fabricaMotoExtendida = new FabricaMotoExtendida();
	Moto motopopular = fabricaMotoExtendida.CriarMoto("popular");
	System.out.println(motopopular);
	Moto motoesportiva = fabricaMotoExtendida.CriarMoto("esportiva");
	System.out.println(motoesportiva);
	FabricaCarroExtendida fabricaCarroExtendida = new FabricaCarroExtendida();
	Carro carropopular = fabricaCarroExtendida.CriarCarro("popular");
	System.out.println(carropopular);
	Carro carroesportivo = fabricaCarroExtendida.CriarCarro("esportivo");
	System.out.println(carroesportivo);
	}

}
