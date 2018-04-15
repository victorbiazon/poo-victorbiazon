
public class Teste {

	public static void main(String[] args) {
		Estrela e1 = new Estrela("Dubhe",5600,"Amarela");
		Estrela e2 = new Estrela("Merak",7000,"Branca");
		Estrela e3 = new Estrela("Phecda",6500,"Branca");
		Estrela e4 = new Estrela("Megrez",6350,"Branca");
		Estrela e5 = new Estrela("Alioth",8000,"Branca azulada");
		Estrela e6 = new Estrela("Mizar",6200,"Branca");
		Estrela e7 = new Estrela("Alkaid ou Benetnasch",8500,"Branca azulada");
		Constelacao c = new Constelacao();									
		c.introducao();														//início do programa
		c.adicionar(e1);
		c.adicionar(e2);
		c.adicionar(e3);
		c.adicionar(e4);
		c.adicionar(e5);
		c.adicionar(e6);
		c.adicionar(e7);
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
		e4.mostrar();
		c.infoEstrelas();
		c.tempConstelacao();
	}
}