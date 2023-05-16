package Questão02;
/*
//a classe controle permite reverter ações realizadas pelo usuario,
por meio do sistema de pilha usando lista encadeada.
//nessa classe o usuario pode escolher o tipo(String, int, objeto) de lista que vai querer controlar.
//todas as ações do usuario são armazenadas na Lista encadeada lista por meio da função "acao".
//para retornar/desfazer a ação realizada existe a função "voltar" nela vc informa quantas ações 
vc quer desfazer sendo 16 o limite.
*/
public class Controle<T> {
    Lista<T> lista = new Lista<>();
    public void acao(T dado){
        lista.addPilha(dado);
    }
    public void voltar(int vezes){
        if(vezes>0){
            for(int i = 0; i < vezes; i++){
                lista.rmPilha();
            }
        }
        else{
            return;
        }
    }
}
