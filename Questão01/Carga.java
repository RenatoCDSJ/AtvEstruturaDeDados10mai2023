//Classe carga irá conter informações e criticidade da carga
public class Carga {
    private String criticidade;
    private String info;
    public String getCriticidade() {
        return criticidade;
    }
    public void setCriticidade(String criticidade) {
        this.criticidade = criticidade;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    //o construtor está recebendo os parâmetros inicias do objeto
    public Carga(String criticidade, String info){
        this.criticidade = criticidade;
        this.info = info;
    }
}
