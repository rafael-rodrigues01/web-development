package desafioGuilherme;

public class productModel {
    private double price;
    private String marca;
    private boolean valido;

    private String codigoDeBarra;
    private boolean embalagem;

    public productModel(double price, String marca, boolean valido, String codigoDeBarra, boolean embalagem) {
        this.price = price;
        this.marca = marca;
        this.valido = valido;
        this.codigoDeBarra = codigoDeBarra;
        this.embalagem = embalagem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public boolean isEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(boolean embalagem) {
        this.embalagem = embalagem;
    }
}
