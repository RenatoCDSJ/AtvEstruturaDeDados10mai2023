package Questão03;
/*
 * Nessa classe a lista ja irá armazenar as notas na odem cronológica inversa atravez da função addNota
 * caso deseje remover a ultima nota exite a função rmNota
 */
public class NotasUsuario {
    Lista<Double> notas = new Lista<>();
    public void addNota(double nota){
        notas.addPilha(nota);
    }
    public void rmNota(){
        notas.rmPilha();
    }
/*Na função printNotas, havera um laço de repetição que irá tirar print de todos as notas armazenadas*/
    public void printNotas(){
        if(notas.getCabeca() == null){
            return;
        }else{
        No<Double> noAutual = notas.getCabeca();
        while(noAutual != null){
            System.out.println(noAutual.getDado());
            noAutual = noAutual.getProximo();
        }
        }
    }
}
