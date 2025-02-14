package pacote;

public class Main {

	public static void main(String[] args) {
		
		
		Carro meuCarro = new Carro("Toyota Corolla", 2022);
		
		
		meuCarro.acelerar(20);
		meuCarro.acelerar(15);
		meuCarro.frear(10);
		meuCarro.frear(30);
	}

}
