public class Carnet {

    //Atributo
    private String numeroCarnet;
    private char tipoCarnet;             //virtual (v) o físico (f)
    private boolean estaActivo;

    //Métodos
    //Constructor
    public Carnet(
            String numeroCarnetObjeto,
            char tipoCarnetObjeto
    ){
        numeroCarnet = numeroCarnetObjeto;
        tipoCarnet = tipoCarnetObjeto;
        estaActivo = true;
    }

    public Carnet(){}

    //Getter
    public String getNumeroCarnet(){
        return numeroCarnet;
    }

    public char getTipoCarnet(){
        return tipoCarnet;
    }

    public boolean getEstaActivo(){
        return estaActivo;
    }

    //Setter
    public void setNumeroCarnet(String nuevoNumeroCarnet){
        numeroCarnet = nuevoNumeroCarnet;
    }

    public void setTipoCarnet(char nuevoTipoCarnet){
        tipoCarnet = nuevoTipoCarnet;
    }

    public void setEstaActivo(boolean nuevoEstaActivo){
        estaActivo = nuevoEstaActivo;
    }
}
