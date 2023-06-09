/*Uma empresa de logística precisa organizar sua frota de caminhões de forma eficiente
para realizar entregas em diferentes locais. Implemente um programa em Java que
utilize pilhas para ajudar na organização e na priorização das entregas.

Para resolver este problema, o aluno deve implementar a lógica de pilha em Java e
utilizar essa estrutura para armazenar as informações dos caminhões e das entregas. O
aluno deve criar funções que permitam inserir e remover elementos da pilha e definir a
lógica de priorização das entregas com base nas informações fornecidas. É importante
que o código esteja bem organizado e documentado para facilitar o entendimento. As
estruturas de classe do Caminhão e da carga devem ser pensadas. Quando um objeto
for colocado na pilha ele deve saber qual o nível de criticidade da sua carga.*/
public class Main {
    public static void main(String[] args){
        System.out.println("Início");
        PCarga cargas = new PCarga();
        PCaminhao caminhoes = new PCaminhao();
        cargas.addCarga("1", "Carga com produtos raros");
        caminhoes.addCaminhao(cargas.criticidade1.getCabeca().getDado(), "João, 19 anos", "Hotwells");
        
        System.out.println(cargas.criticidade1.getCabeca().getDado().getInfo());
        System.out.println(caminhoes.pilha.getCabeca().getDado().getInfoMotorista());
        System.out.println(caminhoes.pilha.getCabeca().getDado().getInfoCaminhao());
        System.out.println("fim");
    }
}
