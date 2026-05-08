 class Eletronico extends Produtos {

    private int voltagem;

    public Eletronico(String nome, double preco, int voltagem){
        super(nome, preco);
        this.voltagem = voltagem;
    }

    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }

    public int getVoltagem(){
        return voltagem;
    }

     @Override
     public void exibirDados() {
         System.out.println("==== CATEGORIA: ELETRONICO ====");
         super.exibirDados();
         System.out.print("| Voltagem: "+voltagem+"v");
     }
 }
