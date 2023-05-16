package Questão02;
/*Um desenvolvedor de software precisa implementar uma funcionalidade que permita
ao usuário desfazer a última ação realizada na aplicação. Implemente uma solução em
Java que utilize pilhas para armazenar as ações realizadas pelo usuário e permite
desfazer a última ação.
Vocês devem definir a estrutura de dados para a pilha e implementar funções que
permitam inserir e remover elementos da pilha. Além disso, o aluno deve definir a
lógica de desfazer a última ação realizada pelo usuário, que consiste em remover o
último elemento inserido na pilha e executar a ação inversa. A estrutura deve permitir
desfazer até 16 ações de uma só vez, mas sempre respeitando a pilha de execuções.*/
public class Main {
    public static void main(String[] args) {
        Controle<String> controle = new Controle<>();
        controle.acao("Oi");
        controle.acao("Olá");
        controle.voltar(1);
        controle.lista.print();
    }
    
}
