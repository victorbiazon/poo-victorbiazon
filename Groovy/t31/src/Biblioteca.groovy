

class Biblioteca {
	
	private String nome
	private List<Estante> estantes // vetor, pois a a bibliotéca possui espaço finito
	
    def Biblioteca(String nome) {
    	this.nome = nome
    	this.estantes = new ArrayList<>()
    }
    
    def inserirEstante(Estante estante) {
       	
    		this.estantes.add(estante)
   }
    
    def Livro[] listarFilosofia() {
    	
    	for (Estante estante : estantes) {
			if(estante.getCategoria().equals(Categoria.FILOSOFIA)) {
				return estante.getLivros()
			}    		
		}  
    	null
    	
    }
    
    def Livro[] listarLiteratura() {
    	
    	for (Estante estante : estantes) {
			if(estante.getCategoria().equals(Categoria.LITERATURA)) {
				return estante.getLivros()
			}    		
		}
    	null
   }
    
    def contarCiencia() {
     	
    	for (Estante estante : estantes) {
			if(estante.getCategoria().equals(Categoria.CIENCIA)) {
				return estante.getLivros().length
			}    		
		}    
		0
    }
    
    def listarTudo() {
    
    	for (Estante estante : estantes) { //foreach para quando usa lista e for normal para vetor
			for (Livro livro : estante.getLivros()) {
				System.out.println(livro.toString())
			}
		}
    }
    
        def String getNome() {
		nome
	}

	def List<Estante> getEstantes() {
		estantes
	}

	def listarAutores(Categoria categoria) {
    
    	ArrayList<String> listAutores = new ArrayList<>()  	
    	for (Estante estante : estantes) { 
    		if(estante.getCategoria().equals(categoria)) 
    		{
    			for (Livro livro : estante.getLivros()) {
    				 listAutores.add(livro.getAutor())
    			}
    		}
			
		}    	
            listAutores
    }
	
	def ArrayList<String> listarTodosAutores() {
    
    	ArrayList<String> listTodosAutores = new ArrayList<>()   	
    	for (Estante estante : estantes) {    		
    		
    			for (Livro livro : estante.getLivros()) {
    				 listTodosAutores.add(livro.getAutor())
    			}
    		}
            listTodosAutores	
        }    	
    	
}


