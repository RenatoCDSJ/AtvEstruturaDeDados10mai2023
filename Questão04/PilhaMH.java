package Questão04;
/*
 * Classe feita para pilha de Mágicas e Habilidades
 * tem os metodos
 * a. push: adiciona uma nova mágica ou habilidade na pilha;
 * b. pop: remove e retorna a última mágica ou habilidade adicionada na pilha;
 * c. top: retorna a última mágica ou habilidade adicionada na pilha sem removê-la;
 * d. isEmpty: retorna true se a pilha estiver vazia e false caso contrário;
 * e. clear: remove todos os elementos da pilha.
 * MagicCards do tipo terreno,
 * criatura, encantamento, artefato, planeswalker ou feitiço só podem ser colocadas na
 * pilha se a pilha estiver vazia. MagicCards de Instantâneas, Habilidades ativadas ou
 * disparadas podem ser adicionadas na pilha a qualquer momento.
 * método remover para remover uma MagicCard da pilha independentemente
 * de sua posição na pilha
 */
public class PilhaMH {
    Lista<MagicCard> lista = new Lista<>();

    public void push(MagicCard dado){
        String t = dado.getType();
        if(t=="terreno"){
            if(lista.getCabeca()==null){ 
            }else{return;}
        }else if(t=="criatura"){
            if(lista.getCabeca()==null){ 
            }else{return;}
        }else if(t=="encantamento"){
            if(lista.getCabeca()==null){ 
            }else{return;}
        }else if(t=="artefato"){
            if(lista.getCabeca()==null){ 
            }else{return;}
        }else if(t=="planeswalker"){
            if(lista.getCabeca()==null){ 
            }else{return;}
        }else if(t=="feitiço"){
            if(lista.getCabeca()==null){ 
            }else{return;}
        }
        lista.addPilha(dado);
    }
    public void pop(){
        lista.rmPilha();
        System.out.println(lista.getCabeca().getDado());
    }
    public void top(){
        System.out.println(lista.getCabeca().getDado());
    }
    public void isEmpty(){
        if(lista.getCabeca() == null){
            System.out.println("true");
        }else{
            System.out.println("flase");
        }
    }
    
    public void clear(){
        lista.setCabeca(null);
    }
    public void remover(String nome){
        if(lista.getCabeca().getDado().getName() == nome){
            lista.setCabeca(lista.getCabeca().getProximo());
        }else if(lista.getCabeca() == null){
            return;
        }else{
            No<MagicCard> no = lista.getCabeca();
            while(no.getProximo().getDado().getName() != nome){
                no = no.getProximo();
            }
            no.setProximo(no.getProximo().getProximo());
            
        }
        
    }
}
