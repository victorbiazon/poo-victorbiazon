
public class Teste {

	public static void main(String[] args) {
		Estrela e1 = new Estrela("Dubhe",65.0,"azul");
		Estrela e2 = new Estrela("Merak",30.0,"amarela");
		Estrela e3 = new Estrela("Phecda",40.0,"rosa");
		Estrela e4 = new Estrela("Megrez",50.0,"laranja");
		Estrela e5 = new Estrela("Alioth",60.0,"marrom");
		Estrela e6 = new Estrela("Mizar",30.0,"vermelha");
		Estrela e7 = new Estrela("Alkaid ou Benetnasch",45.0,"verde");
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