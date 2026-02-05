public class ConversorAPP{
    public static void main(String[] args){
        // Creacion de monedas
        var divisa = "USD";
        Moneda USD = ConsultaMoneda.BuscaMoneda(divisa);
        var divisa = "ARS";
        Moneda ARS = ConsultaMoneda.BuscaMoneda(divisa);
        var divisa = "BRL";
        Moneda BRL = ConsultaMoneda.BuscaMoneda(divisa);
        var divisa = "COP";
        Moneda COP = ConsultaMoneda.BuscaMoneda(divisa);

        // Menu
        Conversor.exhibirMenu(Moneda USD, Moneda ARS, Moneda BRL, Moneda COP);
        System.out.println("Gracias por utilizar nuestro servicio");
    }
}