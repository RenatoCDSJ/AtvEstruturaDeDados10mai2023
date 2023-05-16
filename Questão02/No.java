package Questão02;
//Essa classe vai servir para fazer objetos que armazenem qualquer tipo de dado.
//e linka pode licar esse obejto a um outro do mesmo tipo
public class No<T>{
    private T dado;
    private No<T> proximo;
    public No(T dado){
        this.dado = dado;
        this.proximo = null;
    }
    public No(T dado, No<T> proximo){
        this.dado = dado;
        this.proximo = proximo;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    public T getDado() {
        return dado;
    }
    public void setDado(T dado) {
        this.dado = dado;
    }  
}
