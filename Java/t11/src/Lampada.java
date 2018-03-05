
public class Lampada {

	boolean estado;
	int max,opcao,c=0;
	
	void a(){
		this.estado = false;   //lampada desligada		
	}
	
	void setEstado(boolean estado) {
		this.estado = estado;
		c+=1;
		if(estado == false && c<=max) 
			System.out.println("Lampada desligada");			
		else
			if(estado == true && c<=max)
			System.out.println("Lampada ligada");
			
		if(c == max)
			System.out.println("Queimou");
}
	
	boolean getEstado() {
		return this.estado;
	}
		
	void verificar() {
		if(c < max) {
			System.out.println("Lampada ainda funciona");		
		}else
			System.out.println("Lampada queimada");	
		}
}
		


