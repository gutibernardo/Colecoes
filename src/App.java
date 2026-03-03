// import java.util.ArrayList;

public class App{
    public static void main(String[] args) throws Exception {
        
        // ArrayList<Produto> produtos = new ArrayList<>();

        // produtos.add(new Produto("Notebook", 3500.00));
        // produtos.add(new Produto("Mouse", 80.00));
        // produtos.add(new Produto("Teclado", 150.00));

        // for (Produto p : produtos){
            // System.out.println(p.getNome());
            // System.out.println(" - R$ " + p.getPreco());
        // }

        MenuProduto menu = new MenuProduto();
        menu.lerOpcao();
    }
}