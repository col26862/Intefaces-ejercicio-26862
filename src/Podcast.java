public class Podcast extends Contenido implements Descargable, Reproducible{
    private int duracion;
    private int episodio;

    public Podcast(String titulo, String autor, int duracion, int episodio){
        super(titulo, autor);
        this.duracion = duracion;
        this.episodio = episodio;
    }

    public int getEpisodio(){
        return episodio;
    }

    @Override
    public String tipo(){
        return "Pocast";
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo podcast" + getTitulo() + ", episodio" + episodio);
    }

    @Override
    public int getDuracionSeg(){
        return duracion;
    }

    @Override
    public double calcularTamañoMB(){
        return (duracion / 60.0) * 1.0;
    }
}
