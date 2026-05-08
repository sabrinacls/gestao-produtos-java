class Livro extends Produtos{
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

     public void setAutor(String autor) {
         this.autor = autor;
     }

     public String getAutor() {
         return autor;
     }

     @Override
     public void exibirDados(){
        System.out.println("==== CATEGORIA: LIVRO ====");
        super.exibirDados();
         System.out.println("| Autor: " + autor);
     }

    @Override
     public void desconto(){
        double novoPreco = getPreco() * 0.95;
        setPreco(novoPreco);
        System.out.println("Desconto educacional aplicado com sucesso!");
        System.out.println("Novo preço: " + this.getPreco());
     }
 }
