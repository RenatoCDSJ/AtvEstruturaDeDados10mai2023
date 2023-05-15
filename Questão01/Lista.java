//Nessa classe a lista encadeada vai ser usada como pilha
public class Lista<T> {
    No<T> cabeca;

    public Lista(){
        this.cabeca=null;
    }
    public No<T> getCabeca() {
        return cabeca;
    }

    public void setCabeca(No<T> cabeca) {
        this.cabeca = cabeca;
    }
//função add Pilha ira adicionar um novo nó a lista no modelo de pilha
    public void addPilha(T dado){
        No<T> no= new No<T>(dado);
        if(cabeca == null){
            cabeca = no;
        }else{
            no.setProximo(cabeca);
            cabeca = no;
        }
    }
//Função rmPilha seve para irá remover o no da lista no modelo de pilha
    public void rmPilha(){
        if(cabeca == null){
            return;
        }else{
            cabeca = cabeca.getProximo();
        }
    }

}
