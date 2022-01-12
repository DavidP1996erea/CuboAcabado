package principal;

public class Cubo {


    // Atributos
    private String material;
    private boolean asa;
    private String color;
    private int capacidadMaxima;
    private int contenidoActual;


    // Constructor predeterminado
    public Cubo(){

    }


    // Constructor con parámetros
    public Cubo(String material, boolean asa, String color, int capacidadMaxima, int contenidoActual){

        this.material=material;
        this.asa=asa;
        this.color=color;
        this.capacidadMaxima=capacidadMaxima;
        this.contenidoActual=contenidoActual;


    }

    // Constructor copia
    public Cubo(Cubo cubo){

        this.material=cubo.getMaterial();
        this.asa=isAsa();
        this.color= cubo.getColor();
        this.capacidadMaxima=cubo.getCapacidadMaxima();
        this.contenidoActual= cubo.getContenidoActual();


    }


    // Método llenar
    public void llenar(int litros){

        if((contenidoActual+litros) > capacidadMaxima){

            System.out.println("Demasiados litros");
            contenidoActual=capacidadMaxima;
        }else{

            contenidoActual=contenidoActual+litros;

        }
    }


    // Método vaciar
    public  void vaciar(int litros){

        if(litros>contenidoActual){

            System.out.println("No hay tantos litros");

        }else{

            System.out.println("Acción realizada correctamente");

            contenidoActual=contenidoActual-litros;

        }
    }


    // Método volcar
    public void volcar( Cubo cuboDestino, int litros){

        if(cuboDestino.getCapacidadMaxima()<litros || (cuboDestino.getContenidoActual()+litros) > cuboDestino.getCapacidadMaxima()){

            System.out.println("No caben bro");
        }else {

            System.out.println("Si caben");
            cuboDestino.contenidoActual=cuboDestino.contenidoActual+litros;

            contenidoActual=contenidoActual-litros;

        }


    }


    // Métodos get y set


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAsa() {
        return asa;
    }

    public void setAsa(boolean asa) {
        this.asa = asa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getContenidoActual() {
        return contenidoActual;
    }

    public void setContenidoActual(int contenidoActual) {
        this.contenidoActual = contenidoActual;
    }
}
