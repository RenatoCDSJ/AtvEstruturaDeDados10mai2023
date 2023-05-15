//PCaminhao é a classe que irá sevir para organizar as pilhas de caminhao
public class PCaminhao {
    Lista<Caminhao> pilha = new Lista<>();
    public void addCaminhao(Carga carga,String infoMotorista,String infoCaminhao){
        Caminhao caminhao = new Caminhao(carga, infoMotorista, infoCaminhao);
        pilha.addPilha(caminhao);
    }
    public void rmCaminhao(){
        pilha.rmPilha();
    }
}
