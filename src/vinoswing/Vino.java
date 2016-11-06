
package vinoswing;

public class Vino {
    
    private String codigoVino;
    private String tipoVino;
    private String clacificacionVino;
    private Suelo suelo;
    private Barrica barrica;
    private Cepa cepa;

    public Vino() {
    }

    public Vino(String codigoVino, String tipoVino, String clacificacionVino, Suelo suelo, Barrica barrica, Cepa cepa) {
        this.codigoVino = codigoVino;
        this.tipoVino = tipoVino;
        this.clacificacionVino = clacificacionVino;
        this.suelo = suelo;
        this.barrica = barrica;
        this.cepa = cepa;
    }

    public String getCodigoVino() {
        return codigoVino;
    }

    public void setCodigoVino(String codigoVino) {
        this.codigoVino = codigoVino;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public String getClacificacionVino() {
        return clacificacionVino;
    }

    public void setClacificacionVino(String clacificacionVino) {
        this.clacificacionVino = clacificacionVino;
    }

    public Suelo getSuelo() {
        return suelo;
    }

    public void setSuelo(Suelo suelo) {
        this.suelo = suelo;
    }

    public Barrica getBarrica() {
        return barrica;
    }

    public void setBarrica(Barrica barrica) {
        this.barrica = barrica;
    }

    public Cepa getCepa() {
        return cepa;
    }

    public void setCepa(Cepa cepa) {
        this.cepa = cepa;
    }
    
    
    
}
