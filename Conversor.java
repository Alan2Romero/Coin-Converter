import java.util.Scanner;

 public class Conversor{
     public static void exhibirMenu(Moneda USD, Moneda ARS, Moneda BRL, Moneda COP){
         Scanner lectura = new Scanner(System.in);
         var String divisa1 = "";
         var String divisa2 = "";

         System.out.println("""
                 ****************************************************************************************
                 ¡Sea bienvenido al conversor de monedas!
                 Por favor elija la opcion que necesite
                 
                 1) Dolar USD => ARS Peso
                 2) ARS Peso => Dolar USD
                 3) Dolar USD => Real Brasileño
                 4) Real Brasileño => Dolar USD
                 5) Dolar USD => Peso Colombiano
                 6) Peso Colombiano => Dolar USD
                 7) Salir del Programa
                
                 Elija una opcion valida:
                 ****************************************************************************************
                 """);
         opcion = int.valueOf(lectura.nextLine());
         System.out.println("""
                 ****************************************************************************************
                 Por favor ingrese la cantidad de monedas a cambiar:
                 ****************************************************************************************
                 """);
         var double Cantidad = double.valueOf(lectura.nextLine());
         if(opcion == 1){
             ConversionMonedas.USDaARS(double Cantidad, Moneda USD, Moneda ARS)
         }
         if(opcion == 2){
             ConversionMonedas.ARSaUSD(double Cantidad, Moneda USD, Moneda ARS)
         }
         if(opcion == 3){
             ConversionMonedas.USDaBRL(double Cantidad, Moneda USD, Moneda BRL)
         }
         if(opcion == 4){
             ConversionMonedas.BRLaUSD(double Cantidad, Moneda USD, Moneda BRL)
         }
         if(opcion == 5){
             ConversionMonedas.USDaCOP(double Cantidad, Moneda USD, Moneda COP)
         }
         if(opcion == 6){
             ConversionMonedas.COPaUSD(double Cantidad, Moneda USD, Moneda COP)
         }
         if(opcion == 7){
         }
         else{
             System.out.println("Por favor elija una opcion valida");
             Conversor.exhibirMenu(Moneda USD, Moneda ARS, Moneda BRL, Moneda COP);
         }
     }
 }
