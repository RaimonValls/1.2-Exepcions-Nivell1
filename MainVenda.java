package ExceptionsExercici1;
import java.util.List;
import java.util.ArrayList;
public class MainVenda {
    public static void main(String[] args) {
        List<Producte> productList = new ArrayList<>();
        Producte p1 = new Producte("Arrós", 1.5);
        productList.add(p1);
        Producte p2 = new Producte("Paper", 2.5);
        productList.add(p2);
        Producte p3 = new Producte("Aigua", 1.75);
        productList.add(p3);
        Venda venda = new Venda(productList);
        try {
            double total = venda.calcularTotal();
            System.out.println("Preu total de la venda: " + total);
        } catch (VendaBuidaException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Producte p5 = productList.get(5);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Excepció capturada " + ex.getMessage());
        }
        Venda vendaBuida = new Venda(new ArrayList<Producte>());
        try {
            vendaBuida.calcularTotal();
        } catch (VendaBuidaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}



