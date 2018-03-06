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
            println("Lampada desligada");            
        else
            if(estado == true && c<=max)
            println("Lampada ligada");
            
        if(c == max)
            println("Queimou");
}
    
    boolean getEstado() {
        this.estado;
    }
        
    void verificar() {
        if(c <= max) {
           println("Lampada ainda funciona");        
        }else
           println("Lampada queimada");    
        }
}

Lampada l = new Lampada();
        
        l.max = 7;

        l.setEstado(true);
        l.setEstado(false);
        l.verificar();
        l.setEstado(true);
        l.setEstado(false);
        l.verificar();
        l.setEstado(true);
        l.setEstado(false);
        l.verificar();
        l.setEstado(true);
        l.setEstado(false);
        l.verificar();
        l.setEstado(true);
        l.setEstado(false);
        l.verificar();        