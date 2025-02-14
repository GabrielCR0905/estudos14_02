package pacote;

 class Carro {
	 String modelo;
	 int ano;
	 double velocidade;
	 
	 
	 
   public Carro(String modelo, int ano) {
	   this.modelo = modelo;
	   this.ano = ano;
	   this.velocidade = 0;
	   
   }
   
   public void acelerar(double aumento) {
	   velocidade += aumento ;
	   System.out.print("O Carro acelerou. Velocidade Atual: " + velocidade + "km");
	   
   }
   
   public void frear(double reducao) {
	  velocidade -= reducao;
	  if(velocidade <0) velocidade = 0;
	  
	  System.out.print("O Carro Freou. Velocidade Atual: " + velocidade + "km");
   }

}
