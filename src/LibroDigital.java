public class LibroDigital extends Contenido implements Descargable{
    private int pagina;

    public LibroDigital(String titulo, String autor, int pagina){
        super(titulo, autor);
        this.pagina = pagina;
    }

    public int getPagina(){
        return pagina;
    }

    @Override
    public String tipo(){
        return "LibroDigital";
    }

    @Override 
    public double calcularTamañoMB(){
        return pagina * 0.2;
    }
}
