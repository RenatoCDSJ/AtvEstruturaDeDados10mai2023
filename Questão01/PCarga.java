//PCaraga é a classe que irá sevir para organizar as pilhas de cargas por criticidade(1,2,3), sendo 1 mais critico que o 2 que é mais critico que o 3
public class PCarga {
    Lista<Carga> criticidade1 = new Lista<>();
    Lista<Carga> criticidade2 = new Lista<>();
    Lista<Carga> criticidade3 = new Lista<>();
    public void addCarga(String criticidade, String info){
        Carga carga = new Carga(criticidade, info);
        if(criticidade == "1"){
            criticidade1.addPilha(carga);
        }else if(criticidade == "2"){
            criticidade2.addPilha(carga);
        }else if(criticidade == "3"){
            criticidade3.addPilha(carga);
        }else{
            return;
        }
    }
    public void rmCarga(String criticidade){
        if(criticidade == "1"){
            criticidade1.rmPilha();
        }else if(criticidade == "2"){
            criticidade2.rmPilha();
        }else if(criticidade == "3"){
            criticidade3.rmPilha();
        }else{
            return;
        }
    }
}
