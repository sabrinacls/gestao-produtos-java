public class Main {
    public static void main (String[] args){
        Produtos[] listaDeProdutos = new Produtos[2];

        Livro livro = new Livro("Harry Potter e o Cálice de Fogo.", 75.00, "JK Rowlling");
        Luminaria luminaria = new Luminaria("Luminária de mesa.", 150.00, 220);

        listaDeProdutos[0] = livro;
        listaDeProdutos[1]= luminaria;

        for(Produtos p : listaDeProdutos ){
            p.exibirDados();
            p.desconto();

            System.out.println();
        }
    }
}