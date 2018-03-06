        
   public class Eq2Grau {

    double a,b,c,d,x1,x2;
    
    double delta(){
        d = (Math.pow(b,2)) - (4*a*c);
         d;        
    }
    
    double raiz1() {
        x1 = (-b + (Math.sqrt(d)))/(2*a);
        x1;
    }
    
    double raiz2() {
        x2 = (-b - (Math.sqrt(d)))/(2*a);
         x2;
    }
    
    void exibir() {
       println(d);
       println(x1);
       println(x2);
    }
}

     Eq2Grau e = new Eq2Grau();
        e.a = 2;
        e.b = 3;
        e.c = 1;
        e.delta();
        e.raiz1();
        e.raiz2();
        e.exibir();
