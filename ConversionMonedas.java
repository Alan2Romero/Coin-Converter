public class ConversionMonedas.java{
    public static double USDaARS(double Cantidad, Moneda USD, Moneda ARS){
        var double monto = cantidad * (ARS.Tasa_de_conversion / USD.Tasa_de_conversion);
        return monto;
    }
    public static double ARSaUSD(double Cantidad, Moneda USD, Moneda ARS){
        var double monto = cantidad * (USD.Tasa_de_conversion / ARS.Tasa_de_conversion);
        return monto;
    }
    public static double USDaBRL(double Cantidad, Moneda USD, Moneda BRL){
        var double monto = cantidad * (BRL.Tasa_de_conversion / USD.Tasa_de_conversion);
        return monto;
    }
    public static double BRLaUSD(double Cantidad, Moneda USD, Moneda BRL){
        var double monto = cantidad * (USD.Tasa_de_conversion / BRL.Tasa_de_conversion);
        return monto;
    }
    public static double USDaCOP(double Cantidad, Moneda USD, Moneda COP){
        var double monto = cantidad * (COP.Tasa_de_conversion / USD.Tasa_de_conversion);
        return monto;
    }
    public static double COPaUSD(double Cantidad, Moneda USD, Moneda COP){
        var double monto = cantidad * (USD.Tasa_de_conversion / COP.Tasa_de_conversion);
        return monto;
    }
}