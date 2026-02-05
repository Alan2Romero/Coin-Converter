import com.google.gson.Gson;

public record Moneda(
    @SerializedName("base_code")
    String public Tipo_Divisa,
    @SerializedName("conversion_rates")
    double public Tasa_de_conversion){
}