package Questão03;
/*
 * Um aplicativo de notas precisa armazenar as notas do usuário em ordem cronológica
 * inversa, para que as notas mais recentes apareçam primeiro. Implemente uma solução
 * em Java que utilize pilhas para armazenar as notas e exibi-las em ordem inversa.
*/
public class Main {
    public static void main(String[] args) {
        NotasUsuario notas = new NotasUsuario();
        notas.addNota(10);
        notas.addNota(9);
        notas.addNota(2);
        notas.addNota(3);
        notas.addNota(5);
        notas.addNota(8);
        notas.printNotas();;
    }
}
