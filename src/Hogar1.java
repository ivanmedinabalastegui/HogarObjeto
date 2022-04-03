public class Hogar1 {
    private int numhab;
    private int numbanios;
    private int mcuadrados;
    private String piso;
    private String orientacion;
    private String garaje;
    private String patio;
    private String trastero;
    private String certificado;

    public Hogar1(int numhab, int numbanios, int mcuadrados, String piso, String orientacion, String garaje, String patio, String trastero, String certificado) {
        this.numhab = numhab;
        this.numbanios = numbanios;
        this.mcuadrados = mcuadrados;
        this.piso = piso;
        this.orientacion = orientacion;
        this.garaje = garaje;
        this.patio = patio;
        this.trastero = trastero;
        this.certificado = certificado;
    }

    public int getNumhab() {
        return numhab;
    }

    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }

    public int getNumbanios() {
        return numbanios;
    }

    public void setNumbanios(int numbanios) {
        this.numbanios = numbanios;
    }

    public int getMcuadrados() {
        return mcuadrados;
    }

    public void setMcuadrados(int mcuadrados) {
        this.mcuadrados = mcuadrados;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getTrastero() {
        return trastero;
    }

    public void setTrastero(String trastero) {
        this.trastero = trastero;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String toString() {
        return "\nNúmero habitación=" + numhab +
                "\nNúmero baños=" + numbanios +
                "\nMetros cuadrados=" + mcuadrados +
                "\nPiso=" + piso +
                "\nOrientacion=" + orientacion +
                "\nGaraje=" + garaje +
                "\nPatio=" + patio +
                "\nTrastero=" + trastero +
                "\nCertificado energético=" + certificado;
    }
}
