import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private String nome;
	private List<Estante> estantes; // vetor, pois a a bibliotéca possui espaço finito
	
    public Biblioteca(String nome) {
    	this.nome = nome;
    	this.estantes = new ArrayList<>();
    }
    
    public void inserirEstante(Estante estante) {
       	
    		this.estantes.add(estante);
   }
    
    public Livro[] listarFilosofia() {
    	
    	for (Estante estante : estantes) {
			if(estante.getCategoria().equals(Categoria.FILOSOFIA)) {
				return estante.getLivros();
			}    		
		}  
    	return null;
    	
    }
    
    public Livro[] listarLiteratura() {
    	
    	for (Estante estante : estantes) {
			if(estante.getCategoria().equals(Categoria.LITERATURA)) {
				return estante.getLivros();
			}    		
		}
    	return null;
   }
    
    public int contarCiencia() {
     	
    	for (Estante estante : estantes) {
			if(estante.getCategoria().equals(Categoria.CIENCIA)) {
				return estante.getLivros().length;
			}    		
		}    
		return 0;
    }
    
    public void listarTudo() {
    
    	for (Estante estante : estantes) { //foreach para quando usa lista e for normal para vetor
			for (Livro livro : estante.getLivros()) {
				System.out.println(livro.toString());
			}
		}
    }
    
    public String getNome() {
		return nome;
	}

	public List<Estante> getEstantes() {
		return estantes;
	}

	public ArrayList<String> listarAutores(Categoria categoria) {
    
    	ArrayList<String> listAutores = new ArrayList<>();    	
    	for (Estante estante : estantes) { 
    		if(estante.getCategoria().equals(categoria)) 
    		{
    			for (Livro livro : estante.getLivros()) {
    				 listAutores.add(livro.getAutor());
    			}
    		}
			
		}    	
    	return listAutores;
    }
	
	public ArrayList<String> listarTodosAutores() {
    
    	ArrayList<String> listTodosAutores = new ArrayList<>();    	
    	for (Estante estante : estantes) {    		
    		{
    			for (Livro livro : estante.getLivros()) {
    				 listTodosAutores.add(livro.getAutor());
    			}
    		}
			
		}    	
    	return listTodosAutores;
    }
    
}
