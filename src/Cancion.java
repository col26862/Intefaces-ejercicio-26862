public class Cancion extends Contenido implements Reproducible, Descargable{

    private int duracion;

    public Cancion(String titulo, String autor ,int duracion){
        super(titulo, autor);
        this.duracion = duracion;
    }

    @Override
    public String tipo(){
        return "Cancion";
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo canción" + getAutor());
    }

    @Override 
    public int getDuracionSeg(){
        return duracion;
    }

    @Override 
    public double calcularTamañoMB(){
        return (duracion/ 60.0) * 1.5;
    }
}
