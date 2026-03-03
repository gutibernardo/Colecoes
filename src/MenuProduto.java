import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduto {

    ArrayList<Produto> produtos = new ArrayList<>();

    int opcao = 1;
    String nome;
    double valor;
    int id;

    public void lerOpcao(){
        Scanner scanner = new Scanner(System.in);
        
        while (opcao != 0){
        System.out.println("---------MENU--------");
        System.out.println("1 - Adicionar Elemento");
        System.out.println("2 - Listar Elementos");
        System.out.println("3 - Remover um Produto");
        System.out.println("4 - Exbir informações da Lista");
        System.out.println("0 - Sair do Menu");
        System.out.println("Escolha uma opção: ");
        opcao = scanner.nextInt();

        if(opcao == 1){
            addProduto();

        } else if (opcao == 2){
            listarProdutos();

        } else if (opcao == 3){
            delProduto();

        } else if (opcao == 4){
            qtdProdutos();

        } else if (opcao == 0){
            System.out.println("--------SAINDO DO MENU--------");

        } else {
            System.out.println("Opção inválida!");

            }
        }
    }

    public void addProduto(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o nome do produto: ");
        nome = scanner.next();
        System.out.println("Insira o valor do produto: ");
        valor = scanner.nextDouble();
        produtos.add(new Produto(nome, valor));
    }

    public void listarProdutos(){
        for (Produto p : produtos){
                System.out.println("ID: " + produtos.indexOf(p));
                System.out.println(p.getNome());
                System.out.println(" - R$ " + p.getPreco());
            }
            System.out.println("---------------------");
    }

    public void delProduto(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o ID do produto a ser removido: ");
        id = scanner.nextInt();
        produtos.remove(id);
        System.out.println("Produto removido com sucesso!");
    }

    public void qtdProdutos(){
        System.out.println("Quantidade de produtos na lista: " + produtos.size());
    }
}
