#Guitarra.java
// Atividade01_POO

public class Guitarra {

    private String numeroSerie, fabricante, modelo, tipo, madeira;
    private double preco;

    public Guitarra

    (

            String numeroSerie, String fabricante,
            String modelo, String tipo,
            String madeira, double preco) {

        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
        this.madeira = madeira;
        this.preco = preco;

    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;

    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        This.fabricante = fabricante;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        This.modelo = modelo;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        This.tipo = tipo;

    }

    public String getMadeira() {
        return madeira;
    }

    public void setMadeira(String madeira) {
        This.madeira = madeira;

    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        This.preco = preco;

    }

public static   void main (String[] args) {

    Guitarra minhaGuitarra = new ("01020304", "fender", "telecaster", "eletrica", "mogno", 1500 );


    System.out.println(minhaGuitarra.getNumeroSerie());
    System.out.println(minhaGuitarra.getMadeira());
    System.out.println(minhaGuitarra.getPreco());
    System.out.println(minhaGuitarra.getTipo());
    System.out.println(minhaGuitarra.getModelo());


}

}

})

}