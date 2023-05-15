//a classe caminhão irá conter a carga informações do motorista e do caminhão 
public class Caminhao {
    private Carga carga;
    private String infoMotorista;
    private String infoCaminhao;
    public Carga getCarga() {
        return carga;
    }
    public void setCarga(Carga carga) {
        this.carga = carga;
    }
    public String getInfoMotorista() {
        return infoMotorista;
    }
    public void setInfoMotorista(String infoMotorista) {
        this.infoMotorista = infoMotorista;
    }
    public String getInfoCaminhao() {
        return infoCaminhao;
    }
    public void setInfoCaminhao(String infoCaminhao) {
        this.infoCaminhao = infoCaminhao;
    }
     //O contrutor esta recebendo os parâmetros iniciais do objeto caminhão(carga, informações do motorista e do caminhão)
    public Caminhao(Carga carga,String infoMotorista,String infoCaminhao){
        this.carga = carga;
        this.infoMotorista = infoMotorista;
        this.infoCaminhao = infoCaminhao;
    }
    
}
