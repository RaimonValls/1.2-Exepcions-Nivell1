package ExceptionsExercici1;
import java.util.List;
import java.util.ArrayList;
    public class Venda {
        private List<Producte> productList;
        private double totalPrice;

        public Venda(List<Producte> productList) {
            this.productList = productList;
            this.totalPrice = 0;
        }
        public double calcularTotal() throws VendaBuidaException{
            if (this.productList.isEmpty()) {
                throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
            }
            double total = 0;
            for (int i=0; i<this.productList.size(); i++) {
                total += productList.get(i).getPrice();
                totalPrice=total;
            }
            return totalPrice;
        }
    }


