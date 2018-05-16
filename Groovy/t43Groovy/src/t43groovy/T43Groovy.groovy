class T43Groovy {
    public static void main(String[] args) {
        Produto p1 = new Produt("Chá",10,new ICMS())
        Produto p2 = new Produto("Bolacha",4,new ICMS())
        Produto p3 = new Produto("Carne",27,new IPI())
        Produto p4 = new Produto("Café",13,new IPI())
    
        Colecao c = new Colecao()
        c.adicionar(i1)
        c.adicionar(i2)
        c.adicionar(ip1)
        c.adicionar(ip2)
        c.infoProduto()
    }
}

