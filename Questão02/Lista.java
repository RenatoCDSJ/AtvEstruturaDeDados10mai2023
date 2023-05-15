package Questão02;
//Nessa classe a lista encadeada vai ser usada como pilha
public class Lista<T> {
    private No<T> cabeca;
    private int num;

    public Lista(){
        this.cabeca = null;
        this.num = 0;
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
        num++;
        if(cabeca == null){
            cabeca = no;
        }else{
            no.setProximo(cabeca);
            cabeca = no;
        }
    }
//função rmPilha seve para irá remover o no da lista no modelo de pilha
    public void rmPilha(){
        if(cabeca == null){
            return;
        }else{
            cabeca = cabeca.getProximo();
        }
        num--;
    }
//função print para mostrar a quantidade de nós dentro da lista
    public void print(){
        System.out.println(num);
    }
}