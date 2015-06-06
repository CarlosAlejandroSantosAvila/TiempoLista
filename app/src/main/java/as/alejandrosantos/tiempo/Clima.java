package as.alejandrosantos.tiempo;

/**
 * Created by Alejandro Santos on 02/06/2015.
 */
public class Clima {

    private String Dia;
    private String Tiempo;
    private String Grados;
    private int Imagen;

    public Clima(String dia, String tiempo, String grados, int Imagen) {
        Dia = dia;
        Tiempo = tiempo;
        Grados = grados;
    }
    public int getImagen() {
        return Imagen;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String tiempo) {
        Tiempo = tiempo;
    }

    public String getGrados() {
        return Grados;
    }

    public void setGrados(String grados) {
        Grados = grados;
    }


    }


